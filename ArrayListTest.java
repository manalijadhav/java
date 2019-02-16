import java.util.*;
class SavingsAccount {} 
class Flight{} 
class Student{}

public class ArrayListTest {
	public static void main(String[] args) {
		
		//content | ButterMilk
		Song s1 = new Song("Tanhayee","Dil Chahta Hai","Sonu Nigam",2001);
		Song s2 = new Song("Zhingat","Sairat","AjayAtul",2016);
		Song s3 = new Song("My Heart Will Go On","Titanic","Celine Dion",1994);
		Song s4 = new Song("Coka","CokaCoka","Sukhie",2019);
		Song s5 = new Song("Yeh Sham Fir Nahi Ayegi","Salaam","Nusrat Fateh Ali Khan",1990);
		
		
		//container | Glass
		ArrayList<Song> jukeBox = new ArrayList<Song>();
		//LinkedList<Song> jukeBox = new LinkedList<Song>();
		//HashSet<Song> jukeBox = new HashSet<Song>();
		
		//TreeSet<Song> jukeBox = new TreeSet<Song>();
		
		//add the contentl in the container | add the ButterMilk in the Glass
		System.out.println("Trying to add the song...");
		jukeBox.add(s1);
		jukeBox.add(s2);
		
	//	jukeBox.add(new Flight());
		jukeBox.add(s3);
	//	jukeBox.add("Ice");
		jukeBox.add(s4);
		
	//	jukeBox.add(new Student());
		
		jukeBox.add(s5);
		jukeBox.add(s5);
		
	//	jukeBox.add(new SavingsAccount());
		
		
		//get the straw | Iterator
		Iterator<Song> iter = jukeBox.iterator();
		
		while(iter.hasNext()) {
			
			//Object o = iter.next(); // o can point to any object
			Song s = iter.next();
			System.out.println("s "+s);
			
			/*if(o instanceof Song) {
				Song s = (Song) o; // cast
				System.out.println("s "+s);
			}
			else if(o instanceof String) {
				String str = (String) o; // cast
				System.out.println("str "+str);
			} */
			
		}
		
		
		
			
	}
}
