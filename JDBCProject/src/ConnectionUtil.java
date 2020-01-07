import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	
	public static Connection getConnection() {

        try {
			// Load the Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
      //get the connection from DriverManager
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sys as sysdba",
					"manager");
			return conn;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return null;
	}
}
