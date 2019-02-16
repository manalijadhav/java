import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest1 {
	public static void main(String[] args) {

		
		try {
			//1. load the driver
			System.out.println("Trying to register the Driver ...");
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			System.out.println("Driver registered...");
			
			//2. connect to the database
			System.out.println("Trying to connect the database.....");
			Connection conn  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Newuser123");
		//	conn.setAutoCommit(false); // keep the transaction in this mode
			System.out.println("Connected to the database....."+conn);
			
			PreparedStatement pst = conn.prepareStatement("insert into dept values (?,?,?)");
			System.out.println("PreparedStatement created.."+pst);
			
		/*	pst.setInt(1, Integer.parseInt(args[0]));
			pst.setString(2, args[1]);
			pst.setString(3, args[2]);*/
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter dept no : ");
			int dno = scan.nextInt();
			
			System.out.println("Enter dept name : ");
			String dname = scan.next();
			
			System.out.println("Enter dept location : ");
			String dloc = scan.next();
			
			pst.setInt(1, dno);
			pst.setString(2, dname);
			pst.setString(3, dloc);
			
			int rows = pst.executeUpdate();
			
			/*System.out.println("Save this record (y/n) ? ");
			String ans = scan.next(); // y yes
			int rows = pst.executeUpdate();
			
			if(ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y")  )
			{
				conn.commit();
				System.out.println("Record saved...");
				
			}	
			else {
				conn.rollback();
				System.out.println("Record discarded...");
			}*/
			
			System.out.println("Firing query..");
			
			
	
			
			System.out.println("rows created .."+rows);
			pst.close();
			conn.close();
			System.out.println("Resources closed...");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
