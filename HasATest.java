//recap
//this is ASSOCIATION
//isA		hasA			usesA			producesA
//get this code at ur location.... still the quiteness is expected...
// you can imagine ...if the tounge is quite....much more things are possible
//so copy it ...observe it....and grasp it.....
// then when i say.....we will have queries....
//now its 17:05.... have 10 mnts to observe.....

//hasA is a strict version of usesA 
//or usesA is a loose version of hasA


public class HasATest {
	public static void main(String[] args) {
		                                                  //Engine eng = new Engine();                  // a separate object 
		Car car = new Car();                          // how come car can be created without an Engine here
				                              // "eng" is an object of Engine, but it has no relationship with the "car"
		                                              //hencle drop the idea of creating "eng" here in the main function
		                                                 //put this "Engine Object creation process" line in the Car class
		car.startCar(); // we are not calling the ignition and firePiston, but they are		
					//invoked by startCar()
		System.out.println("------------------------------");
		Petrol pet = new Petrol();
		Car anotherCar = new Car();
		Smoke sm = anotherCar.startCar(pet);
		sm.showSmoke();
		
	}
}
class Engine
{
	//here this function is private, "intentionally"
	private void firePiston() // fire the piston ...the dirty details of Engine here...
	{
		System.out.println("Firing...pistons...");
	}//no one can call this above function since its private
	
	void ignition() { // look at this function its not private
		System.out.println("Igniting....");
		firePiston(); // invoked here...cause ignition and firePiston are in same class
	}
}

class Vehicle
{
	void drive() { // exclusive and inherited to Car
		System.out.println("Vehicle.....driving.....");
	}
}
//class Car extends Engine // abusing inheritance here, because Car IS not an Engine
class Car extends Vehicle // perfect, because Car "isA" Vehicle 
{
	//alll data members below are "hasA"...car has...a and so on
	String numberPlate; //hasA
	String model; //hasA
	Engine eng = new Engine(); //look at this line, its not in ANY FUNCTION --- hasA
					// its in the AIR of this Class AIR means the empty spaces here
	
	
	void startCar() { // lets get the Car keys and start the Car which will
						// start the engine , where is the engine .. --> line number 33
		System.out.println("Trying to start the Car .....");
		eng.ignition();// Car is trying to access the Engine's function here
		System.out.println("Car is started.....");
		drive(); // invoking super class function
		
	}
	//look at the new version
	
	//producesA			usesA
	//|							|
	Smoke startCar(Fuel f) { // lets get the Car keys and start the Car which will
		// start the engine , where is the engine .. --> line number 33
		System.out.println("Trying to start the Car .....");
		eng.ignition();// Car is trying to access the Engine's function here
		System.out.println("Car is started.....");
		drive(); // invoking super class function
		Smoke s = new Smoke();
		return s; // produce the smoke by using the fuel if ....
	}
}
class Smoke
{
	//pollution control parameters can be here
	void showSmoke() {
		System.out.println("Smoke color is OK ...under...PUC.(Pollution Under Control).......");
	}
}
class Fuel
{
	
}
class Petrol extends Fuel // isA 
{
	
}

//thats all

