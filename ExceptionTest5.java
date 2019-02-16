import java.io.*;

public class ExceptionTest5 {
	public static void main(String[] args) {
		
		System.out.println("Begin main...");

		int x = 100 / 23 ;
		int arry[]={10,20,30};
		System.out.println("fifth item : "+arry[2]);
		
		String str=null;
		System.out.println("str : "+str.toLowerCase());

		String str1="John";
		System.out.println("str1 : "+str1.charAt(2));

		System.out.println("Trying to open a file ...");

		FileInputStream fin = new FileInputStream("abc.txt");

		System.out.println("File is open...");

		System.out.println("Trying to close the file ...");		

		fin.close();

		System.out.println("File is closed..");
		
		System.out.println("End main...");
	}
}
