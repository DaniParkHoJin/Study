import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class SQLSelectTest {
	public static Connection makeConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String password = "1234";
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 적재 성공");
			con = DriverManager.getConnection(url, id, password);
			System.out.println("데이터베이스 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 적재 성공");
		} catch (SQLException e) {
			System.out.println("연결에 실패하였습니다.");
		}

		return con;
	}

	public static void main(String[] args) throws SQLException {
		Connection con = makeConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from employees");

		int employee_id;
		String first_name;
		String last_name;
		String email;
		String phone_number;
		Date hire_date;
		String job_id;
		int salary;
		double commission_pct;
		int manager_id;
		int department_id;

		System.out.printf("%-10s\t%-10s\t%-10s\t%-10s\t%-20s\t%-10s\t%-10s\t%-10s\t%-10s\t%-10s\t%-10s\n", "사번", "이름",
				"성", "이메일", "전화번호", "입사일", "잡ID", "월급", "커미션(%)", "관리자ID", "부서");
		while (rs.next()) {
			employee_id = rs.getInt("employee_id");
			first_name = rs.getString("first_name");
			last_name = rs.getString("last_name");
			email = rs.getString("email");
			phone_number = rs.getString("phone_number");
			hire_date = rs.getDate("hire_date");
			job_id = rs.getString("job_id");
			salary = rs.getInt("salary");
			commission_pct = rs.getDouble("commission_pct");
			manager_id = rs.getInt("manager_id");
			department_id = rs.getInt("department_id");

			System.out.printf("%-10d\t%-10s\t%-10s\t%-10s\t%-20s\t%-10s\t%-10s\t%-10d\t%-10.2f\t%-10d\t%-10d\n",
					employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct,
					manager_id, department_id);
		}

	}

}
