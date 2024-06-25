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
			System.out.println("드라이버 적재 성공");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("데이터 베이스 연결 성공");
		} catch (ClassNotFoundException ex1) {
			System.out.println("드라이버 로딩 에러 : " + ex1.toString());
			return;
		} catch (SQLException ex2) {
			System.out.println("DB 접속 실패 : " + ex2.toString());
			return;
		}

		// sql 문 작성
		String sql = "CREATE TABLE test01_tbl (num NUMBER(6), id VARCHAR2(10), name VARCHAR2(20), age NUMBER(3))";

		try {
			System.out.println("DB 연결 성공");
			stmt = conn.createStatement();// 질의 객체 생성
			stmt.executeUpdate(sql);// 질의 수행
		} catch (Exception ex3) {
			System.out.println("SQL 문 수행 오류 : " + ex3.toString());
			return;
		} try {
			stmt.close(); // 객체 반환
			conn.close(); // 연결 끊기
		} catch (Exception ex4) {
		}
		System.out.println("DB 접속 및 SQL 문 수행 성공!");

	}// main end

}// class end
