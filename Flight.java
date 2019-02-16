/** 
	This class is used as a base class
	for the airline flight booking system
*/
public abstract  class Flight //meant for inheritance
{
	private int flightNumber;
	private String flightName;
	private String sourceCity;
	private String destCity;
	
	abstract void fly() ;
	abstract void land();

	/**
		THIS CONSTRUCTOR WILL INITIALIZE A FLIGHT OBJECT
	*/	
	public Flight(int flightNumber, String flightName, String sourceCity, String destCity) {
		super();
		System.out.println("Flight(int,String,String,String");
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.sourceCity = sourceCity;
		this.destCity = destCity;
	}
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightName=" + flightName + ", sourceCity=" + sourceCity
				+ ", destCity=" + destCity + "]";
	}
	/**
		this will show the flight details
	*/
	public void showFlight() {
		System.out.println("Flight no	: "+flightNumber);
		System.out.println("FlightName	: "+flightName);
		System.out.println("Source		: "+sourceCity);
		System.out.println("Dest		: "+destCity);
	}
}

