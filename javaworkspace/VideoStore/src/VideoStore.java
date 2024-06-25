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

		int menuNumber; // 메뉴 번호 선택

		menu();// 메뉴 호출

		System.out.print("번호 입력 : ");
		menuNumber = input.nextInt();

		switch (menuNumber) {
		case 1:
			gogekRegister(); // 고객 등록
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

	// 고객 등록
	private static void gogekRegister() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		BufferedReader in_gogek = new BufferedReader(new InputStreamReader(System.in));

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("DB 접속 성공");
		} catch (ClassNotFoundException ex1) {
			System.out.println("드라이버 로딩 에러 : " + ex1.toString());
		} catch (Exception ex2) {
			System.out.println("DB 접속 실패 : " + ex2.toString());
		}

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "hr", "1234");

			String name; // 고객 이름
			int age; // 고객 나이
			String address; // 고객 주소
			String tel; // 고객 전화 번호

			String sql = "";
			int insertConut;
			System.out.println("\n=== 고객 등록 ===");
			System.out.print("고객 이름 입력 : ");
			name = in_gogek.readLine();
			System.out.print("고객 나이 입력 : ");
			age = Integer.parseInt(in_gogek.readLine());
			System.out.print("고객 주소 입력 : ");
			address = in_gogek.readLine();
			System.out.print("고객 전화번호 입력 : ");
			tel = in_gogek.readLine();

			sql = "insert into v_gogek values(v_gogek_seq.nextval, ?, ?, ?, ?)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setString(3, address);
			pstmt.setString(4, tel);

			insertConut = pstmt.executeUpdate();

			if (insertConut == 1) {
				System.out.println("고객 등록 성공 : " + insertConut);
				sql = "select * from v_gogek";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();

				System.out.println("\n 고객 리스트");

				System.out.println("일련번호\t이름\t나이\t주소\t\t\t전화번호");

				while (rs.next()) {
					System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
							+ rs.getString(4) + "\t\t\t" + rs.getString(5));
				}System.out.println();

			}	else {
				System.out.println("고객 등록 실패");
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
		System.out.println("미래 비디오 대여 시스템");
		System.out.println("1. 고객 등록");
		System.out.println("2. 고객 검색");
		System.out.println("3. 비디오 등록");
		System.out.println("4. 비디오 목록");
		System.out.println("5. 비디오 대여");
		System.out.println("6. 비디오 대여 목록");
		System.out.println("7. 종료\n");

	}

}
