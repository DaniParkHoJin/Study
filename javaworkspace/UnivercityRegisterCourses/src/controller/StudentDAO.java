package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

import model.StudentVo;

public class StudentDAO {

	// �л� ���̵� �ߺ� üũ
	public boolean getStudentIdOverlap(String idOverlap) throws Exception {

		String sql = "select * from student where sd_id = ?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		boolean idOverlapResult = false; // ���̵� �Ǻ�

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, idOverlap);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				idOverlapResult = true; // �ߺ��� ���̵� �ִٴ� �ǹ�
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

	// ���� �а� �л� �Ϸù�ȣ
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

	// �л� ���
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
				System.out.println(svo.getSd_name() + " �л� ��� �Ϸ�.");
				System.out.println("�л� ��� ����!!");
			} else {
				System.out.println("�л� ��� ����!!");
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

	// �л� ����
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

			System.out.printf("%-10s\t%-10s\t%-20s%-20s%-20s%-20s%-20s%-20s%-50s%-30s%-20s\n", "�Ϸù�ȣ", "�л���ȣ", "����",
					"���̵�", "��й�ȣ", "�а�", "�������", "��ȭ��ȣ", "�ּ�", "�̸���", "�������");

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

	// �л� �α���
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
				loginSuccess = true; // �α��� ����
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

	// �л���ȣ
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

	// �л� ���� ����
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
				System.out.println(svo.getSd_name() + " : �л� ���� ���� �Ϸ�.");
				System.out.println("�л� ���� ���� ����!!");
			} else {
				System.out.println("�л� ���� ���� ����!!");
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
	// �л� ��ü ���
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

			System.out.printf("%-10s\t%-10s\t%-20s%-20s%-20s%-20s%-20s%-20s%-50s%-30s%-20s\n", "�Ϸù�ȣ", "�л���ȣ", "����",
					"���̵�", "��й�ȣ", "�а�", "�������", "��ȭ��ȣ", "�ּ�", "�̸���", "�������");

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
