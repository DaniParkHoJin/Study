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
			System.out.println("����̹� ���� ����");
			con = DriverManager.getConnection(url, id, password);
			System.out.println("�����ͺ��̽� ���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� ���� ����");
		} catch (SQLException e) {
			System.out.println("���ῡ �����Ͽ����ϴ�.");
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

		System.out.printf("%-10s\t%-10s\t%-10s\t%-10s\t%-20s\t%-10s\t%-10s\t%-10s\t%-10s\t%-10s\t%-10s\n", "���", "�̸�",
				"��", "�̸���", "��ȭ��ȣ", "�Ի���", "��ID", "����", "Ŀ�̼�(%)", "������ID", "�μ�");
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
