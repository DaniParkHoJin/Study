import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExam {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "1234";

		BufferedReader in_empno = new BufferedReader(new InputStreamReader(System.in));

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� ���� ����");
		} catch (ClassNotFoundException ex1) {
			System.out.println("����̹� �ε� ���� : " + ex1.toString());
			return;
		} catch (Exception e2) {
			System.out.println("DB ���� ����");
			return;
		}

		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB ���� ����");

			String empno; // �����ȣ

			System.out.print("�����ȣ �Է� : ");
			empno = in_empno.readLine();

			String sql = "select FIRST_NAME, JOB_ID, SALARY from EMPLOYEES where EMPLOYEE_ID = " + empno;

			stmt = conn.createStatement();// SQL�� ���� ��ü ����
			rs = stmt.executeQuery(sql);// ���ǹ� ����

			while (rs.next()) {
				System.out.println("FIRST_NAME : " + rs.getString(1) + "   JOB_ID : " + rs.getString(2) + "   sal : "
						+ rs.getString(3));
			}
		} catch (Exception e) {
			System.out.println(" ���� !! : " + e.getMessage());
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (Exception ex) {
			}
		}

	}

}
