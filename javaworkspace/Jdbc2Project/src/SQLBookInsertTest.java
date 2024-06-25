import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLBookInsertTest {

	public static void main(String[] args) {

		addBook("Artificial Intellegence", "Addison Wesley", "2002", 35000);

	}

	private static void addBook(String title, String publisher, String year, int price) {

		Connection con = makeConnectiong();

		try {
			Statement stmt = con.createStatement();
			String s = "INSERT into BOOKS(book_id, title, publisher, year, price) VALUES ";
			s += "(" + "book_id_seq.nextval" + ", '" + title + "', '" + publisher + "', '" + year + "', " + price + ")";
			System.out.println(s);
			int i = stmt.executeUpdate(s);
			if (i == 1) {
				System.out.println("레코드 추가 성공");
			} else {
				System.out.println("레코드 추가 실패");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		} 

	}

	private static Connection makeConnectiong() {
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
			System.out.println("드라이버를 찾을 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("연결에 실패하였습니다.");
		}

		return con;
	}

}
