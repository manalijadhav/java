
class CarTest
{
  public static void main(String args[])
  {
	Car c = new Car("MH-01-XA-3690","Audi","D");
	c.showCar();
	c.startCar();
  } 
}

class Vehicle
{

}

class Car  extends Vehicle //isA
{
	String numberPlate;
	String model;
	String fuelType;

	Wheel w1 = new Wheel(12,"Black","MRF"); //hasA    
	Wheel w2 = new Wheel(12,"Black","MRF");
	Wheel w3 = new Wheel(12,"Black","MRF");
	Wheel w4 = new Wheel(12,"Black","MRF");
	
	Engine e = new Engine("2000cc","Bhp",4,4); //hasA


	Car(String np, String mod, String ft) {
		numberPlate = np;
		model = mod;
		fuelType = ft;
	}

	void startCar() {
		e.startEngine();
	}

	void showCar() {
		System.out.println("Number Plate : "+numberPlate);
		System.out.println("Model        : "+model);
		System.out.println("Fuel Type    : "+fuelType);
		e.showEngine();
		w1.showWheel();		
		w2.showWheel();
		w3.showWheel();
		w4.showWheel();

	}
}

class Engine
{
	String capacity;
	String power;
	int piston;
	int cylinder;
	
	Engine(String c, String p, int pi, int cy)
	{
		capacity = c;
		power = p;
		piston = pi;
		cylinder = cy;
	}
	private void ignite() {
		System.out.println("Igniting...the engine...firing the pistons....");			
	}

	void startEngine() {
		System.out.println("Starting the engine...");		
		ignite() ;
	}
	
	void stopEngine() {
		System.out.println("Stopping the engine...");
	}
	void showEngine() {
		System.out.println("Engine Capacity : "+capacity);
		System.out.println("Engine power    : "+power);
		System.out.println("Engine piston   : "+piston);
		System.out.println("Engine cylinder : "+cylinder);
	}	
}

class Wheel
{
	int radius;
	String color;
	String make;

	Wheel(int r, String c, String m) {
		System.out.println("Wheel ctor...");
		radius = r;
		color =c;
		make = m;
	}
	void showWheel() {
		System.out.println("radius : "+radius);
		System.out.println("color  : "+color);
		System.out.println("make   : "+make);
		System.out.println("------------------");
	}	
}