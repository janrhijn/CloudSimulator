package com.example.simulation;

// Usage Profile
public class ArrivalRateDistribution {
	WeekDayDistribution weekDayDistribution;

	public ArrivalRateDistribution () {
		
	}
	
	public void WeekDayDistribution(int sunday, int monday, int tuesday, int wednesday, int thursday, int friday, int saturday) {
		weekDayDistribution = new WeekDayDistribution(sunday, monday, tuesday, wednesday, thursday, friday, saturday);
	}
}


class WeekDayDistribution {
	public int sunday;
	public int monday;
	public int tuesday;
	public int wednesday;
	public int thursday;
	public int friday;
	public int saturday;
	
	public WeekDayDistribution(int sunday, int monday, int tuesday, int wednesday, int thursday, int friday, int saturday) {
		this.sunday = sunday;
		this.monday = monday;
		this.tuesday = tuesday;
		this.wednesday = wednesday;
		this.thursday = thursday;
		this.friday = friday;
		this.saturday = saturday;
	}
}
