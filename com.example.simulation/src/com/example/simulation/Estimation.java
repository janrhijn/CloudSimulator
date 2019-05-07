package com.example.simulation;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.sirius.deployment.Component;
import org.eclipse.sirius.deployment.Deployment;
import org.eclipse.sirius.deployment.PricingFunction;

public class Estimation {
	Deployment deployment;
	DecimalFormat f = new DecimalFormat("###,##0.00");
	List<Component> componentList = new ArrayList<Component>();
	
	public Estimation(Deployment deployment) {
		this.deployment = deployment;
		
		// Add all Components in one list
		componentList.addAll(deployment.getVpc().getDeployed());
		componentList.addAll(deployment.getContain());
	}
	
	public void Estimate() {
		// Loop through all Components of the model
		for(Iterator<Component> componentIterator = componentList.iterator(); componentIterator.hasNext();) {
			Component component = componentIterator.next();
			System.out.println(component.getName());
			
			// Loop thorugh all PricingFunctions of the component
			for(Iterator<PricingFunction> pricingfunctionIterator = component.getPricingscheme().iterator(); pricingfunctionIterator.hasNext();) {
				PricingFunction pricingfunction = pricingfunctionIterator.next();
				
				if(pricingfunction.getMetric().getName() == "serverDuration") {
					double serverDurationCost = serverDurationCost(component, pricingfunction);
					
					componentTotalCost(component, serverDurationCost);
					System.out.println(" Price Server Duration capability: $" + f.format(serverDurationCost) + " Server duration: " + component.getServerDuration() + " sec");
				}
				
				if(pricingfunction.getMetric().getName() == "serverUnitTime") {
					double serverUnitTimeCost = serverUnitTimeCost(component, pricingfunction);

					componentTotalCost(component, serverUnitTimeCost);
					System.out.println(" Price Server Units capability: $" + f.format(serverUnitTimeCost)  + " Server units: " + component.getServerUnitTime());
				}
				
				if(pricingfunction.getMetric().getName() == "dataIn") {
					double dataInCost = dataInCost(component, pricingfunction);

					componentTotalCost(component, dataInCost);
					System.out.println(" Price Data In capability: $" + f.format(dataInCost)  + " Data in: " + component.getDataIn() + "KB");
				}
				
				if(pricingfunction.getMetric().getName() == "dataOut") {
					double dataOutCost = dataOutCost(component, pricingfunction);
					
					componentTotalCost(component, dataOutCost);
					System.out.println(" Price Data Out capability: $" + f.format(dataOutCost) + " Data out: " + component.getDataOut() + "KB");
				}
				
				if(pricingfunction.getMetric().getName() == "storageCapacity") {
					double storageCapacityCost = storageCapacityCost(component, pricingfunction);

					componentTotalCost(component, storageCapacityCost);
					System.out.println(" Price Storage Capacity capability: $" + f.format(storageCapacityCost) + " Storage capacity: " + component.getStorageCapacity()  + "KB");
				}
				
				if(pricingfunction.getMetric().getName() == "request") {
					double requestCost = requestCost(component, pricingfunction);
					
					componentTotalCost(component, requestCost);
					System.out.println(" Price Request capability: $" + f.format(requestCost) + " Requests: " + component.getRequest());
				}
				
				if(pricingfunction.getMetric().getName() == "dataProcessed") {
					double dataProcessedCost = dataProcessedCost(component, pricingfunction);
					
					componentTotalCost(component, dataProcessedCost);
					System.out.println(" Price Data Processed capability: $" + f.format(dataProcessedCost) + " Data processed: " + (component.getDataIn() + component.getDataOut()) + "KB");
				}
			}
			
			System.out.println("Total component cost: $" + f.format(component.getOperationalComponentCost()) + "\n");
		}
		
		deploymentTotalCost();
		System.out.println("Total deployment cost: $" + f.format(deployment.getOperationalCost()));
	}
	
	void deploymentTotalCost() {
		double deploymentTotalCost = 0.0;
		
		// Get operational costs for all Components in model
		for(Iterator<Component> componentIterator = componentList.iterator(); componentIterator.hasNext();) {
			Component component = componentIterator.next();
			
			deploymentTotalCost += component.getOperationalComponentCost();
			
		}
		deployment.setOperationalCost(deploymentTotalCost);
		
//		return deploymentTotalCost;
	}
	
	void componentTotalCost(Component instance, double capacityCost) {
		instance.setOperationalComponentCost(instance.getOperationalComponentCost() + capacityCost);
	}
	
