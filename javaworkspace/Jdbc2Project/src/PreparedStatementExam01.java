import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExam01 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "hr";
		String password = "1234";
		
		BufferedReader in_empno = new BufferedReader(new InputStreamReader(System.
				in));
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException ex1) {
			System.out.println("드라이버 로딩 에러 : " + ex1.toString());
		} catch (Exception ex2) {
			System.out.println("DB 접속 실패 : " + ex2.toString());
		}
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			String empno;// 사원번호
			System.out.print("사원번호 입력 : ");
			empno = in_empno.readLine();
			
			String sql = "SELECT FIRST_NAME, JOB_ID, SALARY FROM EMPLOYEES WHERE EMPLOYEE_ID = ?";
			
			pstmt= conn.prepareStatement(sql);
			
			pstmt.setNString(1, empno);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.println("ename : " + rs.getString(1) + "   job : " + rs.getString(2) + "   sal : " + rs.getInt(3));
			}
			
		} catch (Exception ex3) {
			System.out.println("실패!! : " + ex3.getMessage());
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception ex) {
			}
		}
	}

}
