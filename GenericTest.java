
public class GenericTest {
	public static void main(String[] args) {
		System.out.println("Begin main");
		//MyIntegers mi = new MyIntegers(10, 20);
		MyValues<Integer> mi = new MyValues<Integer>(10, 20);
		
		System.out.println("mi is "+mi);
		mi.swap();
		System.out.println("mi is "+mi);

		System.out.println("----------------------------");
		
		MyValues<Float> mf = new MyValues<Float>(10.5f, 20.7f);
		
		System.out.println("mf is "+mf);
		mf.swap();
		System.out.println("mf is "+mf);

		System.out.println("----------------------------");
		
		MyValues<String> ms = new MyValues<String>("My Heart Will Go On","Julie Julie");
		
		System.out.println("ms is "+ms);
		ms.swap();
		System.out.println("ms is "+ms);
		
		System.out.println("----------------------------");

		
		Song s1 = new Song("Tanhayee","Dil Chahta Hai","Sonu Nigam",2001);
		Song s2 = new Song("Zhingat","Sairat","AjayAtul",2016);
		
		MyValues<Song> jukeBox = new MyValues<Song>(s1,s2);
		
		System.out.println("jukeBox : "+jukeBox);
		
		jukeBox.swap();
		
		System.out.println("jukeBox : "+jukeBox);
	
		System.out.println("End main");
	}
}
/*
class MyIntegers // its a container to hold 2 integers
{
	private int i;
	private int j;
	
	public MyIntegers(int i, int j) { // service to initialize
		super();
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() { // service to print
		return "MyIntegers [i=" + i + ", j=" + j + "]";
	}
	void swap() { //  service to 
		int temp = i;
		i = j;
		j = temp;
	}
	
}

class MyFloats
{
	private float i;
	private float j;
	
	public MyFloats(float i, float j) {
		super();
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "MyFloats [i=" + i + ", j=" + j + "]";
	}
	void swap() {
		float temp = i;
		i = j;
		j = temp;
	}
}

class MyStrings
{
	private String i;
	private String j;
	
	public MyStrings(String i, String j) {
		super();
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "MyStrings [i=" + i + ", j=" + j + "]";
	}
	void swap() {
		String temp = i;
		i = j;
		j = temp;
	}
}*/
// Song s1 .. Song s2... Song s3.
//s1.compareTo(s2);
//TreeSet ts = new TreeSet();    ts.add(s1); ts.add(s2)...ts.add(s3)
class Song implements Comparable<Song>
{ //Doctor  d= s;
	//Running  r = c1;
	//Comparable cmp = s1;
	private String title;	private String album;	private String artist;	private int year;
	
	public int compareTo(Song o) {
		System.out.println("Comparing year "+year+" with year "+o.year);
		return    Integer.compare(o.year, year);
	}
	
	public Song(String title, String album, String artist, int year) {
		super();
		this.title = title;
		this.album = album;
		this.artist = artist;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", album=" + album + ", artist=" + artist + ", year=" + year + "]";
	}
	
}
/*
class MySongs
{
	private Song i;
	private Song  j;
	
	public MySongs(Song i, Song j) {
		super();
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "MySongs [i=" + i + ",\nj=" + j + "]";
	}
	void swap() {
		Song temp = i;
		i = j;
		j = temp;
	}
}
*/

class MyValues<AnyType>
{
	private AnyType i;	private AnyType j;
	
	public MyValues(AnyType i, AnyType j) {
		super();
		this.i = i;
		this.j = j;
	}

	public String toString() {
		return "MyValues [i=" + i + ",\nj=" + j + "]";
	}
	void swap() {
		AnyType temp = i;
		i = j;
		j = temp;
	}
}














