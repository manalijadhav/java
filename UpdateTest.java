import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {
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
			
			PreparedStatement pst = conn.prepareStatement("update dept set dname=?, loc=? where deptno=?");
			System.out.println("PreparedStatement created.."+pst);
			

			pst.setString(2, args[2]);
			pst.setString(1, args[1]);
			pst.setInt(3, Integer.parseInt(args[0]));
			
			System.out.println("Firing query..");
			int rows = pst.executeUpdate();
			
			System.out.println("rows updated....."+rows);
			pst.close();
			conn.close();
			System.out.println("Resources closed...");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
