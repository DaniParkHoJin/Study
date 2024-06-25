import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExam02 {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "hr", "1234");

			String sql = "CREATE TABLE syh1012( id VARCHAR2(10), password VARCHAR2(10))";
			pstmt = conn.prepareStatement(sql);
			int updateCount = pstmt.executeUpdate();
			System.out.println("createCount : " + updateCount);

			sql = "insert into syh1012 values(?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "syh2002");
			pstmt.setString(2, "1111");
			updateCount = pstmt.executeUpdate();
			System.out.println("insertCount : " + updateCount);

			sql = "select * from syh1012";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.print("id : " + rs.getString(1));
				System.out.println(", password : " + rs.getString(2));
			}
			
			sql = "drop table syh1012";
			pstmt = conn.prepareStatement(sql);
			updateCount = pstmt.executeUpdate();
			System.out.println("dropCount : " + updateCount);

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {
			}
		}
	}

}
