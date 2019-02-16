/**
	its the real time object for the flight passengers to board

*/
public class FighterFlight extends Flight implements Airbase, Aviation// isA
{
	int totalSeats;
	int numberOfMissiles;
	
	/**
	it invokes the super class ctor
	and also initializes the other commercial flight details
	*/
	public FighterFlight(int a,String airline, String sc,String dc, int ts, int numOfMi) 
	{
		super(a,airline,sc,dc);
		totalSeats = ts;
		numberOfMissiles=numOfMi;
		
		System.out.println("FighterFlight(int,String,String,String,int,int)");
	}

	void showFighterFlight() {
		super.showFlight();
		System.out.println("Total Seats	: "+totalSeats);
		System.out.println("Missiles    : "+numberOfMissiles);
	}
	/**
	without this method flight should not be on the runway
	*/
	public void checkMissiles()
	{
		System.out.println("Checking...Missiles count.......");
	}

	/**
	without this method flight should not fly
	*/
	public void armMissiles() {
		System.out.println("missiles armed....");
	}

	public void fireMissiles() {
		System.out.println("missiles fired.....");
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
		System.out.println("FighterFlight is flying.....");
		 checkAltitude();
		 checkLatitude();
	}
	@Override
	void land() {
		// TODO Auto-generated method stub
		System.out.println("Flight is landing........");
	}
	
	
}
