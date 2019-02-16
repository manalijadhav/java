import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
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
			
			Statement st = conn.createStatement();
			System.out.println("Statement created.."+st);
			
			System.out.println("Firing query..");
			ResultSet rs = st.executeQuery("select * from dept");
			System.out.println("Query fired..");
			
			while(rs.next()) {
				int dno = rs.getInt(1);
				String dname  = rs.getString(2);
				String loc = rs.getString(3);
				System.out.println("deptno	:	"+dno);
				System.out.println("dname	:	"+dname);
				System.out.println("deploc	:	"+loc);
				System.out.println("--------------------");
			}
			rs.close();
			st.close();
			conn.close();
			System.out.println("Resources closed...");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
