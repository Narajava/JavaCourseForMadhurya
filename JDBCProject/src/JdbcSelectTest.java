import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcSelectTest {
	
	public static final String SEL_QUERY="SELECT * FROM EMPLOYEE";

	public static void main(String[] args) {

		try {

           //get the connection from DriverManager
			Connection conn = ConnectionUtil.getConnection();
			
            
            //Send it db via courier (Statement/PreparedStatement)
			PreparedStatement ps = conn.prepareStatement(SEL_QUERY);
			
            //collect the result
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
            
			rs.close();
			ps.close();
			conn.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
