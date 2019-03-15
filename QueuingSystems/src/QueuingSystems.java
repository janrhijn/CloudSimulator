import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class QueuingSystems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		QueueingNode QN = new QueueingNode();
//		GenerateDeployments GD = new GenerateDeployments();
//		GD.Generate(features);
		
		// Init Features
		Feature source = new Feature("Source");
		Feature sink = new Feature("Sink");
		Feature featureA = new Feature("featureA", 10);
		Feature featureB = new Feature("featureB", 20);
		Feature featureC = new Feature("featureC", 15);
		Feature featureD = new Feature("featureD", 10);
		Feature featureE = new Feature("featureE", 15);
		Feature featureF = new Feature("featureF", 15);
		Feature featureG = new Feature("featureG", 18);
		Feature featureH = new Feature("featureH", 12);
		Feature featureI = new Feature("featureI", 10);
		
//		List<Feature> features = new ArrayList<Feature>();
//		features.add(featureA);
//		features.add(featureB);
//		features.add(featureC);
//		features.add(featureD);
//		features.add(featureE);
//		features.add(featureF);
//		features.add(featureG);
//		features.add(featureH);
//		features.add(featureI);

		// Init Scenario
		Scenario scene_1 = new Scenario("Scenario 1", 10);
		scene_1.AddDataFlow("1", source, featureA, 10);
		scene_1.AddDataFlow("2", featureA, featureD, 10);
		scene_1.AddDataFlow("3", featureD, featureI, 10);
		scene_1.AddDataFlow("4", featureI, sink, 10);
		
		Scenario scene_2 = new Scenario("Scenario 2", 5);
		scene_2.AddDataFlow("5", source, featureA, 10);
		scene_2.AddDataFlow("6", featureA, featureB, 10);
		scene_2.AddDataFlow("7", featureB, featureG, 10);
		scene_2.AddDataFlow("8", featureG, featureF, 10);
		scene_2.AddDataFlow("8", featureF, featureH, 10);
		scene_2.AddDataFlow("9", featureH, sink, 10);
		
		Scenario scene_3 = new Scenario("Scenario 3", 15);
		scene_3.AddDataFlow("10", source, featureD, 10);
		scene_3.AddDataFlow("11", featureD, featureE, 10);
		scene_3.AddDataFlow("12", featureE, featureH, 10);
		scene_3.AddDataFlow("12", featureH, featureE, 10);
		scene_3.AddDataFlow("13", featureE, sink, 10);
		
		Scenario scene_4 = new Scenario("Scenario 4", 20);
		scene_4.AddDataFlow("14", sink, featureC, 10);
		scene_4.AddDataFlow("15", featureC, featureF, 10);
		scene_4.AddDataFlow("16", featureF, featureI, 10);
		scene_4.AddDataFlow("17", featureI, source, 10);
		
		List<Scenario> scenarios = new ArrayList<Scenario>();
		scenarios.add(scene_1);
		scenarios.add(scene_2);
		scenarios.add(scene_3);
		scenarios.add(scene_4);
		
		// Init Cloud Instances
		Instance instanceA = new Instance("Instance A");
		instanceA.AddFeature(featureA);
		Instance instanceB = new Instance("Instance B");
		instanceB.AddFeature(featureB);
		instanceB.AddFeature(featureC);
		Instance instanceC = new Instance("Instance C");
		instanceC.AddFeature(featureD);
		instanceC.AddFeature(featureE);
		Instance instanceD = new Instance("Instance D");
		instanceD.AddFeature(featureF);
		instanceD.AddFeature(featureG);
		instanceD.AddFeature(featureH);
		instanceD.AddFeature(featureI);
		
		List<Instance> instances = new ArrayList<Instance>();
		instances.add(instanceA);
		instances.add(instanceB);
		instances.add(instanceC);
		instances.add(instanceD);
		
		
//		for(Instance instance:instances) {
////			List<List<Feature>> instanceFeatureSequence = new ArrayList<List<Feature>>();
//			List<Feature> computeFeatureSequence = new ArrayList<Feature>();
//			
//			for(Scenario scenario:scenarios) {
//				List<Feature> featureSequence = new ArrayList<Feature>();
//				
//				
//				for(int i = 0; i< scenario.featureGraph.size(); i++) {
//					DataFlow df = scenario.featureGraph.get(i); // Init current DataFlow
//					if(instance.features.contains(df.receiver)) {
//						
//						System.out.println(instance.name + " " + scenario.name + " " + df.receiver.name);
//						
//						DataFlow nextDF = scenario.featureGraph.get(i + 1); // Init next DataFlow
//						
//						if(instance.features.contains(nextDF.receiver)) {
//							// Merge Feature with next
//							System.out.println("Sequence " + df.receiver.name + nextDF.receiver.name);
//						} else {
//							// New Feature
//							featureSequence.add(df.receiver);
//						}
//					}
//					
//				}
//				
//			}
//			
//			
//		}
		
