import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) {

		
		try {
			//1. load the driver
			System.out.println("Trying to register the Driver ...");
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			System.out.println("Driver registered...");
			
			//2. connect to the database
			System.out.println("Trying to connect the database.....");
			Connection conn  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Newuser123");
			System.out.println("Connected to the database....."+conn);
			
			PreparedStatement pst = conn.prepareStatement("insert into dept values (?,?,?)");
			System.out.println("PreparedStatement created.."+pst);
			
			pst.setInt(1, Integer.parseInt(args[0]));
			pst.setString(2, args[1]);
			pst.setString(3, args[2]);
			
			System.out.println("Firing query..");
			int rows = pst.executeUpdate();
			
			System.out.println("rows created .."+rows);
			pst.close();
			conn.close();
			System.out.println("Resources closed...");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
