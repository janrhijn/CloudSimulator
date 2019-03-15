
public class Storage extends Feature {
	public Storage(String name) {
		super(name);
	}
	
	public long Run(int arrivalRate, int data) {
		long storageDemand = (long) data * arrivalRate;
		
		this.metrics.addRequest(arrivalRate);
		this.metrics.addStorage(storageDemand);
		return storageDemand;
	}
}
