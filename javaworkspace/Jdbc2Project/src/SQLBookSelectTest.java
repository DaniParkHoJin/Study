import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLBookSelectTest {

	public static void main(String[] args) throws SQLException {

		Connection con = makeConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM BOOKS");
		
		while (rs.next()) {
			int id = rs.getInt("book_id");
			String title = rs.getString("title");
			System.out.println(id + " " + title);
		}

	}

	private static Connection makeConnection() {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String password = "1234";

		Connection con = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� ���� ����");
			try {
				con = DriverManager.getConnection(url, id, password);
				System.out.println("�����ͺ��̽� ���� ����");
			} catch (SQLException e) {
				System.out.println("����̹��� ã�� �� �����ϴ�.");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("���ῡ �����Ͽ����ϴ�.");
		}

		return con;
	}

}
