
public class ExceptionTest1 {
	public static void main(String[] args) {
		
		System.out.println("Begin main...");
		
		//String str = "jack";
		String str = null;
		
		System.out.println(" str is "+str);
		
		try
		{
			char ch = str.charAt(13); // NullPointerException n  = new NullPointerException();
													// 		throw n;
										// StringIndexOutOfBoundsException	s = new StringIndexOutOfBoundsException();
								//throw s;
			System.out.println("ch is "+ch);
		}	
		catch(StringIndexOutOfBoundsException		x) 		{
			System.out.println("Problem : "+x.getMessage());
		}
		catch(NullPointerException y) {
			System.out.println("Object is  : "+y.getMessage());
			y.printStackTrace();
		}
		
		
		
		
		System.out.println("End main...");
	}
}
