public class InterfaceTest {
	public static void main(String[] args) {
		//Flight flight = new Flight(101,"Jet Airways","Mumbai","London");
		//System.out.println("flight is : "+flight);
		
		CommercialFlight commFlight = new CommercialFlight(101,"Jet Airways","Mumbai","London",300,50000);
		commFlight.showCommercialFlight();
		//System.out.println("Comm Flight is : "+commFlight);
		commFlight.checkTickets();
		commFlight.issueBoardingPass();
		commFlight.fly();
		//commFlight.checkAltitude();
		//commFlight.checkLatitude();
		
		
		
	}
}

