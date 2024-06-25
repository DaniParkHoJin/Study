import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBdata {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "1234";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException ex1) {
			System.out.println("����̹� �ε� ���� : " + ex1.toString());
			return;
		} catch (Exception ex2) {
			System.out.println("DB ���� ���� : " + ex2.toString());
			return;
		}
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB ���� ����");
			
			stmt = conn.createStatement();
			String sql = "insert into test01_tbl values(2, 'id02','������', 30)";
			System.out.println("SQL : " + sql);
			int result = stmt.executeUpdate(sql);// ���Ź� ����
			 System.out.println(result + "���� Data �Է� ����!");
					
		} catch (SQLException e) {
			System.out.println("Data �Է� ����! : " + e.getMessage());
		}finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
			}
		}
		System.out.println("DB ���� �� SQL �� ���� ����!");
	}

}
