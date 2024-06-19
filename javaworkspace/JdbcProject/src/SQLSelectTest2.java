import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class SQLSelectTest2 {
	public static Connection makeConnection() {

		Scanner input = new Scanner(System.in);

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id;
		String password;
		Connection con = null;

		do {
			System.out.print("아이디 : ");
			id = input.next();
			System.out.print("패스워드 : ");
			password = input.next();

			if (id.equals("hr") && password.equals("1234"))
				break;

		} while (true);

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 적재 성공");
			con = DriverManager.getConnection(url, id, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("연결에 실패하였습니다.");
		}

		return con;
	}

	public static void main(String[] args) throws SQLException {
		Scanner input = new Scanner(System.in);

		Connection con = makeConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = null;

		String sql;
		int inputSal;

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

		System.out.print("직원의 급여 입력 : ");
		inputSal = input.nextInt();

		System.out.println("입력한 급여 " + inputSal + "보다 많은 직원");
		sql = "SELECT * FROM EMPLOYEES where SALARY >= " + inputSal + " order by salary";
		rs = stmt.executeQuery(sql);
		while (rs.next()) {

			/**
			 * 
			 * 이름 널? 유형 -------------- -------- ------------ EMPLOYEE_ID NOT NULL NUMBER(6)
			 * FIRST_NAME VARCHAR2(20) LAST_NAME NOT NULL VARCHAR2(25) EMAIL NOT NULL
			 * VARCHAR2(25) PHONE_NUMBER VARCHAR2(20) HIRE_DATE NOT NULL DATE JOB_ID NOT
			 * NULL VARCHAR2(10) SALARY NUMBER(8,2) COMMISSION_PCT NUMBER(2,2) MANAGER_ID
			 * NUMBER(6) DEPARTMENT_ID NUMBER(4)
			 * 
			 * 
			 *
			 **/

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
