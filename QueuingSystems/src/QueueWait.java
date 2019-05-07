
public class QueueWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueingNode nodeA = new QueueingNode();
		QueueingNode nodeB = new QueueingNode();
	}

}

class BiDataFlow {
	String sender, receiver;
	
	public BiDataFlow(String sender, String receiver) {
		this.sender = sender;
		this.receiver = receiver;
	}
}

class UniDataFlow {
	String sender, receiver;
	
	public UniDataFlow(String sender, String receiver) {
		this.sender = sender;
		this.receiver = receiver;
	}
}