//		List<Feature> sequenceList = new ArrayList<Feature>();
		
		for(Instance instance:instances) {
			System.out.println(instance.name);
			List<List<Feature>> instanceSequenceList = new ArrayList<List<Feature>>();
			
			for(Scenario scene:scenarios) {
				List<Feature> sequenceList = new LinkedList<Feature>();
				
//				for(int i = 0; i< scene.featureGraph.size(); i++) {
//					DataFlow df = scene.featureGraph.get(i); // Init current DataFlow
				for(DataFlow df:scene.featureGraph) {
					if(instance.features.contains(df.receiver) && !instance.features.contains(df.sender)) {
						sequenceList.add(df.receiver);
						System.out.println("First receiver " + df.receiver.name + " in " + scene.name);
					} else if(instance.features.contains(df.receiver) && instance.features.contains(df.sender)) {
						sequenceList.add(df.receiver);
						
						System.out.println("Inter receiver " + df.sender.name + " " + df.receiver.name + " in " + scene.name);
					} else if(!instance.features.contains(df.receiver) && instance.features.contains(df.sender)) {
						instanceSequenceList.add(sequenceList);
//						System.out.println(sequenceList);
//						sequenceList.clear();
						System.out.println("Sender out");
					}
				}
			}
			System.out.println(instanceSequenceList);
		}
		
		// Init VM's
//		List<Feature> server_1Features = new ArrayList<Feature>();
//		server_1Features.add(featureD);
//		server_1Features.add(featureE);
//		Instance server_1 = new Instance("Server 1", server_1Features);
//		
//		List<Feature> server_2Features = new ArrayList<Feature>();
//		server_2Features.add(featureA);
//		server_2Features.add(featureB);
//		server_2Features.add(featureC);
//		server_2Features.add(featureI);
//		Instance server_2 = new Instance("Server 2", server_2Features);
//		
//		List<Feature> server_3Features = new ArrayList<Feature>();
//		server_3Features.add(featureF);
//		server_3Features.add(featureG);
//		server_3Features.add(featureH);
//		Instance server_3 = new Instance("Server 4", server_3Features);
//		
//		List<Instance> VPC = new ArrayList<Instance>();
//		VPC.add(server_1);
//		VPC.add(server_2);
//		VPC.add(server_3);
//		
//		for(Instance server:VPC) {
//			System.out.println(server.name);
//			for(Scenario scene:scenarios) {
//				System.out.println(scene.name);
////				double muByScene = 0;
//				for(DataFlow df:scene.featureGraph) {
//					System.out.println(df.name);
////					Feature currentFeature = f;
////					System.out.println(df.name);
//					for(Feature sF:server.features) {
//						if(sF.equals(df.receiver)) {
////							muByScene += Math.pow(sF.mu, -1);
//							System.out.println(sF.name + " " + df.name + " " + sF.mu);
//						}
//					}
//
//				}
////				System.out.println(Math.pow(muByScene, -1));
////				System.out.println(server.Run(10, Math.pow(muByScene, -1), 0));
//			}
//		}
		
//		for(int i = 0; i < features.size(); i++) {
//			List<List<Feature>> deploymentConfiguration = new ArrayList<List<Feature>>();
//			System.out.println("Run " + i);
//			List<Feature> server1 = new ArrayList<Feature>();
//			server1.addAll(features);
//			server1.remove(i);
//			List<Feature> server2 = new ArrayList<Feature>();
//			server2.add(features.get(i));
//
//			deploymentConfiguration.add(server1);
//			deploymentConfiguration.add(server2);
//			
//			double totalSojournTime = 0;
//			int servers = 0;
//			
//			for(List<Feature> server:deploymentConfiguration) {
//				for(Feature f:server)
//					System.out.println(f.name + " " + f.mu);
//				
//				Instance instance = new Instance("Instance", server);
//				instance.Run(10, 0);
//				totalSojournTime += instance.sojournTime;
//				servers += instance.currentServers;
//				System.out.println(instance.Run(10, 0));
////				System.out.println("Mu " +instance.CalculateServiceRate(server));
//			}
//			
//			System.out.println("\tServers " + servers + " totalSojournTime " + totalSojournTime);
//		}
//
//		System.out.println("Run 5");
//		double totalSojournTime = 0;
//		int servers = 0;
//		for(Feature f:features) {
//			System.out.println(f.name + " " + f.mu);
//			List<Feature> server = new ArrayList<Feature>();
//			server.add(f);
//			Instance instance = new Instance("Instance", server);
//			System.out.println(instance.Run(10, 0));
//			totalSojournTime += instance.sojournTime;
//			servers += instance.currentServers;
////			System.out.println("Servers " + instance.currentServers + " totalSojournTime " + instance.sojournTime);
//		}
//		System.out.println("\tServers " + servers + " totalSojournTime " + totalSojournTime);
//			
//		System.out.println("Run 6"); 
//		Instance instance = new Instance("Instance", features);
//		
//		for(Feature f:features)
//			System.out.println(f.name + " " + f.mu);
//		System.out.println(instance.Run(10, 0));
//		System.out.println("\tServers " + instance.currentServers + " totalSojournTime " + instance.sojournTime);
	}

}
