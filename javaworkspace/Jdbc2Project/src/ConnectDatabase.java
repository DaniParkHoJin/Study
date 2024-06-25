import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {

	public static void main(String[] args) {

		Connection con = makeConnection();
		
		
	}

	private static Connection makeConnection() {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "1234";
		
		Connection con = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 적재 성공");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("오라클 접속 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 적재 실패");
		} catch (SQLException e) {
			System.out.println("연결에 실패하였습니다.");
		}
		
		return con;
	}

}
