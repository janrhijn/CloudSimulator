import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenerateDeployments {
	List<Feature> features;
	List<List<List<Feature>>> possibleDeployments = new ArrayList<List<List<Feature>>>();
	
	
	public GenerateDeployments() {
		System.out.println("Init deployments");
	}
	
	public void Generate(List<Feature> features) {
		this.features = features;
//		System.out.println(features);
		
		List<Feature> featureSide = new ArrayList<Feature>();
		featureSide.add(this.features.get(0));
//		featureSide.add(this.features.get(2));
//		featureSide.add(this.features.get(4));
		Merge(featureSide);
		
		System.out.println(possibleDeployments);
		
	}

	public void Merge(List<Feature> featureBase) {
		List<Feature> featuresRest = new ArrayList<Feature>();
		featuresRest.addAll(this.features);
		for(Feature f:featureBase) {
			featuresRest.remove(f);
		}
		
		for(int i = 0; i < featuresRest.size(); i++) {
			List<Feature> oneSide = new ArrayList<Feature>();
			oneSide.addAll(featureBase);
			oneSide.add(featuresRest.get(i));
//			Split(oneSide);
//			System.out.println(Split(oneSide));
			this.possibleDeployments.add(Split(oneSide));
//			System.out.println("Merge Deployment " + FeaturesToString(featureBase) + " " + featuresRest.get(i).name);
		}
	}
	
	public List<List<Feature>> Split(List<Feature> featuresSplit) {
		System.out.println("Side A: " + FeaturesToString(featuresSplit));
//		List<Feature> featuresAll = this.features;
		List<Feature> featuresAll = new ArrayList<Feature>();
		featuresAll.addAll(this.features);
		
		Iterator<Feature> itr = featuresAll.iterator();      
		while(itr.hasNext()) {
			Feature feature = itr.next();

			if(featuresSplit.contains(feature))
				itr.remove();
		}
		
		System.out.println("Side B: " + FeaturesToString(featuresAll));
		
		List<List<Feature>> deployment = new ArrayList<List<Feature>>();
		deployment.add(featuresSplit);
		deployment.add(featuresAll);
		
		return deployment;
	}
	
	public String FeaturesToString(List<Feature> features) {
		String featuresString = "";
		for(Feature f:features) {
			featuresString += f.name + " ";
		}
		
		return featuresString;
	}

}
