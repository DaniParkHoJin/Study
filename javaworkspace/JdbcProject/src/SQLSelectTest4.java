import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLSelectTest4 {

	public static void main(String[] args) throws SQLException {
		
		Connection con = null; // Connection ��ü ���� - Ư�� �����ͺ��̽����� ����(����)�� ��Ÿ���ϴ�. ���� ���ؽ�Ʈ ������ SQL ���� ����ǰ� ����� ��ȯ�˴ϴ�.
		con = makeConnection(); //

		firstAnswer(con);
		con.close();


	}

	private static void firstAnswer(Connection con) throws SQLException {
		// ����� �޿� ���� �� ������ �ּ� �޿��� �ް� �ִ� ����� ���� �̸�(Name�� ��Ī), ����, �޿�, �Ի����� ����Ͻÿ�.
		Statement stmt = con.createStatement();
		ResultSet employees = null;

		String sql;// sql�� �Է�

		String name;
		String jobId;
		double salary;
		String hireDate;

		employees = stmt.executeQuery(firstQuery());
		
		
		System.out.printf("%-30s%-10s%-10s%-20s\n", "�̸�", "��å", "�޿�", "�Ի���");
		while (employees.next()) {
			name = employees.getString(1);
			jobId = employees.getString(2);
			salary = employees.getDouble(3);
			hireDate = employees.getString(4);
			System.out.printf("%-30s%-10s%-10.2f%-20s\n", name, jobId, salary, hireDate);
		}
		employees.close();
		stmt.close();
	}

	private static String firstQuery() {
		StringBuilder query = new StringBuilder();
		query.append("SELECT");
		query.append(" ");
		query.append("E.");
		query.append("FIRST_NAME || ");
		query.append("' ");
		query.append("'");
		query.append("||E.LAST_NAME");
		query.append(" ");
		query.append("AS");
		query.append(" ");
		query.append("Name");
		query.append(", ");
		query.append("E.JOB_ID");
		query.append(", ");
		query.append("E.SALARY");
		query.append(", ");
		query.append("E.HIRE_DATE");
		query.append(" ");
		query.append("FROM");
		query.append(" ");
		query.append("EMPLOYEES E");
		query.append(" ");
		query.append("WHERE");
		query.append(" ");
		query.append("SALARY");
		query.append(" ");
		query.append("<");
		query.append(" ");
		query.append("ANY");
		query.append("(");
		query.append("SELECT");
		query.append(" ");
		query.append("MIN");
		query.append("(");
		query.append("SALARY");
		query.append(")");
		query.append("");
		query.append("FROM");
		query.append(" ");
		query.append("EMPLOYEES");
		query.append(" ");
		query.append("GROUP");
		query.append(" ");
		query.append("BY");
		query.append(" ");
		query.append("JOB_ID");
		query.append(")");
		return query.toString();

	}

	private static Connection makeConnection() {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // ����̹� ����
		String id = "hr"; // ������ ���̽� ���� ���̵�
		String password = "1234"; // ������ ���̽� ���� �н�����

		Connection con = null;

		// ����Ŭ �����ͺ��̽� ������ ���� �⺻ ����
		// �ϴ� Class.forName�� ����� F2 Ű�� ���� ����
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //
			System.out.println("����̹� ���� ����");
			con = DriverManager.getConnection(url, id, password);
			System.out.println("�����ͺ��̽� ���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� ���� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("�����ͺ��̽� ���� ����");
		}

		return con;
	}

}
