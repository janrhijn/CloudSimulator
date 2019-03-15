import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Scenario {
	String scenarioName; // Name of the scenario
	int arrivalRate = 1; // Arrival rate of the scenario
	long totalArrivalRate;
	Clock timeStamp;
	List<DataFlow> DependencyGraph = new ArrayList<DataFlow>(); // List of dataflow belonging to scenario (DependencyGraph)
	double weekDistribution = 0;
	double dayDistribution = 0;
	int total = 0;
	
	// Constructor of Scenario
	public Scenario (String scenarioName) {
		this.scenarioName = scenarioName;
	}
	
	// Add data flow to scenario in list
	public void AddDataFlow(DataFlow dataFlow) {
		this.DependencyGraph.add(dataFlow);
	}
	
	public void setArrivalRate(int arrivalRate) {
		this.arrivalRate = arrivalRate;
		this.totalArrivalRate =+ arrivalRate;
	}
	
	public void AddTimeStamp(Clock timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	public void RandomArrivalRate(int base, int range) {
		Random rand = new Random();
		int arrivalRate = base + rand.nextInt(range);
		this.arrivalRate = arrivalRate;
	}
	
	public void DeterministicArrivalRate(int totalArrivalRate) {
		double arrivalRate;
		
		if((this.timeStamp.days == 1 || this.timeStamp.days % 7 == 1) && this.timeStamp.hours == 0 && this.timeStamp.minutes == 0 && this.timeStamp.seconds == 0) {
			switch(this.timeStamp.week) {
			case 1: weekDistribution = 0.10; break;
			case 2: weekDistribution = 0.20; break;
			case 3: weekDistribution = 0.32; break;
			case 4: weekDistribution = 0.38; break;
			case 5: weekDistribution = 0; break;
			default: weekDistribution = 0;break;
			}
//			System.out.println("Week " + this.timeStamp.week+ " distribution: " + weekDistribution);
		}
		
		if(this.timeStamp.hours == 0 && this.timeStamp.minutes == 0 && this.timeStamp.seconds == 0) {
			switch(this.timeStamp.weekday) {
			case 1: dayDistribution = 0.10; break;
			case 2: dayDistribution = 0.15; break;
			case 3: dayDistribution = 0.20; break;
			case 4: dayDistribution = 0.15; break;
			case 5: dayDistribution = 0.20; break;
			case 6: dayDistribution = 0.15; break;
			case 7: dayDistribution = 0.05; break;
			default: dayDistribution = 0; break;
			}
//			arrivalRate = (double) (totalArrivalRate * weekDistribution * dayDistribution);
//			System.out.println(this.scenarioName + " Day " + this.timeStamp.weekday + " distribution: " + dayDistribution + " Arrival Rate " + (int) (arrivalRate/60/60) + " per sec " + (int) arrivalRate + " per day");
//			System.out.println(this.scenarioName + " Day " + this.timeStamp.weekday + " Arrival Rate " + (int) (arrivalRate/60/60) + " per sec " + (int) arrivalRate + " per day");
		}
		
		arrivalRate = totalArrivalRate * weekDistribution * dayDistribution;
		this.arrivalRate = (int) (arrivalRate/60/60/24);
	}
}
