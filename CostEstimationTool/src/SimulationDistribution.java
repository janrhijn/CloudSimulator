import java.util.ArrayList;
import java.util.List;

public class SimulationDistribution {
	long totalEvents;
	WeekDistribution weekDistribution;
	WeekDayDistribution weekDayDistribution;
	HourDistribution hourDistribution;
	
	double leftOverArrivalRate = 0;
	
//	public SimulationDistribution(int totalEvents) {
//		this.totalEvents = totalEvents;
////		partOfDayDistribution = new PartOfDayDistribution(1000, 10000, 15000, 5000);
////		weekDayDistribution = new WeekDayDistribution(100, 10000, 10000, 10000, 10000, 10000, 5000);
//	}
	
	public SimulationDistribution() {
		weekDistribution = new WeekDistribution();
		weekDayDistribution = new WeekDayDistribution();
		hourDistribution = new HourDistribution();
	}
	
	public int proportionalDistribution(int totalEvents, int simDuration) {
		int arrivalRate = totalEvents/simDuration; // Arrival Rate per sec
		return arrivalRate;
	}
	
	public int DeterministicSimulation(Clock clock) {
		long weekDistribution = this.weekDistribution.weekDistributionList.get(clock.week -1);
		float weekDayDistribution = this.weekDayDistribution.weekDayDistributionList.get(clock.weekday - 1);
		float hourDistribution = this.hourDistribution.hourDistributionList.get(clock.hours);
		
		double arrivalRate = weekDistribution * weekDayDistribution * hourDistribution / 60 /60;
		
//		this.leftOverArrivalRate += (arrivalRate - (int) arrivalRate); // Leftover when arrivalRate is cast to int

		this.leftOverArrivalRate += (arrivalRate - Math.floor(arrivalRate)); // Leftover when arrivalRate is cast to int
		
		// Compensate arrivalRate when leftover is >= 1
		if(this.leftOverArrivalRate >=1) {
//			System.out.println("Compensate" + this.totalEvents);
			this.leftOverArrivalRate -= 1;
//			arrivalRate = (int) arrivalRate + 1;
			arrivalRate = Math.floor(arrivalRate) + 1;
		}	
//		System.out.println(this.leftOverArrivalRate + " " + clock + " " + (int) arrivalRate);
		
//		this.totalEvents += (int) arrivalRate;
		this.totalEvents += Math.floor(arrivalRate);
		
//		System.out.println(Math.floor(arrivalRate) + " " + this.leftOverArrivalRate + " " + this.totalEvents);
//		System.out.println(Math.floor(arrivalRate));
		
		if(clock.minutes == 0 && clock.seconds == 0) {
			System.out.println("weekDistribution " + weekDistribution + " weekDayDistribution " + weekDayDistribution + " hourDistribution " + hourDistribution );
			System.out.println(clock + " week: " + clock.week +" " + arrivalRate);
		}
		
		return (int) arrivalRate;
	}

}
class WeekDistribution {
	List<Long> weekDistributionList = new ArrayList<Long>();
	
	public WeekDistribution() {
		
	}

	public void addTotalWeekDistribution(List<Long> weekDistributionList) {
		// TODO Check if list is empty
		for(long total:weekDistributionList) {
			this.weekDistributionList.add(total);
		}
	}

	public void convertPercentageToTotal(long totalEvents, List<Float> weekPercentageList) {
		// TODO Check if list is empty
		for(float percentage:weekPercentageList) {
			this.weekDistributionList.add((long) (totalEvents * percentage));
		}
	}
	
	public long distributionPerWeek(Clock clock) {
		// TODO check if week - 1 is right
		return this.weekDistributionList.get(clock.week-1);
	}
}

class WeekDayDistribution {
	// per weekday percentage distribution
	List<Float> weekDayDistributionList = new ArrayList<Float>(); // Percentages
	
	public WeekDayDistribution() {

	}
	
	public void addWeekDayDistribution(List<Float> weekDayDistributionList) {
		// TODO Check if list is empty
		for(float percentage:weekDayDistributionList) {
			this.weekDayDistributionList.add(percentage);
		}
	}
}

class HourDistribution {
	// per hour percentage distribution
	List<Float> hourDistributionList = new ArrayList<Float>(); // Percentages
	
	public HourDistribution() {
	}
	
	public void addHourPercentageDistribution(List<Float> hourPercentageDistributionList) {
		// TODO Check if list is empty
		for(float percentage:hourPercentageDistributionList) {
			this.hourDistributionList.add(percentage);
		}
	}
	
	public void addHourWeightDistribution(List<Integer> hourTotalList) {
		// TODO Check if list is empty
		int sum = hourTotalList.stream().mapToInt(Integer::intValue).sum();
		
		for(float total:hourTotalList) {
			this.hourDistributionList.add(total/sum);
		}
	}
}