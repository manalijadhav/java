public class ExceptionTest2 {
	public static void main(String[] args) {
		
		System.out.println("Begin main...");
		
		try {
			
			int i=100;		System.out.println("i is  "+i);
			int j=0;		System.out.println("j is  "+j);
			int k= i/j;		System.out.println("k is  "+k);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic problem : "+e.getMessage());
		}
		System.out.println("End main...");
	}
}
