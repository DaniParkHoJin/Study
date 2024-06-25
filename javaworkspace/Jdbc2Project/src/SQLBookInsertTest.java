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
				System.out.println("���ڵ� �߰� ����");
			} else {
				System.out.println("���ڵ� �߰� ����");
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
			System.out.println("����̹� ���� ����");
			con = DriverManager.getConnection(url, id, password);
			System.out.println("�����ͺ��̽� ���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹��� ã�� �� �����ϴ�.");
		} catch (SQLException e) {
			System.out.println("���ῡ �����Ͽ����ϴ�.");
		}

		return con;
	}

}
