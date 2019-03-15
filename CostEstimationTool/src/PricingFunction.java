
public class PricingFunction {
	String capability;
	double constant = 0;
	double price;
	double metric;
	
	public PricingFunction(String capability, double price, double metric, double constant) {
		this.capability = capability;
		this.price = price;
		this.constant = constant;
		this.metric = metric;
	}
	
//	public PricingFunction(String capability, long price, long metric) {
//		this.capability = capability;
//		this.price = price;
//		this.metric = metric;
//	}
	
	public double CapabilityCost() {
		double capabilityCost = this.constant + this.price * this.metric;
		
		return capabilityCost;
	}

}
