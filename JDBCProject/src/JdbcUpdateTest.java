import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcUpdateTest {
	
	public static final String UPD_QUERY="UPDATE EMPLOYEE SET SALARY=? WHERE EMPNO=?";

	public static void main(String[] args) {

		try {

           //get the connection from DriverManager
			Connection conn = ConnectionUtil.getConnection();
			
            
            //Send it db via courier (Statement/PreparedStatement)
			PreparedStatement ps = conn.prepareStatement(UPD_QUERY);
			ps.setInt(1, 7000);
			ps.setInt(2, 2);

            //collect the result
			int count = ps.executeUpdate();

			if (count > 0) {
				System.out.println("Updation Success");
			} else {
				System.out.println("Updation failure");
			}

			ps.close();
			conn.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
