
import java.util.ArrayList;
import java.time.*;
import java.util.List;
//import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.text.DecimalFormat;

public class CostEstimationTool {

	public static void main(String[] args) {
//		int simDuration = 60*60*24*31;
		int simDuration = 1;
		List<Container> VPC = new ArrayList<Container>(); // Virtual private cloud
		Clock clock = new Clock();
		DecimalFormat f = new DecimalFormat("###,##0.00");
		Instant start = Instant.now(); // Start time of simulation
		// TODO load this from disk. 
		
		// Voter
		Container Voter = new Container("Voter", 1);
		VPC.add(Voter);
		Feature voter = new Feature("Voter");
		Voter.AddFeature(voter);
		
		// LoadBalancer
		Container networkLoadBalancer = new Container("Network Load Balancer", 1);
		VPC.add(networkLoadBalancer);
		Feature routeTraffic = new Feature("Route Traffic");
		networkLoadBalancer.AddFeature(routeTraffic);
		
		// Instance group Web server
		Container webServer = new Container("Web Server", 1000);
		VPC.add(webServer);
		Compute renderWebsite = new Compute("Render Website", 150);
		Compute monitorUser = new Compute("Monitor User", 20);
		webServer.AddCompute(renderWebsite);
		webServer.AddCompute(monitorUser);
		
		// Instance group Application server
		Container applicationServer = new Container("Application Server", 1000);
		VPC.add(applicationServer);
		Compute authenticateVote = new Compute("Authenticate Vote", 150);
		Compute processVote = new Compute("Process Vote", 200);
		Compute processRequests = new Compute("Process Requests", 150);
		Compute processResults = new Compute("Process Results", 2000);
		Storage votesData = new Storage("Votes In-memory Data");
		applicationServer.AddCompute(authenticateVote);
		applicationServer.AddCompute(processVote);
		applicationServer.AddCompute(processRequests);
		applicationServer.AddCompute(processResults);
		applicationServer.AddStorage(votesData);
		
//		Container applicationServer1 = new Container("Application Server 2", 1000);
//		VPC.add(applicationServer1);
//		Compute authenticateVote = new Compute("Authenticate Vote", 150);
//		Compute processVote = new Compute("Process Vote", 200);
//		applicationServer1.AddCompute(authenticateVote);
//		applicationServer1.AddCompute(processVote);
//		
//		Container applicationServer2 = new Container("Application Server 3", 1000);
//		VPC.add(applicationServer2);
//		Compute processRequests = new Compute("Process Requests", 150);
//		applicationServer2.AddCompute(processRequests);
		
		// Database server (PaaS)
		Container databaseServer = new Container("Database Server", 1000);
		VPC.add(databaseServer);
		Compute processWrites = new Compute("process writes", 5);
		Compute processReads = new Compute("process reads", 4);
		Storage storage = new Storage("Database Storage");
		databaseServer.AddCompute(processWrites);
		databaseServer.AddCompute(processReads);
		databaseServer.AddStorage(storage);
		
		// Website usage data
		Container webLogStorage = new Container("Web Log", 1);
		VPC.add(webLogStorage);
		Storage websiteMetrics = new Storage("Website Metrics");
		webLogStorage.AddStorage(websiteMetrics);
		
		// External Mail Service
		Container externalMailService = new Container("External Mail Service", 1);
		VPC.add(externalMailService);
		Feature externalMailAPI = new Feature("External Mail Service API");
		externalMailService.AddFeature(externalMailAPI);
		
		// User
		Container User = new Container("User", 1);
		VPC.add(User);
		Feature user = new Feature("User");
		User.AddFeature(user);
		
		// Construct serve website scenario
		Scenario scenario_1 = new Scenario("Serve Website");
		DataFlow requestWebsite = new DataFlow("Request website", voter, routeTraffic, 30);
		DataFlow routeWebServer = new DataFlow("route to WebServer", routeTraffic, monitorUser, 20);
		DataFlow userData = new DataFlow("user data", monitorUser, renderWebsite, 40);
		DataFlow serveWebsite = new DataFlow("serve website", renderWebsite, voter, 500);
		DataFlow putWebsiteMetrics = new DataFlow("put website metrics", monitorUser, websiteMetrics, 50);
		scenario_1.AddDataFlow(requestWebsite);
		scenario_1.AddDataFlow(routeWebServer);
		scenario_1.AddDataFlow(serveWebsite);
		scenario_1.AddDataFlow(userData);
		scenario_1.AddDataFlow(putWebsiteMetrics);
		
		// Construct user vote scenario
		Scenario scenario_2 = new Scenario("Vote");
		DataFlow vote = new DataFlow("vote", voter, routeTraffic, 30);
		DataFlow routeApplicationServer = new DataFlow("route to ApplicationServer", routeTraffic, authenticateVote, 20);
		DataFlow verifyVote = new DataFlow("verify vote", votesData, authenticateVote, 20);
		DataFlow agreedVote = new DataFlow("agreed vote", authenticateVote, processVote, 40);
		DataFlow saveVote = new DataFlow("save vote", processVote, votesData, 20);
		DataFlow notifyUser = new DataFlow("notify user", processVote, externalMailAPI, 100);
		DataFlow storeVote = new DataFlow("store vote", processVote, processWrites, 30);
		DataFlow writeVote = new DataFlow("write vote", processWrites, storage, 10);
		scenario_2.AddDataFlow(vote);
		scenario_2.AddDataFlow(routeApplicationServer);
		scenario_2.AddDataFlow(verifyVote);
		scenario_2.AddDataFlow(agreedVote);
		scenario_2.AddDataFlow(saveVote);
		scenario_2.AddDataFlow(notifyUser);
		scenario_2.AddDataFlow(storeVote);
		scenario_2.AddDataFlow(writeVote);
		
		Scenario scenario_3 = new Scenario("Result request");
		DataFlow requestResults = new DataFlow("request results", user, processRequests, 50);
		DataFlow query = new DataFlow("query", processRequests, processResults, 50);
		DataFlow results = new DataFlow("results", processReads, processResults, 1000);
		DataFlow voteResults = new DataFlow("vote results", processResults, user, 400);
		scenario_3.AddDataFlow(requestResults);
		scenario_3.AddDataFlow(query);
		scenario_3.AddDataFlow(results);
		scenario_3.AddDataFlow(voteResults);
		
		// Set simulation distribution characteristics
//		SimulationDistribution simulationDistributionScenario_1 = new SimulationDistribution();
//		SimulationDistribution simulationDistributionScenario_2 = new SimulationDistribution();
//		SimulationDistribution simulationDistributionScenario_3 = new SimulationDistribution();
		
//		List<Long> weekDistributionList = new ArrayList<Long>();
//		weekDistributionList.add((long) 1000);
//		weekDistributionList.add((long) 3000);
//		weekDistributionList.add((long) 4000000);
//		weekDistributionList.add((long) 5000000);
//		weekDistributionList.add((long) 6000000);
//		
//		List<Float> weekDayDistributionList = new ArrayList<Float>();
//		weekDayDistributionList.add((float) 0.05);
//		weekDayDistributionList.add((float) 0.15);
//		weekDayDistributionList.add((float) 0.15);
//		weekDayDistributionList.add((float) 0.15);
//		weekDayDistributionList.add((float) 0.25);
//		weekDayDistributionList.add((float) 0.20);
//		weekDayDistributionList.add((float) 0.05);
//		
//		List<Integer> hourWeightDistributionList = new ArrayList<Integer>();
//		hourWeightDistributionList.add(0); 	// 00.00-01.00
//		hourWeightDistributionList.add(0); 	// 01.00-02.00
//		hourWeightDistributionList.add(0); 	// 02.00-03.00
//		hourWeightDistributionList.add(0); 	// 03.00-04.00
//		hourWeightDistributionList.add(0); 	// 04.00-05.00
//		hourWeightDistributionList.add(10); // 05.00-06.00
//		hourWeightDistributionList.add(20); // 06.00-07.00
//		hourWeightDistributionList.add(30); // 07.00-08.00
//		hourWeightDistributionList.add(30); // 08.00-09.00
//		hourWeightDistributionList.add(20); // 09.00-10.00
//		hourWeightDistributionList.add(15); // 10.00-11.00
//		hourWeightDistributionList.add(20); // 11.00-12.00
//		hourWeightDistributionList.add(30); // 12.00-13.00
//		hourWeightDistributionList.add(40); // 13.00-14.00
//		hourWeightDistributionList.add(20); // 14.00-15.00
//		hourWeightDistributionList.add(20); // 15.00-16.00
//		hourWeightDistributionList.add(15); // 16.00-17.00
//		hourWeightDistributionList.add(25); // 17.00-18.00
//		hourWeightDistributionList.add(30); // 18.00-19.00
//		hourWeightDistributionList.add(10); // 19.00-20.00
//		hourWeightDistributionList.add(0); 	// 20.00-21.00
//		hourWeightDistributionList.add(0); 	// 21.00-22.00
//		hourWeightDistributionList.add(0); 	// 22.00-23.00
//		hourWeightDistributionList.add(0); 	// 23.00-24.00
		
//		simulationDistributionScenario_1.weekDistribution.addTotalWeekDistribution(weekDistributionList);
//		simulationDistributionScenario_1.weekDayDistribution.addWeekDayDistribution(weekDayDistributionList);
//		simulationDistributionScenario_1.hourDistribution.addHourWeightDistribution(hourWeightDistributionList);
		
//		simulationDistributionScenario_2.weekDistribution.addTotalWeekDistribution(weekDistributionList);
//		simulationDistributionScenario_2.weekDayDistribution.addWeekDayDistribution(weekDayDistributionList);
//		simulationDistributionScenario_2.hourDistribution.addHourWeightDistribution(hourWeightDistributionList);
//		
//		simulationDistributionScenario_3.weekDistribution.addTotalWeekDistribution(weekDistributionList);
//		simulationDistributionScenario_3.weekDayDistribution.addWeekDayDistribution(weekDayDistributionList);
//		simulationDistributionScenario_3.hourDistribution.addHourWeightDistribution(hourWeightDistributionList);
		
		// Simulation loop
		for (int x = 1; x <= simDuration; x++) {
			List<Scenario> scenarioList = new ArrayList<Scenario>();
			
			// Add timestamp to scenario
			scenario_1.AddTimeStamp(clock);
			scenario_2.AddTimeStamp(clock);
			scenario_3.AddTimeStamp(clock);
			
//			int userReqeuestRate;
//			if(clock.hours == 15 && clock.minutes == 0 && clock.seconds == 0) {
//				userReqeuestRate = 3;
//			} else {
//				userReqeuestRate = 0;
//			}
			
			// Add arrivalrate to scenario
//			scenario_1.DeterministicArrivalRate(30000000); // 30mln in 1 month
//			scenario_2.DeterministicArrivalRate(4000000); // 4mln in 1 month
//			scenario_3.setArrivalRate(userReqeuestRate);
			
			scenario_1.setArrivalRate(200);
			scenario_2.setArrivalRate(100);
			scenario_3.setArrivalRate(10);
			
			// Add scenarios to list
			scenarioList.add(scenario_1);
			scenarioList.add(scenario_2);
			scenarioList.add(scenario_3);
			
			// Run all containers
			for(Container c:VPC)
				c.Run(scenarioList);
			
			clock.timeTick(); // Increment clock with 1 second
		}
		
		// Simulation characteristics
		Instant end = Instant.now(); // End time of simulation
		int day = (int)TimeUnit.SECONDS.toDays(simDuration);   
		System.out.println("Simulation timeperiod: " + day + " days \nTime to simulate: " + Duration.between(start, end).toString() + "\n");

		// Price structure of cloud instances
		networkLoadBalancer.priceStructure.AddPricingFunction(new PricingFunction("Runtime", 0.025, (double) networkLoadBalancer.metrics.unitRun/3600, 0.0));
		networkLoadBalancer.priceStructure.AddPricingFunction(new PricingFunction("Data processed", 0.008 ,(double) (networkLoadBalancer.metrics.dataIn/1000/1000 + networkLoadBalancer.metrics.dataOut/1000/1000), 0.0));
		webServer.priceStructure.AddPricingFunction(new PricingFunction("Runtime", 0.0832, (double) webServer.metrics.unitRun/3600, 0.0)); // t3.large
		applicationServer.priceStructure.AddPricingFunction(new PricingFunction("Runtime", 0.0832, (double) applicationServer.metrics.unitRun/3600, 0.0)); // t3.large
//		applicationServer1.priceStructure.AddPricingFunction(new PricingFunction("Runtime", 0.0832, (double) applicationServer1.metrics.unitRun/3600, 0.0)); // t3.large
//		applicationServer2.priceStructure.AddPricingFunction(new PricingFunction("Runtime", 0.0832, (double) applicationServer2.metrics.unitRun/3600, 0.0)); // t3.large
		databaseServer.priceStructure.AddPricingFunction(new PricingFunction("Runtime", 0.082, (double) databaseServer.metrics.unitRun/3600, 0.0)); // db.t2.medium
		databaseServer.priceStructure.AddPricingFunction(new PricingFunction("Storage", 0.10, (double) databaseServer.metrics.storage/1000/1000, 0.0));
		databaseServer.priceStructure.AddPricingFunction(new PricingFunction("I/O requests", 0.2, (double) databaseServer.metrics.request/1000/1000, 0.0));
		webLogStorage.priceStructure.AddPricingFunction(new PricingFunction("Storage", 0.023, (double) webLogStorage.metrics.storage/1000/1000, 0.0));
		webLogStorage.priceStructure.AddPricingFunction(new PricingFunction("PUT, COPY, POST, or LIST Requests", 0.005, (double) webLogStorage.metrics.request/1000, 0.0));
		
		// Output results
		double totalCost = 0;
		for(Container c:VPC) {
			System.out.println(c.metrics.toString() + "\nCosts");
			
			for (PricingFunction ps:c.priceStructure.pricingScheme )
				System.out.println(" Capability " + ps.capability + " $" + f.format(ps.CapabilityCost()) + " Metric: " + ps.metric);
			
			totalCost += c.priceStructure.ResourceCost();
			System.out.println("$" + f.format(c.priceStructure.ResourceCost()) + "\n");
		}
		
		System.out.println("Total cost of deployment $" + f.format(totalCost) + "\n");
		
		
	}
}
