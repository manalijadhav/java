
public class WrapperTest {
	public static void main(String[] args) {
		BiggestBox  bgtBox = new BiggestBox();
		bgtBox.bgrBox.bx.ch.rng.showRing();
			
		int i=10;
		
		Integer j = new Integer(10);
		
	}
}

class Ring {
	void showRing() {
		System.out.println("Wow...the ring...");
	}
}

class Chocolate {
	Ring rng = new Ring();

}

class Box {
	Chocolate ch = new Chocolate();
}

class BiggerBox {
	Box bx = new Box();
}

class BiggestBox {
	BiggerBox bgrBox = new BiggerBox();
}
