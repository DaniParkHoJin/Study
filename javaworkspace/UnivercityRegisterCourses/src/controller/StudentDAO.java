package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

import model.StudentVo;

public class StudentDAO {

	// 학생 아이디 중복 체크
	public boolean getStudentIdOverlap(String idOverlap) throws Exception {

		String sql = "select * from student where sd_id = ?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		boolean idOverlapResult = false; // 아이디 판별

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, idOverlap);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				idOverlapResult = true; // 중복된 아이디가 있다는 의미
			}
		} catch (SQLException e) {
			System.out.println("e =[" + e + "]");
		} catch (Exception e) {
			System.out.println("e =[" + e + "]");
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}

			} catch (SQLException e) {

			}
		}

		return idOverlapResult;
	}

	// 동일 학과 학생 일련번호
	public String getstudentCount(String subjectNum) throws Exception {

		String sql = "select LPAD(count(*)+1, 4, '0') as studentCount from student where s_num = ?";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String serialNumber = "";

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, subjectNum);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				serialNumber = rs.getString("studentCount");
			}
		} catch (SQLException se) {
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException se) {
			}
		}
		return serialNumber;
	}

	// 학생 등록
	public void setStudentResiste(StudentVo svo) throws Exception {
		String sql = "insert into student values (student_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate)";

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, svo.getSd_num());
			pstmt.setString(2, svo.getSd_name());
			pstmt.setString(3, svo.getSd_id());
			pstmt.setString(4, svo.getSd_password());
			pstmt.setString(5, svo.getS_num());
			pstmt.setString(6, svo.getSd_birthday());
			pstmt.setString(7, svo.getSd_phone());
			pstmt.setString(8, svo.getSd_address());
			pstmt.setString(9, svo.getSd_email());

			int i = pstmt.executeUpdate();

			if (i == 1) {
				System.out.println(svo.getSd_name() + " 학생 등록 완료.");
				System.out.println("학생 등록 성공!!");
			} else {
				System.out.println("학생 등록 실패!!");
			}

		} catch (SQLException e) {
			System.out.println("e =[" + e + "]");
		} catch (Exception e) {
			System.out.println("e =[" + e + "]");
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException se) {
			}
		}

	}

	// 학생 정보
	public void getStudent(String id, String pw) throws Exception {
		String sql = "select * from student where sd_id = ? and sd_password = ?;";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudentVo svo = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();

			System.out.printf("%-10s\t%-10s\t%-20s%-20s%-20s%-20s%-20s%-20s%-50s%-30s%-20s\n", "일련번호", "학생번호", "성명",
					"아이디", "비밀번호", "학과", "생년월일", "전화번호", "주소", "이메일", "등록일자");

			if (rs.next()) {
				svo = new StudentVo();
				svo.setNo(rs.getInt("no"));
				svo.setSd_num(rs.getString("sd_num"));
				svo.setSd_name(rs.getString("sd_name"));
				svo.setSd_id(rs.getString("sd_id"));
				svo.setSd_password(rs.getString("sd_password"));
				svo.setS_num(rs.getString("s_num"));
				svo.setSd_birthday(rs.getString("sd_birthday"));
				svo.setSd_phone(rs.getString("sd_phone"));
				svo.setSd_address(rs.getString("sd_address"));
				svo.setSd_email(rs.getString("sd_email"));
				svo.setSd_date(rs.getString("sd_date") + "");

				System.out.printf("%-10d\t%-10s\t%-20s%-20s%-20s%-20s%-20s%-20s%-50s%-30s%-20s\n", svo.getNo(),
						svo.getSd_num(), svo.getSd_name(), svo.getSd_id(), svo.getSd_password(), svo.getS_num(),
						svo.getSd_birthday(), svo.getSd_phone(), svo.getSd_address(), svo.getSd_email(),
						svo.getSd_date());

			}

		} catch (SQLException e) {
			System.out.println("e =[" + e + "]");

		} catch (Exception e) {
			System.out.println("e =[" + e + "]");

		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
			}
		}

	}

	// 학생 로그인
	public boolean getStudentLogin(String id, String pw) throws Exception {
		String sql = "select * from student where sd_id = ? and sd_password = ?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean loginSuccess = false;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				loginSuccess = true; // 로그인 성공
			}

		} catch (SQLException e) {
			System.out.println("e =[" + e + "]");

		} catch (Exception e) {
			System.out.println("e =[" + e + "]");
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (rs != null) {
					rs.close();
				}

			} catch (Exception e) {
			}
		}

		return loginSuccess;
	}

	// 학생번호
	public String getStudentNum(String id, String pw) throws Exception {

		String sql = "select sd_num from student where sd_id = ? and sd_password = ?";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sd_num = "";

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				sd_num = rs.getString("sd_num");
			}

		} catch (SQLException e) {
			System.out.println("e =[" + e + "]");

		} catch (Exception e) {
			System.out.println("e =[" + e + "]");

		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
			}
		}

		return sd_num;
	}

	// 학생 정보 수정
	public void setStudentUpdate(StudentVo svo) throws Exception {

		String sql = "update student set sd_password = ?, sd_phone = ?, sd_address = ?, sd_email = ? where sd_num = ?";

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, svo.getSd_password());
			pstmt.setString(2, svo.getSd_phone());
			pstmt.setString(3, svo.getSd_address());
			pstmt.setString(4, svo.getSd_email());
			pstmt.setString(5, svo.getSd_num());

			int i = pstmt.executeUpdate();

			if (i == 1) {
				System.out.println(svo.getSd_name() + " : 학생 정보 수정 완료.");
				System.out.println("학생 정보 수정 성공!!");
			} else {
				System.out.println("학생 정보 수정 실패!!");
			}

		} catch (SQLException e) {
			System.out.println("e =[" + e + "]");

		} catch (Exception e) {
			System.out.println("e =[" + e + "]");
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
			}
		}

	}
	// 학생 전체 목록
	public void getStudentTotalList() {
		String sql = "SELECT ST.NO AS NO, SD_NUM, SD_NAME, SD_ID, SD_PASSWORD, SU.S_NAME, SD_BIRTHDAY, SD_PHONE, SD_ADDRESS, SD_EMAIL, SD_DATE"
				+ " FROM STUDENT ST, SUBJECT SU" + " WHERE ST.S_NUM = SU.S_NUM" + " ORDER BY NO";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudentVo svo = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			System.out.printf("%-10s\t%-10s\t%-20s%-20s%-20s%-20s%-20s%-20s%-50s%-30s%-20s\n", "일련번호", "학생번호", "성명",
					"아이디", "비밀번호", "학과", "생년월일", "전화번호", "주소", "이메일", "등록일자");

			while (rs.next()) {
				svo = new StudentVo();
				svo.setNo(rs.getInt("no"));
				svo.setSd_num(rs.getString("sd_num"));
				svo.setSd_name(rs.getString("sd_name"));
				svo.setSd_id(rs.getString("sd_id"));
				svo.setSd_password(rs.getString("sd_password"));
				svo.setS_num(rs.getString("s_num"));
				svo.setSd_birthday(rs.getString("sd_birthday"));
				svo.setSd_phone(rs.getString("sd_phone"));
				svo.setSd_address(rs.getString("sd_address"));
				svo.setSd_email(rs.getString("sd_email"));
				svo.setSd_date(rs.getString("sd_date") + "");

				System.out.printf("%-10d\t%-10s\t%-20s%-20s%-20s%-20s%-20s%-20s%-50s%-30s%-20s\n", svo.getNo(),
						svo.getSd_num(), svo.getSd_name(), svo.getSd_id(), svo.getSd_password(), svo.getS_num(),
						svo.getSd_birthday(), svo.getSd_phone(), svo.getSd_address(), svo.getSd_email(),
						svo.getSd_date());
			}
		} catch (SQLException se) {
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}

			} catch (SQLException e) {
			}
		}

	}

}
