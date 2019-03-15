import java.util.ArrayList;
import java.util.List;

public class PriceStructure {
//	Metrics metrics;
//	Container container;
	List<PricingFunction> pricingScheme = new ArrayList<PricingFunction>();
	long totalPrice;
	
	public PriceStructure() {
//		this.container = container;
//		this.metrics = metrics;
	}
	
	public void AddPricingFunction(PricingFunction pricingFunction) {
		// Pricing variable => metric value
		// Price coefficient => $0.05 per metric unit
//		PricingFunction pricingFunction = new PricingFunction(capability, price, metric, constant);
		this.pricingScheme.add(pricingFunction);
	}
	
//	public void SumCost() {
//		
//	}
	
	public double ResourceCost() {
		double totalPrice = 0;
		
		for(PricingFunction pf:pricingScheme) {
			totalPrice += pf.CapabilityCost();
		}
		
		return totalPrice;
	}
}

//class PricingFunction {
//	
//	
//	public PricingFunction(float price, String metric , float constant) {
//		this
//	}
//}