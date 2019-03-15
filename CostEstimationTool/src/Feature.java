
public class Feature {
	String name;
	Metrics metrics;
	
	public Feature(String name) {
		this.name = name;
		this.metrics = new Metrics(name);	
	}
}

//class User {
//	public User() {
//		
//	}
//}