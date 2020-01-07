import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcInsertTest {

	public static void main(String[] args) {

		try {

            // Load the Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
           //get the connection from DriverManager
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sys as sysdba",
					"manager");
			
             //Prepare the query
			String insertQuery = "Insert into EMPLOYEE VALUES(?,?,?)";
            //Send it db via courier (Statement/PreparedStatement)
			PreparedStatement ps = conn.prepareStatement(insertQuery);
		   
			ps.setInt(1, 4);
			ps.setString(2, "Lakhs");
			ps.setDouble(3, 4500);

            //collect the result
			int count = ps.executeUpdate();

			if (count > 0) {
				System.out.println("Insertion Success");
			} else {
				System.out.println("Insertion failure");
			}

			ps.close();
			conn.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
