interface Running
{
	void runVehicle(); // public abstract
}

class Car  /*extends Object*/   implements Running
{
	//11 methods from java.lang.Objec are inherited methods
	Car() {
		System.out.println("Car() is created...");
	}
	
	Car(Running ref) {
		System.out.println("Car(Running ref) is created...");
	}
	public void runVehicle() { // implemented mandate from Running interface
		System.out.println("Car is running....");
	}
	public void startVehicle() { // exclusive function
		System.out.println("starting the Vehicle...");
		runVehicle();
	}
}
/*class SedanCar extends Car
{
	//public void runVehicle() is inherited from Car and then
	public void runVehicle() { // overridden by SedanCar
		
	}
}*/
class Taxi implements Running
{

	@Override
	public void runVehicle() {
		// TODO Auto-generated method stub
		
	}
	
}
public class ThreadingTest1 {
	public static void main(String[] args) {
		Car  c1 = new Car(); // Car is Car ,  Car is Running
		Car  c2 = new Car(); 
		Taxi taxi = new Taxi();
		
		Car c3 = new Car(taxi);
		
		if( c2 instanceof Running) {
			System.out.println("Yes c2 instanceof Running");
		}
		else {
			System.out.println("No c2 not an instanceof Running");
			
		}
		
	}
}



