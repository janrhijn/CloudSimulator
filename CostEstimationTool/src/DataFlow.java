
public class DataFlow {
	String name;
	Feature sender; // Feature object
	Feature receiver; // Feature object
	int data;
//	double successRate = 1;
	
	public DataFlow(String name, Feature sender, Feature receiver, int data) {
		this.name = name;
		this.sender = sender;
		this.receiver = receiver;
		this.data = data;
	}
}
