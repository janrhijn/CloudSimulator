//import java.util.HashMap;
//import java.util.Map;

public class Metrics {
	String featureName;
	long duration;
	long unitRun;
	long dataIn;
	long dataOut;
	long dataInter;
	long request;
	// requests in/out
	long storage;
	
	public Metrics(String feautureName) {
		this.featureName = feautureName;
	}

	public void addDuration(int duration) {
		this.duration += duration;
	}
	
	public void addUnitRun(int unitRun) {
		this.unitRun += unitRun;
	}
	
	public void addDataIn(int dataIn) {
		this.dataIn += dataIn;
	}
	
	public void addDataOut(int dataOut) {
		this.dataOut += dataOut;
	}
	
	public void addDataInter(int dataInter) {
		this.dataInter += dataInter;
	}
	
	public void addRequest(int request) {
		this.request += request;
	}
	
	public void addStorage(long storage) {
		this.storage += storage;
	}
	
//	public Map<String, Long> toMap() {
//		Map<String, Long> metrics = new HashMap<String, Long>();
//
//		metrics.put("duration", this.duration);
//		metrics.put("unitRun", this.unitRun);
//		metrics.put("dataIn", this.dataIn);
//		metrics.put("dataOut", this.dataOut);
//		metrics.put("dataInter", this.dataInter);
//		metrics.put("request", this.request);
//		metrics.put("storage", this.storage);
//		
//		return metrics;
//	}
	
	public String toString() {
		String output = this.featureName + "\n Total requests: " + this.request + "\n Total duration: " + this.duration + " sec\n Total units run: " + this.unitRun + "\n Data in: " + this.dataIn + " KB Data out: " + this.dataOut + " KB Data inter: " + this.dataInter + " KB\n Storage: " + this.storage + " KB";
		return output;
	}
}
