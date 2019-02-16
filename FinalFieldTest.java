//Circle c1 = new Circle(23);
//Circle c2 = new Circle(43);
//Circle c3 = new Circle(63);
class Circle1
{
	final float PI;
	int radius;
	
	Circle1(float x, int r) {
		PI=x;
		radius = r;
		System.out.println("radius "+radius);
	}
	void showCircle() {
		System.out.println("radius "+radius);
		//PI=3.19f;
	}
	
}
public class FinalFieldTest {
	public static void main(String[] args) {
		final float PI;
		int local=98;
		System.out.println("local "+local);
		
		//System.out.println("PI "+PI); 
		PI=3.14f;
		System.out.println("PI "+PI);
		//PI=4.33f;
		System.out.println("PI "+PI);
	}
}
