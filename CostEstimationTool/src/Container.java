import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
//import java.util.Math;

public class Container {
	String name; // Name of container
	int processPower; // Process power per VM for this container
	List<Compute> compute = new ArrayList<Compute>(); // List of Compute features belonging to this container
	List<Storage> storage = new ArrayList<Storage>(); // List of Storage features belonging to this container
	List<Feature> features = new ArrayList<Feature>(); // Composed list of all features belonging to this container
	Metrics metrics;
	PriceStructure priceStructure;
	double maxUtilization;
	double maxMeanWaitingTime;
	double maxMeanSoujournTime;
	
	// Constructor of Container class
	public Container(String name, int processPower) {
		this.name = name;
		this.processPower = processPower;
		this.metrics = new Metrics(name);
		this.priceStructure = new PriceStructure();
	}
	
	public void AddCompute(Compute compute) {
		this.compute.add(compute);
		this.features.add(compute);
	}
	
	public void AddStorage(Storage storage) {
		this.storage.add(storage);
		this.features.add(storage);
	}
	
	public void AddFeature(Feature feature) {
		this.features.add(feature);
	}
	
	public void Run(List<Scenario> scenarios) {
		this.metrics.duration++;
		int totalProcessDemand = 0;
//		int totalArrivalRate = 0;
		// Loop throug all scenarios
		for(Scenario scenario:scenarios) {
//			System.out.println("Scenario name: " + scenario.scenarioName +  " Arrival rate: " + scenario.arrivalRate);
			double scenarioDemand = 0;
			// Loop trough all DataFlows of concerning scenario
			for(DataFlow df:scenario.DependencyGraph) {
				processDataTransfer(df, scenario);
//				totalArrivalRate += scenario.arrivalRate;
				
				// Run Compute features in Container
				for(Compute c:compute) {
					if(df.receiver.equals(c)) {
						scenarioDemand += c.mu;
						totalProcessDemand = totalProcessDemand + c.Run(scenario.arrivalRate);
					}
				}
				
				// Run storage features in Container
				for(Storage s:storage) {
					if(df.receiver.equals(s)) {
						s.metrics.addStorage((int) s.Run(scenario.arrivalRate, df.data));
						this.metrics.addStorage((int) s.Run(scenario.arrivalRate, df.data));
					}					
				}
			}
			
			System.out.println(scenario.scenarioName + " " + this.name + " " + scenarioDemand);
		}
		
		int requiredVM = AutoScale(totalProcessDemand, this.processPower);
		
		this.metrics.addUnitRun(requiredVM);
	}
		
	// Autoscaler of vm's
	public int AutoScale(double totalProcessDemand, double processPower) {
		// TODO more advanced algorithm, literature review
		double threshold = 0.7;
		int autoScaleVM = (int) Math.ceil(totalProcessDemand / processPower / threshold);
		
		if(autoScaleVM <= 0) {
			autoScaleVM = 1;
		}
		
		return (int) autoScaleVM;
	}
	
	// List all DataFlow from scenarios
//	public List<DataFlow> listDataFlows(List<Scenario> scenarios) {
//		List<DataFlow> dataFlowList = new ArrayList<DataFlow>();
//		
//		for(Scenario scenario:scenarios) {
//			for(DataFlow dataFlow:scenario.DataFlows) {
//				dataFlowList.add(dataFlow);
//			}
//		}
//
//		return dataFlowList;
//	}
	
//	static List<Feature> listFeatures(List<Compute> compute, List<Storage> storage) {
//		List<Feature> featureList = new ArrayList<Feature>();
//		
//		for(Compute c:compute) {
//			System.out.println(c);
//			featureList.add(c);
//		}
//		
//		for(Storage s:storage) {
//			System.out.println(s);
//			featureList.add(s);
//		}
//		
//		return featureList;
//	}
	
	public void processDataTransfer(DataFlow dataFlow, Scenario scenario) {
//		This is 5x times slower
//		List<Feature> features = new ArrayList<Feature>();
//		features.addAll(this.Compute);
//		features.addAll(this.Storage);
		
		for(Feature feature:this.features) {
			if(dataFlow.receiver.equals(feature) && !this.features.contains(dataFlow.sender)) {
				// Data In
//				System.out.println("Receiver: " + feature.name + ", DataFlow: " + dataFlow.name + " Sender: " + dataFlow.sender.name);
				this.metrics.addDataIn(dataFlow.data * scenario.arrivalRate);
				this.metrics.addRequest(scenario.arrivalRate);
				
			} else if(dataFlow.sender.equals(feature)) {
				// Data out
//				System.out.println("Sender: " + feature.name + " DataFlow: " + dataFlow.name + " Receiver: " + dataFlow.receiver.name);
				this.metrics.addDataOut(dataFlow.data * scenario.arrivalRate);
			} else if(dataFlow.receiver.equals(feature) && this.features.contains(dataFlow.sender)) {
				// Data inter
//				System.out.println("Inter: " + feature.name + " DataFlow: " + dataFlow.name);
				this.metrics.addDataInter(dataFlow.data * scenario.arrivalRate);
			}
		}
	}
}
