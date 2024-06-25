import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTable {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "1234";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� ���� ����");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("������ ���̽� ���� ����");
		} catch (ClassNotFoundException ex1) {
			System.out.println("����̹� �ε� ���� : " + ex1.toString());
			return;
		} catch (SQLException ex2) {
			System.out.println("DB ���� ���� : " + ex2.toString());
			return;
		}

		// sql �� �ۼ�
		String sql = "CREATE TABLE test01_tbl (num NUMBER(6), id VARCHAR2(10), name VARCHAR2(20), age NUMBER(3))";

		try {
			System.out.println("DB ���� ����");
			stmt = conn.createStatement();// ���� ��ü ����
			stmt.executeUpdate(sql);// ���� ����
		} catch (Exception ex3) {
			System.out.println("SQL �� ���� ���� : " + ex3.toString());
			return;
		} try {
			stmt.close(); // ��ü ��ȯ
			conn.close(); // ���� ����
		} catch (Exception ex4) {
		}
		System.out.println("DB ���� �� SQL �� ���� ����!");

	}// main end

}// class end
