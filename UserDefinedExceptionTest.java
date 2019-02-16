public class UserDefinedExceptionTest {
	public static void main(String[] args) {
		System.out.println("Begin main...");
		
		try
		{
			Car theCar = new Car();
			theCar.shortDrive();
		}
		catch(CarDoorNotOpeningException e)
		{
			System.out.println("problem : "+e.getMessage());
			try
			{
				
			}
			catch(Exception e1) {
				
			}
		}
		catch(CarException e) {
			
		}
		catch(RedSignalDishonouredException e) {
			System.out.println("Some problem during travel : "+e);
		}
		catch(CarPuncturedException e) {
			System.out.println("Some problem during travel : "+e);
		}
		catch(CarAccidentException e) {
			System.out.println("Some problem during travel : "+e);
		}
		catch(CarTravelException e) {
			System.out.println("Some problem during travel : "+e);
		}
		catch(Exception e) {
			System.out.println("Some problem : "+e.getMessage());
		}
		finally {
			System.out.println("Regardless of the exception, this line would run");
			try
			{
				
			}
			catch(Exception e1) {
				
			}
		}
		
		
		System.out.println("End main...");
		
	}
}


class Engine
{
	void ignite() {
		System.out.println("Ignition....");
		firePiston();// invoke the private function here
	}
	private void firePiston() {
		System.out.println("Firing piston...");
	}
}

class Car
{
	Engine e = new Engine(); //hasA
	boolean isOpen;//false
	
	
	void startCar() {
		System.out.println("Starting...the Car.....");
		e.ignite();
	}
	void longDrive()
	{
		
	}
	void shortDrive() throws CarDoorNotOpeningException  // <--"declared to be thrown" solved here  
	{

		if(isOpen==false) {
			System.out.println("Trying to open the car....");
			double d = Math.random()%100;
			if(d >=0.60 && d<=0.70) {
				CarDoorNotOpeningException  cdnoe = new CarDoorNotOpeningException("door of the car is not opening....");
				throw cdnoe; //literally throwing the object
			}
			else {
				System.out.println("Car is unlocked...lets head for short drive...");
			}
		}
		
		for (int i = 1; i <=5; i++) {
			double d = Math.random()%100;
			System.out.println("Car travelled...."+i+" km");
			
			if(d >= 0.30 && d<=0.40 ) {
				//System.out.println("==> d "+d);
				CarPuncturedException rte = new CarPuncturedException("Car is punctured....") ;
				throw rte;
			}
			else if(d >= 0.50 && d<=0.60 ) {
				//System.out.println("==> d "+d);
				RedSignalDishonouredException  rte = new RedSignalDishonouredException ("RedSignal Dishonoured...") ;
				throw rte;
			} 
			else if(d >= 0.90 && d<=0.95 ) {
				//System.out.println("==> d "+d);
				CarAccidentException  rte = new CarAccidentException ("CarAccident...ho gaya......") ;
				throw rte;
			} 
		}
	}
}
class Pqr { 	static void fun() { } }
class Xyz extends Pqr { 	static void fun() { } }
class Test {
	public static void main(String[] args) {
	
		Pqr.fun();
		Xyz.fun();
	}
}
class Abc
{
	static int x;
	int y;
	Abc() {
	
	}
	Abc(int y) {
		this.y = y;
	}
	static void set(int x) {
		Abc.x = x;
	}			// Abc.set(99);
	void setFun(int y) {
		this.y = y;
	}
	
	private void fun() {
		
	}
}
class Bbc extends Abc
{
	private void fun() { }

}
/*
 * 			1. overriddne
 * 			2. not overridden
 * 			3. compile time error
 * 			4. none of the above
 */

class SedanCard extends Car
{
	void shortDrive()
	{
		
	}
}
class CarException extends Exception
{
	CarException (String str) {
		super(str);
	}
}
// checked - must be declared in the throws clause of the method  
class CarDoorNotOpeningException  extends CarException
{
	CarDoorNotOpeningException(String m) {
		super(m);
	}
}

class CarKeyNotFoundException  extends CarException
{
	CarKeyNotFoundException  (String m) {
		super(m);
	}
}


//unchecked
class CarTravelException extends RuntimeException 
{
	CarTravelException (String str) {
		super(str);
	}
}
class CarPuncturedException extends CarTravelException//isA
{
	CarPuncturedException (String msg) {
		super(msg);
	}
}
class RedSignalDishonouredException extends CarTravelException //isA
{
	RedSignalDishonouredException(String msg) {
		super(msg);
	}
}

class CarAccidentException extends CarTravelException //isA
{
	CarAccidentException (String errMsg) {
		super(errMsg);
	}
}



class Person
{

}

class Licence
{
	
}

class DrivingLicence extends Licence
{
	
}

class Driver extends   Person // 
{
	DrivingLicence drvLic = new DrivingLicence(); //hasA
	
	
	
}