	double serverDurationCost(Component instance, PricingFunction pricingfunction) {
		double serverDurationHour = instance.getServerDuration();
		
		if(pricingfunction.getBillingType().toString() == "HOUR") {
			// Convert to hours-billing if BillingType is HOUR
			serverDurationHour = Math.ceil(serverDurationHour/3600);
		} else {
			// Convert to seconds-billing if BillingType is SECOND
			serverDurationHour = serverDurationHour/3600;
		}
		
		double serverDurationCost = pricingfunction.getPrice() * serverDurationHour;
		
		return serverDurationCost;
	}
	
	double serverUnitTimeCost(Component instance, PricingFunction pricingfunction) {
		double serverUnitTimeHour = instance.getServerUnitTime();
		
		if(pricingfunction.getBillingType().toString() == "HOUR") {
			// Convert to hours-billing if BillingType is HOUR
			serverUnitTimeHour = Math.ceil(serverUnitTimeHour/3600);
		} else {
			// Convert to seconds-billing
			serverUnitTimeHour = serverUnitTimeHour/3600;
		}
		
		double serverUnitTimeCost = pricingfunction.getPrice() * serverUnitTimeHour;
		
		return serverUnitTimeCost;
	}
	
	double dataInCost(Component instance, PricingFunction pricingfunction) {
		double dataIn = instance.getDataIn();
		
		if(pricingfunction.getDataType().toString() == "MEGABYTE") {
			// Convert Kilobyte to Megabyte
			dataIn = Math.ceil(dataIn/1000);
		} else if (pricingfunction.getDataType().toString() == "GIGABYTE") {
			// Convert Kilobyte to Gigabyte
			dataIn = Math.ceil(dataIn/1000/1000);
		}
		
		double dataInCost = pricingfunction.getPrice() * dataIn;
		
		return dataInCost;
	}
	
	double dataOutCost(Component instance, PricingFunction pricingfunction) {
//		double dataOutCost = pricingfunction.getPrice() * instance.getDataOut();
		double dataOut = instance.getDataOut();
		
		if(pricingfunction.getDataType().toString() == "MEGABYTE") {
			// Convert Kilobyte to Megabyte
			dataOut = Math.ceil(dataOut/1000);
		} else if (pricingfunction.getDataType().toString() == "GIGABYTE") {
			// Convert Kilobyte to Gigabyte
			dataOut = Math.ceil(dataOut/1000/1000);
		}
		
		double dataOutCost = pricingfunction.getPrice() * dataOut;
		
		
		return dataOutCost;
	}
	
	double storageCapacityCost(Component instance, PricingFunction pricingfunction) {
		double storageCapacity = instance.getStorageCapacity();
		
		if(pricingfunction.getDataType().toString() == "MEGABYTE") {
			// Convert Kilobyte to Megabyte
			storageCapacity = Math.ceil(storageCapacity/1000);
		} else if (pricingfunction.getDataType().toString() == "GIGABYTE") {
			// Convert Kilobyte to Gigabyte
			storageCapacity = Math.ceil(storageCapacity/1000/1000);
		}
		
		double storageCapacityCost = pricingfunction.getPrice() * storageCapacity;
		
		return storageCapacityCost;
	}
	
	double requestCost(Component instance, PricingFunction pricingfunction) {
		double request = instance.getRequest();
		
		if(pricingfunction.getRequestType().getName() == "MILLION") {
			// Convert to per millions requests
			request = request/1000000;
		} else if (pricingfunction.getRequestType().getName() == "THOUSAND") {
			// Convert to per thousand requests
			request = request/1000;
		}
		
		double requestCost = pricingfunction.getPrice() * request;
		
		return requestCost;
	}
	
	double dataProcessedCost(Component instance, PricingFunction pricingfunction) {
		double dataProcessed = instance.getDataIn() + instance.getDataOut();
		
		if(pricingfunction.getDataType().getName() == "MEGABYTE") {
			// Convert Kilobyte to Megabyte
			dataProcessed = Math.ceil(dataProcessed/1000);
		} else if (pricingfunction.getDataType().toString() == "GIGABYTE") {
			// Convert Kilobyte to Gigabyte
			dataProcessed = Math.ceil(dataProcessed/1000/1000);
		}
		
		double dataProcessedCost = pricingfunction.getPrice() * dataProcessed;
		
		return dataProcessedCost;
	}

}
