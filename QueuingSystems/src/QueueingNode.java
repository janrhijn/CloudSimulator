import java.util.List;

public class QueueingNode {
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
	List<Feature> features;
//	List<>
	
	public QueueingNode() {
		
	}
	
//	public QueueingNode(int serviceRate) {
//		this.serviceRate = serviceRate;
//	}
	
	public QueueingNode(List<Feature> features) {
		this.features = features;
		this.serviceRate = CalculateServiceRate(features);
	}
	
	public double CalculateServiceRate(List<Feature> features) {
		double mu = 0;
		
		for(Feature f:features) {
			if(f.mu > 0)
				mu += Math.pow(f.mu, -1);
		}

//		System.out.println(Math.pow(mu, -1));
		return Math.pow(mu, -1);
	}
	
	// Utulity function for calculating minimal required amount of servers for a given arrivalrate
	public int MinRequiredServers(int arrivalRate) {

		return (int) (arrivalRate/this.serviceRate + 1);
	}
	
	// Calculate rho
	private void Rho() {
		this.rho = (double) this.arrivalRate/(this.currentServers * this.serviceRate);
	}
	
	// Utulity function for calculating waiting probability #credits J.M van der Werf
	private double Delay (int c, double rho) {
		double block = Blocking(c - 1, c * rho);
		
		return (rho * block) / (1 - rho + rho * block);
	}
	
	// Utulity function to calculating waiting probability #credits J.M van der Werf
	private double Blocking (int c, double rho) {
		if(c > 0) {
			double prev = Blocking(c - 1, rho);
			
			return(rho * prev)/(c + rho * prev);
		} else {
			return 1;
		}
	}
	
	// Calculate queue length for a given arrivalrate
	private double QueueLength() {
		int c = this.currentServers;
		double pi_w = Delay(c, this.rho);
		
		this.queueLength =  pi_w * (this.rho / (1 - this.rho));
//		System.out.println("Queue length " + this.queueLength);
		
		return this.queueLength;
	}
	
	// Calculate queue waiting time for a given arrivalrate
	private double QueueWaitingTime() {
		int c = this.currentServers;
		double pi_w = Delay(c, rho);
		
		this.queueWaitingTime = pi_w * (1 / (1 - this.rho)) * (1/((double) c * this.serviceRate));
//		System.out.println("Queue Waiting Time " + this.queueWaitingTime);
		
		return this.queueWaitingTime;
	}
	
	private double SojournTime() {
		double queueWaitingTime = QueueWaitingTime();

		this.sojournTime = queueWaitingTime + (double) 1 / this.serviceRate;
//		System.out.println("Sojourn Time" + this.sojournTime);
		
		return this.sojournTime;
	}
	
	public String Metrics(int arrivalRate, double serviceRate, int additionalC) {
		this.arrivalRate = arrivalRate;
		this.serviceRate = serviceRate;
		this.additionalServers = additionalC;
		this.minRequiredServers = MinRequiredServers(arrivalRate);
		this.currentServers = this.minRequiredServers + this.additionalServers;
//		this.rho = Rho(this.arrivalRate, this.currentServers);
		System.out.println(this.serviceRate);
		Rho(); // Calculate rho
		QueueLength(); // Calculate queue length
		QueueWaitingTime(); // Calculate waiting time in queue
		SojournTime(); // Calculate sojourn time
//		return "Requiered Servers " + this.currentServers + " SojournTime " + this.sojournTime + " Waiting Time " + this.queueWaitingTime + " Rho " + this.rho;
		return "Requiered Servers " + this.currentServers + " SojournTime " + this.sojournTime + " Service Rate " + this.serviceRate + " Rho " + this.rho;
	}
}
