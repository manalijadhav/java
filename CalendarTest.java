import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

//factory method design pattern

abstract class Flower
{
	abstract void flowering() ;
	
	static Flower getFlower() { // non-abstract
		
		Rose r = new Rose();
		return r;
	}
	static Flower getFlower(String hint) { // non-abstract
		Flower ref = null;
		if(hint.equalsIgnoreCase("valentine") ) {
			ref  = new Rose();
		}
		else if(hint.equalsIgnoreCase("sun") ) {
			ref  = new SunFlower();
		} 
		else if(hint.equalsIgnoreCase("mari") ) {
			ref  = new MariGold();
		} 
		if(hint.equalsIgnoreCase("lil") ) {
			ref  = new Lily();
		} 
		return ref;
	}
}  
class Rose extends Flower
{
	void flowering() {
		System.out.println("Rose is flowering..");
	}
}
class Lily extends Flower
{
	void flowering() {
		System.out.println("Lily is flowering..");
	}
}
class SunFlower extends Flower
{
	void flowering() {
		System.out.println("SunFlower is flowering..");
	}
}

class MariGold extends Flower
{
	void flowering() {
		System.out.println("MariGold is flowering..");
	}
}
public class CalendarTest {
	public static void main(String[] args) {
	
		
		//
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Enter hint ");
		String anyHint = scan.nextLine();
		Flower f = Flower.getFlower();
		f.flowering();*/
		//System.out.println("d "+d);
		
		Date d = new Date();
		
		System.out.println("d "+d);
	/*	String str[] = TimeZone.getAvailableIDs();
		for (int i = 0; i < str.length; i++) {
			System.out.println("ID "+str[i]);
		}*/
		
		//TimeZone tz = TimeZone.getTimeZone("Europe/London");
		//Calendar c = Calendar.getInstance(tz);
		Calendar cal = Calendar.getInstance();
		
		String months [] = {"January","February","March"}; // fill all months here...
		
		System.out.println("DAY    :"+cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("Month :"+months[cal.get(Calendar.MONTH)]); // starts with 0 
		System.out.println("Year :"+cal.get(Calendar.YEAR));
		System.out.println("Hour :"+cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("Mnt :"+cal.get(Calendar.MINUTE));
		System.out.println("Sec :"+cal.get(Calendar.SECOND));
		System.out.println("Mi :"+cal.get(Calendar.MILLISECOND));
		
		
		
		
	}
}



