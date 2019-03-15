import java.util.ArrayList;
import java.util.List;

public class Instance {
	String name;
	double serviceRate;
	int arrivalRate;
	
	int currentServers;
	int additionalServers = 0; // for optimization purposes
	
	// Instance metrics
	int minRequiredServers;
	double rho;
	double queueLength;
	double queueWaitingTime;
	double sojournTime;
	
	// Features
	List<Feature> features = new ArrayList<Feature>();
	List<Feature> featureSequences = new ArrayList<Feature>();
	
	public Instance(String name) {
		this.name = name;
//		this.serviceRate = serviceRate;
	}
	
//	public Instance(String name, List<Feature> features) {
//		this.name = name;
//		this.features = features;
//	}
	
	public void AddFeature(Feature feature) {
		this.features.add(feature);
	}
}

class FeatureSequence {
	Scenario scenario;
	Feature feature;
	
	public FeatureSequence(Scenario scenario, Feature feature) {
		this.scenario = scenario;
		this.feature = feature;
	}
}
