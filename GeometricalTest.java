
public class GeometricalTest {
	public static void main(String[] args) {
		GeometricalShape gs ;
		Circle cir = new Circle(100);
		Square sq = new Square(56);

		gs = sq;
		
		/*cir.draw();
		cir.calcArea();
		cir.calcPeriphery();*/
		
		gs.calcArea();
		gs.calcPeriphery();
		gs.draw();
		
	}
}

abstract class BankAccount
{
	int acno; String name; float balance;
	abstract void deposit(float amt);
	abstract void withdraw(float amt);
	abstract void fundTransfer();
	abstract void changePin();
	
	void showBankAccount() {
		System.out.println("acno "+acno);
		System.out.println("name "+name);
		System.out.println("balance "+balance);
	}
}
class SavingsAccount extends BankAccount
{
	void deposit(float amt) { }
	void withdraw(float amt) { }
	@Override
	void fundTransfer() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void changePin() {
		// TODO Auto-generated method stub
		
	}
	
}
class CurrentAccount extends BankAccount
{
	void deposit(float amt) { }
	void withdraw(float amt) { }
	@Override
	void fundTransfer() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void changePin() {
		// TODO Auto-generated method stub
		
	}
}
class CreditAccount extends BankAccount
{

	@Override
	void deposit(float amt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void withdraw(float amt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void fundTransfer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void changePin() {
		// TODO Auto-generated method stub
		
	}
	
}



abstract class GeometricalShape
{
	// abstract methods enclosed in an abstract class
	//declared methods and not defined
		abstract void draw(); // partial contract
		abstract void calcArea();
		abstract void calcPeriphery();
		
		void fillColor() { // inherited...method might be overidden by the child
			System.out.println("Filling color...inside a geometrical shape...");
		}
}

//on the next child its a mandate to define above 3 abstract methods
class Circle extends GeometricalShape //isA
{
	int rad1;
	static final float PI=3.14f;// shared constant
	
	Circle(int r) {
		rad1 = r;
	}
	void fillColor() {
		
	}
	void calcPeriphery() { 
		float peri = 2 * PI * rad1;
		System.out.println("Periphery of Circle : "+peri);
	}
	void draw() { // radius is fix length}
		System.out.println("Drawing circle..");
	}
	void calcArea() { 
		float area  = PI * rad1 * rad1;
		System.out.println("Area of Circle : "+area);
	}
}
class Ellipse extends Circle //isA
{
	int rad2;
	Ellipse(int r1, int r2) {
		super(r1);
		rad2 = r2;
	}
	void draw() {
		// vrad, hrad ..eccentricity should not be zero
		System.out.println("Drawing..Ellipse...");
	}
}

class Square extends GeometricalShape //isA
{
	int side1;
	
	Square (int r) {
		side1 = r;
	}
	void calcPeriphery() { 
		float peri = 4*side1;
		System.out.println("Periphery of Square : "+peri);
	}
	void draw() { // radius is fix length}
		System.out.println("Drawing Square..");
	}
	void calcArea() { 
		float area  = side1 * side1;
		System.out.println("Area of Square: "+area);
	}
}



