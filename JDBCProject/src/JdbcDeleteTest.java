import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcDeleteTest {
	
	public static final String UPD_QUERY="UPDATE EMPLOYEE SET SALARY=? WHERE EMPNO=?";
	
	public static final String DEL_QUERY="DELETE EMPLOYEE WHERE EMPNO=?";

	public static void main(String[] args) {

		try {

           //get the connection from DriverManager
			Connection conn = ConnectionUtil.getConnection();
			
            
            //Send it db via courier (Statement/PreparedStatement)
			PreparedStatement ps = conn.prepareStatement(DEL_QUERY);
			ps.setInt(1, 4);

            //collect the result
			int count = ps.executeUpdate();

			if (count > 0) {
				System.out.println("Deletion Success");
			} else {
				System.out.println("Deletion failure");
			}

			ps.close();
			conn.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
