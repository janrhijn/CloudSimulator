
public class Clock {
	public int seconds;
	public int minutes;
	public int hours;
	public int days;
	
	public int week = 1;
	public int weekday = 1;
	
	public Clock () {
		this.seconds = 0;
		this.minutes = 0;
		this.hours = 0;
		this.days = 1;
	}
	
	public Clock (int seconds, int minutes, int hours, int days) {
		this.seconds = seconds;
		this.minutes = minutes;
		this.hours = hours;
		this.days = days;
	}
	
	public void timeTick(){
		// Increcemnt clock with 1 second
        this.seconds++;
        
        if(this.seconds == 60) {
          this.minutes++;
          this.seconds = 0;
          
          if(this.minutes == 60) {
             this.hours++;
             this.minutes=0;
             
             if(this.hours == 24) {

            	 
                 this.weekday = this.days % 7;
            	 if(this.weekday == 0)
            	 	this.weekday = 7;
//            	 System.out.println("Test " + Math.ceil((double)this.days / 7.0));
//            	 this.week = this.days / 7 + 1;
            	 this.week = (int) Math.ceil((double)this.days / 7.0);
            	 
            	 this.days++;
            	 this.hours = 0;
             }
          }
        }
    }

    public String toString(){

        return "Day: " + this.days + " Time: " + this.hours + ":" + this.minutes + ":" + this.seconds; 
    }
}
