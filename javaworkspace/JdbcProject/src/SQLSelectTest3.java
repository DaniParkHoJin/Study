import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SQLSelectTest3 {

	public static Connection makeConnection() {

		Scanner input = new Scanner(System.in);

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id;
		String password;
		Connection con = null;
		do {
			System.out.print("���̵� : ");
			id = input.next();
			System.out.print("�н����� : ");
			password = input.next();

			if (id.equals("hr") && password.equals("1234"))
				break;

		} while (true);

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� ���� ����");
			con = DriverManager.getConnection(url, id, password);
		} catch (ClassNotFoundException e) {
			System.out.println("����̹��� ã�� �� �����ϴ�.");
		} catch (SQLException e) {
			System.out.println("���ῡ �����Ͽ����ϴ�.");
		}

		return con;
	}

	public static void main(String[] args) throws SQLException {

		Scanner input = new Scanner(System.in);

		Connection con = makeConnection();

		Statement stmt = con.createStatement();

		ResultSet locations = null;

		String sql;
		String city;

		sql = "SELECT city as city FROM LOCATIONS";

		locations = stmt.executeQuery(sql);

		while (locations.next()) {
			System.out.println(locations.getString("city"));
		}

		locations.close();

		System.out.println();

		System.out.print("�˻��� ���� �ϳ��� �Է��ϼ���:");
		city = input.nextLine();

		ResultSet result = null;
		result = stmt.executeQuery(query(city));

		String name;
		String jobTitle;
		String departmentName;
		String cityName;

		System.out.printf("%-20s %-20s\t%-20s\t%-20s\n", "�����", "����", "�μ���", "���ø�");

		while (result.next()) {
			name = result.getString("NAME");
			jobTitle = result.getString("JOB_TITLE");
			departmentName = result.getString("DEPARTMENT_NAME");
			cityName = result.getString("CITY");
			System.out.printf("%-20s %-20s\t%-20s\t%-20s\n", name, jobTitle, departmentName, cityName);
		}
		input.close();
		result.close();
		stmt.close();
		con.close();

	}

	public static String query(String city) {
		StringBuilder query = new StringBuilder();
		query.append("SELECT E.FIRST_NAME || ' ' || E.LAST_NAME AS NAME, J.JOB_TITLE, D.DEPARTMENT_NAME, L.CITY");
		query.append(" ");
		query.append("FROM EMPLOYEES E,");
		query.append(" ");
		query.append("DEPARTMENTS D,");
		query.append(" ");
		query.append("LOCATIONS L,");
		query.append(" ");
		query.append("JOBS J");
		query.append(" ");
		query.append("WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID");
		query.append(" ");
		query.append("AND D.LOCATION_ID = L.LOCATION_ID");
		query.append(" ");
		query.append("AND E.JOB_ID = J.JOB_ID");
		query.append(" ");
		query.append("AND LOWER(L.CITY) = LOWER(");
		query.append("'");
		query.append(city);
		query.append("'");
		query.append(")");
		System.out.println(query.toString());
		return query.toString();
	}
}
