import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
			gogekSearch();
			break;
		case 3:
			videoRegister();
			break;
		case 4:
			videoList();
			break;
		case 5:
			leadReturn();
			break;
		case 6:
			leadReturnList();
			break;
		case 7:
			System.out.println("\n�̷� ���� �뿩 �ý��� ���� GoodBay!");

			System.exit(1);

			break;

		default:
			System.out.println("�ش� ��ȣ�� �Է��ϼ���");
			break;
		}

	}

	// ���� �뿩 ���
	private static void leadReturnList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BufferedReader in_gogek = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader in_video = new BufferedReader(new InputStreamReader(System.in));

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("DB ���� ����");
		} catch (ClassNotFoundException ex1) {
			System.out.println("����̹� �ε� ���� : " + ex1.toString());
			return;
		} catch (Exception ex2) {
			System.out.println("DB ���� ���� : " + ex2.toString());
			return;
		}

		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "1234");
			String sql = "";
			sql = "SELECT lr_code, g.g_name, v.v_title, l_date, r_plan_date, l_total_pay FROM lend_return l, v_gogek g, video v where g.g_code = l.g_code and l.v_code = v.v_code";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			System.out.println("\n�뿩 ����Ʈ");

			System.out.println("�뿩��ȣ\t����ȣ\t������ȣ\t�뿩����\t\t\t�ݳ�������\t\t\t�뿩�Ѿ�");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
						+ rs.getString(4) + "\t" + rs.getString(5) + "\t" + rs.getInt(6) + "��");
			}
		} catch (Exception sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception sqle) {
			}
		}

	}

	// ���� �뿩
	private static void leadReturn() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BufferedReader in_gogek = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader in_video = new BufferedReader(new InputStreamReader(System.in));

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("DB ���� ����");
		} catch (ClassNotFoundException ex1) {
			System.out.println("����̹� �ε� ���� : " + ex1.toString());
			return;
		} catch (Exception ex2) {
			System.out.println("DB ���� ���� : " + ex2.toString());
			return;
		}
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "1234");

			String searchName; // �� �̸� �˻�
			String searchTitle; // ���� �˻�
			String sql = "";
			int g_code; // �� �ڵ�
			int v_code; // ���� �ڵ�
			int v_pay; // �뿩 �ݾ�
			int insertCount;

			System.out.println("\n=== �� �˻� ===");
			System.out.print("�� �̸� �Է� : ");
			searchName = in_gogek.readLine();

			System.out.println("\n=== ���� �˻� ===");
			System.out.print("���� ���� �Է� : ");
			searchTitle = in_video.readLine();

			sql = "SELECT g_code, v_code, v_pay FROM v_gogek, video	WHERE g_name = ? and v_title = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, searchName);
			pstmt.setString(2, searchTitle);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				g_code = rs.getInt("g_code");
				v_code = rs.getInt("v_code");
				v_pay = rs.getInt("v_pay");

				sql = "INSERT INTO lend_return VALUES(lend_return_seq.nextval , ?, ?, sysdate, sysdate+3, ?)";

				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, g_code);
				pstmt.setInt(2, v_code);
				pstmt.setInt(3, v_pay);

				insertCount = pstmt.executeUpdate();

				if (insertCount == 1) {
					sql = "SELECT lr_code, g.g_name, v.v_title, l_date, r_plan_date, l_total_pay FROM lend_return l, v_gogek g, video v where g.g_code = ?";

					pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, g_code);

					rs = pstmt.executeQuery();

					System.out.println("\n�뿩 ����");

					System.out.println("�뿩��ȣ\t����ȣ\t������ȣ\t�뿩����\t\t\t�ݳ�������\t\t\t�뿩�Ѿ�");

					if (rs.next()) {
						System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
								+ rs.getString(4) + "\t" + rs.getString(5) + "\t" + rs.getInt(6) + "��");
					}
				}
			} else {
				System.out.println("�� �Ǵ� ������ �����ϴ�.");
			}
		} catch (Exception sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception sqle) {
			}
		}

	}

	// ���� ���
	private static void videoList() {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BufferedReader in_video = new BufferedReader(new InputStreamReader(System.in));
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("DB ���� ����");
		} catch (ClassNotFoundException ex1) {
			System.out.println("����̹� �ε� ���� : " + ex1.toString());
			return;
		} catch (Exception ex2) {
			System.out.println("DB ���� ���� : " + ex2.toString());
			return;
		}
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "1234");
			String sql = "";
			sql = "select v_code, v_title, v_genre, v_pay, v_lend_state, v_make_company, TO_CHAR(v_make_date, 'YYYY'), v_view_age from video";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("\n���� ����Ʈ");
			System.out.println("�Ϸù�ȣ\t����\t\t\t�帣\t�뿩��\t�뿩����(���:1,�뿩:2)\t��û�\t\t��ó⵵\t\t�������(��ü����:1, 19��:2)");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t\t\t" + rs.getString(3) + "\t"
						+ rs.getString(4) + "\t" + rs.getString(5) + "\t\t\t" + rs.getString(6) + "\t\t"
						+ rs.getString(7) + "\t\t" + rs.getString(8));
			}
			System.out.println();
		} catch (Exception sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception sqle) {
			}
		}
	}

	// ���� ���
	private static void videoRegister() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BufferedReader in_video = new BufferedReader(new InputStreamReader(System.in));

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("DB ���� ����");
		} catch (ClassNotFoundException ex1) {
			System.out.println("����̹� �ε� ���� : " + ex1.toString());
			return;
		} catch (Exception ex2) {
			System.out.println("DB ���� ���� : " + ex2.toString());
			return;
		}

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "hr", "1234");

			String title; // ����
			String genre; // �帣
			int pay; // �뿩��
			int lend_state; // �뿩����(��� : 1, �뿩 : 2)
			String make_company; // ��û�
			String make_date; // ��ó⵵
			int view_age; // �������(��ü���� : 1, 19�� : 2)
			String sql = "";
			int insertCount;

			System.out.println("\n=== ���� ��� ===");
			System.out.print("���� ���� �Է� : ");
			title = in_video.readLine();
			System.out.print("���� �帣 �Է� : ");
			genre = in_video.readLine();
			System.out.print("���� �뿩�� �Է� : ");
			pay = Integer.parseInt(in_video.readLine());
			System.out.print("���� �뿩����(��� : 1, �뿩 : 2) �Է� : ");
			lend_state = Integer.parseInt(in_video.readLine());
			System.out.print("���� ��û� �Է� : ");
			make_company = in_video.readLine();
			System.out.print("���� ��ó⵵ �Է�(��: 1988) : ");
			make_date = in_video.readLine();
			System.out.print("�������(��ü���� : 1, 19�� : 2) �Է� : ");
			view_age = Integer.parseInt(in_video.readLine());

			sql = "insert into video values(video_seq.nextval, ?, ?, ?, ?, ?, TO_DATE(?, 'YYYY'), ?)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, genre);
			pstmt.setInt(3, pay);
			pstmt.setInt(4, lend_state);
			pstmt.setString(5, make_company);
			pstmt.setString(6, make_date);
			pstmt.setInt(7, view_age);
			insertCount = pstmt.executeUpdate();

			if (insertCount == 1) {
				System.out.println("���� ��� ���� : " + insertCount);

				sql = "select v_code, v_title, v_genre, v_pay, v_lend_state, v_make_company, TO_CHAR(v_make_date, 'YYYY'), v_view_age from video";

				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();

				System.out.println("\n ���� ����Ʈ");

				System.out.println("�Ϸù�ȣ\t����\t\t\t�帣\t�뿩��\t�뿩����(���:1,�뿩:2)\t��û�\t\t��ó⵵\t\t�������(��ü����:1, 19��:2)");
				while (rs.next()) {
					System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t\t\t" + rs.getString(3) + "\t"
							+ rs.getString(4) + "\t" + rs.getString(5) + "\t\t\t" + rs.getString(6) + "\t\t"
							+ rs.getString(7) + "\t\t" + rs.getString(8));
				}
				System.out.println();
			} else {
				System.out.println("���� ��� ����");
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

	// �� �˻�
	private static void gogekSearch() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BufferedReader in_gogek = new BufferedReader(new InputStreamReader(System.in));
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("DB ���� ����");
		} catch (ClassNotFoundException ex1) {
			System.out.println("����̹� �ε� ���� : " + ex1.toString());
			return;
		} catch (Exception ex2) {
			System.out.println("DB ���� ���� : " + ex2.toString());
		}

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "hr", "1234");

			String searchName;// �� �˻� �̸�
			String sql = "";

			System.out.println("\n=== �� �˻� ===");
			System.out.print("�� �̸� �Է� : ");
			searchName = in_gogek.readLine();

			sql = "select * from v_gogek where g_name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, searchName);
			rs = pstmt.executeQuery();

			System.out.println("\n�� �˻� ����Ʈ");
			System.out.println("�Ϸù�ȣ\t�̸�\t����\t�ּ�\t\t\t��ȭ��ȣ");

			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
						+ rs.getString(4) + "\t\t\t" + rs.getString(5));
			}
			System.out.println();

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
				}
				System.out.println();

			} else {
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
