public class ExceptionTest4 {
	public static void main(String[] args) {
		
		System.out.println("Begin main...");
	
		int scoreCard1[] = {90,56,78,55,66,77};
		
		try
		{
			System.out.println("score is "+scoreCard1[0]);
			System.out.println("score is "+scoreCard1[1]);
			System.out.println("score is "+scoreCard1[2]);
			System.out.println("score is "+scoreCard1[3]);
			System.out.println("score is "+scoreCard1[4]);
			System.out.println("score is "+scoreCard1[5]);
			System.out.println("score is "+scoreCard1[6]);
			System.out.println("score is "+scoreCard1[7]);
		}
		catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("Arrays index is invalid : "+e);
		}
		
		
		System.out.println("End main...");
	}
}
