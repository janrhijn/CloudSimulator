package com.example.simulation;

import java.text.DecimalFormat;
//import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;

//import org.eclipse.sirius.deployment.Component;
//import org.eclipse.sirius.deployment.Deployment;
//import org.eclipse.sirius.deployment.PricingFunction;

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.*;

public class Estimation {
//	Deployment deployment;
	Deployment_Model deploymentModel;
//	Functional_Architecture_Model fam;
	DecimalFormat f = new DecimalFormat("###,##0.00");
//	List<Component> componentList = new ArrayList<Component>();
	
	public Estimation(Deployment_Model deploymentModel) {
//	public Estimation(Deployment deployment) {
//		this.deployment = deployment;
		
		// Add all Components in one list
//		componentList.addAll(deployment.getVpc().getDeployed());
//		componentList.addAll(deployment.getContain());
		
//		this.fam = fam;
		this.deploymentModel = deploymentModel;
	}
	
	public void Estimate() {
		System.out.println("\nCost analysis");
		// Loop through all Components of the model
		for(Iterator<Component> componentIterator = this.deploymentModel.getContains().iterator(); componentIterator.hasNext();) {
			Component component = componentIterator.next();
			
			// Only output estimation if capability is defined
			if (component.getPricing_scheme().size() >= 1) {
				System.out.println(" " + component.getName());
				
				// Loop through all PricingFunctions of the Component
				for(Iterator<Pricing_Function> pricingFunctionIterator = component.getPricing_scheme().iterator(); pricingFunctionIterator.hasNext();) {
					Pricing_Function pricingFunction = pricingFunctionIterator.next();
					
//					// TODO check if capability is pricingfunction
//					Pricing_Function pricingfunction = (Pricing_Function) capability;
					
					if(pricingFunction.getConsumption_metric().equals(Consumption_Metric.SERVER_DURATION)) {
						double serverDurationCost = serverDurationCost(component, pricingFunction);
						
						componentTotalCost(component, serverDurationCost);
						System.out.println("  Cost Server Duration capability: $" + f.format(serverDurationCost) + " Server duration: " + component.getServer_duration() + " sec");
					}
					
					if(pricingFunction.getConsumption_metric().equals(Consumption_Metric.SERVER_UNIT)) {
						double serverUnitTimeCost = serverUnitTimeCost(component, pricingFunction);
	
						componentTotalCost(component, serverUnitTimeCost);
						System.out.println("  Cost Server Units capability: $" + f.format(serverUnitTimeCost)  + " Server units: " + component.getServer_unit());
					}
					
					if(pricingFunction.getConsumption_metric().equals(Consumption_Metric.DATA_IN)) {
						double dataInCost = dataInCost(component, pricingFunction);
	
						componentTotalCost(component, dataInCost);
						System.out.println("  Cost Data In capability: $" + f.format(dataInCost)  + " Data in: " + component.getData_in() + "KB");
					}
					
					if(pricingFunction.getConsumption_metric().equals(Consumption_Metric.DATA_OUT)) {
						double dataOutCost = dataOutCost(component, pricingFunction);
						
						componentTotalCost(component, dataOutCost);
						System.out.println("  Cost Data Out capability: $" + f.format(dataOutCost) + " Data out: " + component.getData_out() + "KB");
					}
					
					if(pricingFunction.getConsumption_metric().equals(Consumption_Metric.STORAGE_CAPACITY)) {
						double storageCapacityCost = storageCapacityCost(component, pricingFunction);
	
						componentTotalCost(component, storageCapacityCost);
						System.out.println("  Cost Storage Capacity capability: $" + f.format(storageCapacityCost) + " Storage capacity: " + component.getStorage_capacity()  + "KB");
					}
					
					if(pricingFunction.getConsumption_metric().equals(Consumption_Metric.REQUEST)) {
						double requestCost = requestCost(component, pricingFunction);
						
						componentTotalCost(component, requestCost);
						System.out.println("  Cost Request capability: $" + f.format(requestCost) + " Requests: " + component.getRequest());
					}
					
					if(pricingFunction.getConsumption_metric().equals(Consumption_Metric.DATA_PROCESSED)) {
						double dataProcessedCost = dataProcessedCost(component, pricingFunction);
						
						componentTotalCost(component, dataProcessedCost);
						System.out.println("  Cost Data Processed capability: $" + f.format(dataProcessedCost) + " Data processed: " + (component.getData_in() + component.getData_in()) + "KB");
					}
				}
				
				System.out.println(" Total component cost: $" + f.format(component.getOperational_component_cost()) + "\n");
			}
		}
		
		deploymentTotalCost();
//		System.out.println("Total deployment cost: $" + f.format(deployment.getOperationalCost()));
	}
	
	void deploymentTotalCost() {
		double deploymentTotalCost = 0.0;
		
		// Get operational costs for all Components in model
		for(Iterator<Component> componentIterator = this.deploymentModel.getContains().iterator(); componentIterator.hasNext();) {
			Component component = componentIterator.next();
			
			deploymentTotalCost += component.getOperational_component_cost();
		}
//		deployment.setOperationalCost(deploymentTotalCost);
		System.out.println(" Total deployment cost: $" + f.format(deploymentTotalCost));
//		return deploymentTotalCost;
	}
	
	void componentTotalCost(Component component, double capacityCost) {
		component.setOperational_component_cost(component.getOperational_component_cost() + capacityCost);
	}
	
