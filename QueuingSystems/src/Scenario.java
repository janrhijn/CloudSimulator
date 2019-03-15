import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;

public class Scenario {
	String name;
	int arrivalRate;
//	LinkedList<Feature> featureDependancyGraph = new LinkedList<Feature>();
	List<DataFlow> featureGraph = new ArrayList<DataFlow>();
//	double totalSojournTime;
	
	public Scenario(String name, int arrivalRate) {
		this.name = name;
		this.arrivalRate = arrivalRate;
	}
	
//	public void AddFeature(Feature feature) {
//		this.featureDependancyGraph.add(feature);
//	}
	
	public void AddDataFlow(String name, Feature sender, Feature receiver, int data) {
		DataFlow df = new DataFlow(name, sender, receiver, data);
		this.featureGraph.add(df);
	}
	
//	public void AddSojournTime(double sojournTime) {
//		this.totalSojournTime += sojournTime;
//	}
}

class DataFlow {
	String name;
	Feature sender, receiver;
	int data;
	
	public DataFlow(String name, Feature sender, Feature receiver, int data) {
		this.name = name;
		this.sender = sender;
		this.receiver = receiver;
		this.data = data;
	}
}
