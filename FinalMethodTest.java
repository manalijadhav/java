
public class FinalMethodTest {
	public static void main(String[] args) {
		//Object c = new GraphicalChess();
		Object c = new Chess();
		
	}
}

//following class B be
final class Chess // Ruchika 
{
	void moveBishop() {
		System.out.println("Bishop is moving..diagonally...bi-directional...N step..");
		//math calc....
	}
}
class GraphicalChess //extends Chess // Arnav
{
	void moveMyBishop() { //gui + super class logic
		//super.moveBishop(); //invoke super class function 
		//expanding the current class contract  
		System.out.println("Bishop is jumping ..anywhere L Shape.....");
	}
}