	double serverDurationCost(Component instance, Pricing_Function pricingfunction) {
		double serverDuration = instance.getServer_duration();
		
		if(pricingfunction.getDuration_type().equals(Duration_Type.HOUR)) {
			serverDuration = serverDuration / 3600;
		} else if (pricingfunction.getDuration_type().equals(Duration_Type.NONE)) {
			System.out.println("Error: define server duration type for: " + pricingfunction.getName());
		}
		
		// Ceil serverDuration to one hour if billing type is per hour
		if(pricingfunction.getBilling_type().equals(Billing_Type.HOUR)) {
			// Convert to per-hours-billing if BillingType is HOUR
			serverDuration = Math.ceil(serverDuration);
		}
		
		double serverDurationCost = pricingfunction.getPrice() * serverDuration;
		
		return serverDurationCost;
	}
	
	double serverUnitTimeCost(Component instance, Pricing_Function pricingfunction) {
		double serverUnit = instance.getServer_unit();

		if(pricingfunction.getDuration_type().equals(Duration_Type.HOUR)) {
			serverUnit = serverUnit / 3600;
		} else if (pricingfunction.getDuration_type().equals(Duration_Type.NONE)) {
			System.out.println("Error: define server unit type for: " + pricingfunction.getName());
		}
		
		if(pricingfunction.getBilling_type().equals(Billing_Type.HOUR)) {
			// Convert to per-hours-billing if BillingType is HOUR
			serverUnit = Math.ceil(serverUnit);
		}
		
		double serverUnitTimeCost = pricingfunction.getPrice() * serverUnit;
		
		return serverUnitTimeCost;
	}
	
	double dataInCost(Component instance, Pricing_Function pricingfunction) {
		double dataIn = instance.getData_in();
		
		if(pricingfunction.getData_type().equals(Data_Type.MEGABYTE)) {
			// Convert Kilobyte to Megabyte
			dataIn = Math.ceil(dataIn/1000);
		} else if (pricingfunction.getData_type().equals(Data_Type.GIGABYTE)) {
			// Convert Kilobyte to Gigabyte
			dataIn = Math.ceil(dataIn/1000/1000);
		} else if(pricingfunction.getData_type().equals(Data_Type.NONE)) {
			// Error if no data type is specified
			System.out.println("Error: define data type for: " + pricingfunction.getName());
		}
		
		double dataInCost = pricingfunction.getPrice() * dataIn;
		
		return dataInCost;
	}
	
	double dataOutCost(Component component, Pricing_Function pricingfunction) {
		double dataOut = component.getData_out();
		
		if(pricingfunction.getData_type().equals(Data_Type.MEGABYTE)) {
			// Convert Kilobyte to Megabyte
			dataOut = Math.ceil(dataOut/1000);
		} else if (pricingfunction.getData_type().equals(Data_Type.GIGABYTE)) {
			// Convert Kilobyte to Gigabyte
			dataOut = Math.ceil(dataOut/1000/1000);
		} else if(pricingfunction.getData_type().equals(Data_Type.NONE)) {
			// Error if no data type is specified
			System.out.println("Error: define data type for: " + pricingfunction.getName());
		}
		
		double dataOutCost = pricingfunction.getPrice() * dataOut;
		
		
		return dataOutCost;
	}
	
	double storageCapacityCost(Component instance, Pricing_Function pricingfunction) {
		double storageCapacity = instance.getStorage_capacity();
		
		if(pricingfunction.getData_type().equals(Data_Type.MEGABYTE)) {
			// Convert Kilobyte to Megabyte
			storageCapacity = Math.ceil(storageCapacity/1000);
		} else if (pricingfunction.getData_type().equals(Data_Type.GIGABYTE)) {
			// Convert Kilobyte to Gigabyte
			storageCapacity = Math.ceil(storageCapacity/1000/1000);
		} else if(pricingfunction.getData_type().equals(Data_Type.NONE)) {
			// Error if no data type is specified
			System.out.println("Error: define data type for: " + pricingfunction.getName());
		}
		
		double storageCapacityCost = pricingfunction.getPrice() * storageCapacity;
		
		return storageCapacityCost;
	}
	
	double requestCost(Component instance, Pricing_Function pricingfunction) {
		double request = instance.getRequest();
		
		if(pricingfunction.getRequest_type().equals(Request_Type.MILLION)) {
			// Convert to per millions requests
			request = request/1000000;
		} else if (pricingfunction.getRequest_type().equals(Request_Type.THOUSAND)) {
			// Convert to per thousand requests
			request = request/1000;
		} else if (pricingfunction.getRequest_type().equals(Request_Type.NONE)) {
			// Error if no request type is specified
			System.out.println("Error: define request type for: " + pricingfunction.getName());
		}
		
		double requestCost = pricingfunction.getPrice() * request;
		
		return requestCost;
	}
	
	double dataProcessedCost(Component instance, Pricing_Function pricingfunction) {
		double dataProcessed = instance.getData_in() + instance.getData_out();
		
		if(pricingfunction.getData_type().equals(Data_Type.MEGABYTE)) {
			// Convert Kilobyte to Megabyte
			dataProcessed = Math.ceil(dataProcessed/1000);
		} else if (pricingfunction.getData_type().equals(Data_Type.GIGABYTE)) {
			// Convert Kilobyte to Gigabyte
			dataProcessed = Math.ceil(dataProcessed/1000/1000);
		} else if(pricingfunction.getData_type().equals(Data_Type.NONE)) {
			// Error if no data type is specified
			System.out.println("Error: define data type for: " + pricingfunction.getName());
		}
		
		double dataProcessedCost = pricingfunction.getPrice() * dataProcessed;
		
		return dataProcessedCost;
	}

}
