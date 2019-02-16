public class Circus
{
	public static void main(String args[])
	{
		System.out.println("Circus started..");

		Joker j1 = new Joker();
		j1.name="Jack";
		j1.makeJoke(); 	j1.uniCycling();	j1.juggling();

		RingMaster rm = new RingMaster();
		rm.instruct();

		Lion l = new Lion();
		l.jumpAcrossFireRing();

		Elephant elly = new Elephant();
		elly.playFootBall();

	}
}

class Joker
{
	int age;	
	String name;

	void makeJoke() {
		System.out.println(name +" joker is joking.....");
	}
	void juggling() {
		System.out.println(name+" joker is juggling....");
	}
	void uniCycling() {
		System.out.println(name+" joker is uniCycling....");
	}
}
class Elephant {

	void playFootBall() {
		System.out.println("Elephant is playing football");		
	}
}

class Lion {

	void jumpAcrossFireRing() {
		System.out.println("Lion is jumping across fire rings...");		
	}
}

class RingMaster {

	void instruct() {
		System.out.println("RingMaster is instructing....");		
	}
}


