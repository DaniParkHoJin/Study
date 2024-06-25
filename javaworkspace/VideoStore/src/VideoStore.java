import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class VideoStore {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int menuNumber; // �޴� ��ȣ ����

		menu();// �޴� ȣ��

		System.out.print("��ȣ �Է� : ");
		menuNumber = input.nextInt();

		switch (menuNumber) {
		case 1:
			gogekRegister(); // �� ���
			break;
		case 2:

			break;
		case 3:

			break;
		case 4:

			break;

		case 5:

			break;
		case 6:

			break;
		case 7:

			break;

		default:
			break;
		}

	}

	// �� ���
	private static void gogekRegister() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		BufferedReader in_gogek = new BufferedReader(new InputStreamReader(System.in));

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("DB ���� ����");
		} catch (ClassNotFoundException ex1) {
			System.out.println("����̹� �ε� ���� : " + ex1.toString());
		} catch (Exception ex2) {
			System.out.println("DB ���� ���� : " + ex2.toString());
		}

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "hr", "1234");

			String name; // �� �̸�
			int age; // �� ����
			String address; // �� �ּ�
			String tel; // �� ��ȭ ��ȣ

			String sql = "";
			int insertConut;
			System.out.println("\n=== �� ��� ===");
			System.out.print("�� �̸� �Է� : ");
			name = in_gogek.readLine();
			System.out.print("�� ���� �Է� : ");
			age = Integer.parseInt(in_gogek.readLine());
			System.out.print("�� �ּ� �Է� : ");
			address = in_gogek.readLine();
			System.out.print("�� ��ȭ��ȣ �Է� : ");
			tel = in_gogek.readLine();

			sql = "insert into v_gogek values(v_gogek_seq.nextval, ?, ?, ?, ?)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setString(3, address);
			pstmt.setString(4, tel);

			insertConut = pstmt.executeUpdate();

			if (insertConut == 1) {
				System.out.println("�� ��� ���� : " + insertConut);
				sql = "select * from v_gogek";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();

				System.out.println("\n �� ����Ʈ");

				System.out.println("�Ϸù�ȣ\t�̸�\t����\t�ּ�\t\t\t��ȭ��ȣ");

				while (rs.next()) {
					System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
							+ rs.getString(4) + "\t\t\t" + rs.getString(5));
				}System.out.println();

			}	else {
				System.out.println("�� ��� ����");
			}

		} catch (Exception sqle) {
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
			} catch (Exception sqle) {
			}
		}

	}

	private static void menu() {
		System.out.println("�̷� ���� �뿩 �ý���");
		System.out.println("1. �� ���");
		System.out.println("2. �� �˻�");
		System.out.println("3. ���� ���");
		System.out.println("4. ���� ���");
		System.out.println("5. ���� �뿩");
		System.out.println("6. ���� �뿩 ���");
		System.out.println("7. ����\n");

	}

}
