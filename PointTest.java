public class PointTest {
	public static void main(String[] args) {
		/*Point2D p2dObj1 = new Point2D(100,200);
		p2dObj1.showPoint2D();
		System.out.println("-------------------------");
		Point3D p3dObj1 = new Point3D(50,60,70);
		p3dObj1.showPoint3D();*/
		
		//Father gf = new Father ();
		Child  c = new Child(100,200,300);
		if (c instanceof Child) {
			System.out.println("Yes c is pointing to an instance of Child");
		}
		else {
			System.out.println("No, c is NOT pointing to an instance of Child");
		}
		
		System.out.println("-------------------------------");
		
		
		if (c instanceof Father) {
			System.out.println("Yes c is pointing to an instance of Father");
		}
		else {
			System.out.println("No, c is NOT pointing to an instance of Father");
		}
		
System.out.println("-------------------------------");
		
		
		if (c instanceof GrandFather) {
			System.out.println("Yes c is pointing to an instance of GrandFather");
		}
		else {
			System.out.println("No, c is NOT pointing to an instance of GrandFather");
		}
		
	}
}
class Point2D
{
	private int x; 	private int y;
	
		Point2D(int a, int b) {			System.out.println("Point2D(int,int) ctor....");
			x = a;			y = b;
		}
		void showPoint2D() {			System.out.println("x : "+x);			System.out.println("y : "+y);			}
}
class Point3D extends Point2D
{
	private int z;
			Point3D(int x,int y, int z ) {
				super(x,y);
				System.out.println("Point3D(int,int,int) ctor....");
				this.z=z; // this will point to the object's data OR field 
		}
		void showPoint3D() {
			
			System.out.println("z : "+z);
		}
}

class GrandFather 
{
	GrandFather (int g) {
		//super();
		System.out.println("GrandFather ctor.."+g);
	}
}
class Father extends GrandFather
{
	Father (int p,int q) {
		super(p);
		System.out.println("Father ctor.."+q);
	}
}
class Child extends Father 
{
	int z;
	Child(int x,int y, int z ) {
		super(x,y);
		System.out.println("Child ctor.."+z);
	}
}




