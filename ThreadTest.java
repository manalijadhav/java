

interface Reactive
{
	void react(); // decide act
}

interface ProActive extends Reactive
{
	void proAct(); // decide act and think
}

interface Responsive extends ProActive {
	void response();
}


class Person implements Reactive
{
	public void react() {
		
	}
}

class Student implements ProActive //isA
{
	public void proAct() {
		
	}
	public void react() {
		
	}
}

class Employee extends Student implements Responsive //isA
{
	public void response() {
		
	}
}
public class ThreadTest {
	public static void main(String[] args) {
		Student s = new Student();
		Employee e = new Employee();
		
		if( s instanceof ProActive) {
			System.out.println("Yes s is ProActive");
		}
		else {
			System.out.println("NO, s is NOT ProActive");
		}
		
		if( s instanceof Responsive) {
			System.out.println("Yes s is Responsive");
		}
		else {
			System.out.println("NO, s is NOT Responsive");
		}
		System.out.println("----------------------------");
		
		if( e instanceof ProActive) {
			System.out.println("Yes e is ProActive");
		}
		else {
			System.out.println("NO, e is NOT ProActive");
		}
		
		if( e instanceof Responsive) {
			System.out.println("Yes e is Responsive");
		}
		else {
			System.out.println("NO, e is NOT Responsive");
		}
		
		/*Car c1= new Car();
		
		Running c2 = new Car();
		
		Car c3 = new Car(c1);
		*/
	}
}



