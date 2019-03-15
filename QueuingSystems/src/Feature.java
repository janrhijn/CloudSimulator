
public class Feature {
	String name;
	int mu;
	boolean store;
	
	public Feature(String name, int mu, boolean store) {
		this.name = name;
		this.mu = mu;
		this.store = store;
	}
	
	// Compute feature
	public Feature(String name, int mu) {
		this.name = name;
		this.mu = mu;
		this.store = false;
	}
	
	// Store feature
	public Feature(String name, boolean store) {
		this.name = name;
		this.mu = 0;
		this.store = store;
	}
	
	// Connector feature
	public Feature(String name) {
		this.name = name;
		this.mu = 0;
		this.store = false;
	}
}
