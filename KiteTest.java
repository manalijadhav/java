//javac KiteTest.java
//java KiteTest  ( KiteTest.main();  )

public class KiteTest {
	public static void main(String[] args) {
		
		//System.out.println("Kite count  is : "+Kite.kiteCount);
		
		Kite.showKiteCount();
		
		Kite k1 = new Kite("Anwar","Blue",30,true);
		Kite k2 = new Kite("Disha","Green",60,true);
		Kite k3 = new Kite("Aditya","Brown",90,true);
		
		//System.out.println("Kite count  is : "+Kite.kiteCount);
		Kite.showKiteCount();
		
		System.out.println("k1 "+k1);
		System.out.println("k2 "+k2);
		System.out.println("k3 "+k3);
		
		Kite k5 = new Kite("Arjun","Black",120,true);
		Kite k6 = new Kite("Arzoo","Red",150,true);
		
		//System.out.println("Kite count  is : "+Kite.kiteCount);
		Kite.showKiteCount();
		
		
	}
}
class Kite
{
	//non-static data member
	String kiteOwner;
	String kiteColor;
	int length;
	boolean isFlying;
	
	//Class's variable - they pre-loaded in the memory
	static int kiteCount; // shared data - can be referred via ClassName
	
	//static 
	static void showKiteCount() // can refer other static members
	{
		System.out.println("Kite count  is : "+Kite.kiteCount);
//	length=60;
	}
	
	//non-static
	void fly() {
	System.out.println("count is:"+kiteCount);
	}
	
	public Kite(String kiteOwner, String kiteColor, int length, boolean isFlying) {
		super();
		System.out.println("Kite constructed...");
		this.kiteOwner = kiteOwner;
		this.kiteColor = kiteColor;
		this.length = length;
		this.isFlying = isFlying;
		++kiteCount;
	}
	@Override
	public String toString() {
		return "Kite [kiteOwner=" + kiteOwner + ", kiteColor=" + kiteColor + ", length=" + length + ", isFlying="
				+ isFlying + "]";
	}
	
	
}

