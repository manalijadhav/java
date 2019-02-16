public class BagTest {
	public static void main(String[] args) {
		// 100 is converted into an object of the Integer class
		// Integer i = new Integer(100);
		//			Object
		//				|
		//-------------------------------
		//	|					|
		//Integer			String
		//100					"jack"
			
		Bag<Integer> bg = new Bag<Integer>(100); //100 is not an int, its an Integer here
		System.out.println("bg is "+bg);
		
		//bg.setBag("Jack");
		
		System.out.println("bg is "+bg);
		
	//	bg.setBag(50.5f);
		
		System.out.println("bg is "+bg);
		
		
		
	}
}
class Bag<T>
{
	T objRef;
	
	Bag(T ref) {		objRef = ref;		}
	
	void setBag(T ref) {		objRef = ref;		}
	
	public String toString() { 		return "Bag [objRef=" + objRef + "]"; 	}
}
