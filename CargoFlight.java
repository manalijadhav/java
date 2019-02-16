/**
	its the real time object for the flight passengers to board

*/
public class CommercialFlight extends Flight implements Airport, Aviation// isA
{
	int totalSeats;
	double farePerSeat;
	double totalCostOfFlight;
	
	/**
	it invokes the super class ctor
	and also initializes the other commercial flight details
	*/
	public CommercialFlight(int a,String airline, String sc,String dc, int ts, double fare) 
	{
		super(a,airline,sc,dc);
		totalSeats = ts;
		farePerSeat = fare;
		totalCostOfFlight = totalSeats * farePerSeat ;  
		System.out.println("CommercialFlight(int,String,String,String,int,double)");
	}

	void showCommercialFlight() {
		super.showFlight();
		System.out.println("Total Seats	: "+totalSeats);
		System.out.println("Fare/Seat	: "+farePerSeat);
		System.out.println("Total Cost	: "+totalCostOfFlight);
	}
	/**
	without this method no boarding passes
	*/
	public void checkTickets()
	{
		System.out.println("Checking...Tickets....");
	}
	/**
	without this method no entry in the flight
	*/
	public void issueBoardingPass() {
		System.out.println("Issuing boarding passes....");
	}
	@Override
	public void checkLatitude() {
		// TODO Auto-generated method stub
		System.out.println("Flight is checking its.... latitude...");
	}
	
	/**
		every flight must be aware of its altitude...
	*/
	public void checkAltitude() {
		// TODO Auto-generated method stub
		System.out.println("Flight is checking its.... altitude...");
	}
	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println("Flight is flying.....");
		 checkAltitude();
		 checkLatitude();
	}
	@Override
	void land() {
		// TODO Auto-generated method stub
		System.out.println("Flight is landing........");
	}
	
	
}
