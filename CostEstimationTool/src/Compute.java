//import java.util.List;

public class Compute extends Feature {
	int processDemand;
	int mu;

	public Compute(String name, int processDemand) {
		super(name);
		
		this.processDemand = processDemand;
		this.mu = 1000/processDemand;
	}
		
	public int Run(int arrivalRate) {
		this.metrics.addRequest(arrivalRate);
		return this.processDemand * arrivalRate;
	}
}
