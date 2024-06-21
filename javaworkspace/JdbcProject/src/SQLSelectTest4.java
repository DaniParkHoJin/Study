import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLSelectTest4 {

	public static void main(String[] args) throws SQLException {
		
		Connection con = null; // Connection 객체 생성 - 특정 데이터베이스와의 연결(세션)을 나타냅니다. 연결 컨텍스트 내에서 SQL 문이 실행되고 결과가 반환됩니다.
		con = makeConnection(); //

		firstAnswer(con);
		con.close();


	}

	private static void firstAnswer(Connection con) throws SQLException {
		// 사원의 급여 정보 중 업무별 최소 급여를 받고 있는 사원의 성과 이름(Name로 별칭), 업무, 급여, 입사일을 출력하시오.
		Statement stmt = con.createStatement();
		ResultSet employees = null;

		String sql;// sql문 입력

		String name;
		String jobId;
		double salary;
		String hireDate;

		employees = stmt.executeQuery(firstQuery());
		
		
		System.out.printf("%-30s%-10s%-10s%-20s\n", "이름", "직책", "급여", "입사일");
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
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 드라이버 적재
		String id = "hr"; // 데이터 베이스 접속 아이디
		String password = "1234"; // 테이터 베이스 접속 패스워드

		Connection con = null;

		// 오라클 데이터베이스 접속을 위한 기본 순서
		// 일단 Class.forName을 만들고 F2 키로 오류 수정
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //
			System.out.println("드라이버 적재 성공");
			con = DriverManager.getConnection(url, id, password);
			System.out.println("데이터베이스 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 적재 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 실패");
		}

		return con;
	}

}
