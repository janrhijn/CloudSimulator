package com.example.simulation;

public class QueueingNode {
	private int servers;
	
	public QueueingNode() {
		
	}
	
	public int DetermineServersOnWaitingTime(double arrivalRate, double serviceRate, int maxMeanWaitingTime) {
		this.servers = MinRequiredServers(arrivalRate, serviceRate);
		
		double queueWaitingTime = QueueWaitingTime(arrivalRate, serviceRate);
		double treshold = (double) maxMeanWaitingTime/1000;
		
		while(queueWaitingTime > treshold) {
			this.servers += 1;
			queueWaitingTime = QueueWaitingTime(arrivalRate, serviceRate);
		}
		
		return this.servers;
	}
	
	// Calculate minimal required servers for queueingnode
	public int MinRequiredServers(double arrivalRate, double serviceRate) {
		int minRequiredServers = (int) (arrivalRate/serviceRate + 1);
		
		return minRequiredServers;
	}
	
	// Calculate rho for queueingnode
	private double Rho(double arrivalRate, double serviceRate) {
		double rho = (double) arrivalRate/(this.servers * serviceRate);
			
		return rho;
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
	
	@SuppressWarnings("unused")
	// Calculate queue length for a given arrivalrate
	public double QueueLength(double arrivalRate, double serviceRate) {
		int c = this.servers;
		double rho = Rho(arrivalRate, serviceRate);
		double pi_w = Delay(c, rho);
		
		double queueLength =  pi_w * (rho / (1 - rho));
//		System.out.println("Queue length: " + queueLength);
			
		return queueLength;
	}
		
	// Calculate queue waiting time for a given arrivalrate
	public double QueueWaitingTime(double arrivalRate, double serviceRate) {
		double rho = Rho(arrivalRate, serviceRate);
		double pi_w = Delay(this.servers, rho);
		double queueWaitingTime = pi_w * (1 / (1 - rho)) * (1 / (this.servers * serviceRate));
//		System.out.println("Queue Waiting Time: " + queueWaitingTime + " with " + this.servers + " servers");
		
		return queueWaitingTime;
	}

	public double SojournTime(double arrivalRate, double serviceRate) {
		double queueWaitingTime = QueueWaitingTime(arrivalRate, serviceRate);
		double sojournTime = queueWaitingTime + (1 / serviceRate);
//		System.out.println("Sojourn Time " + sojournTime);
		
		return sojournTime;
	}

}
