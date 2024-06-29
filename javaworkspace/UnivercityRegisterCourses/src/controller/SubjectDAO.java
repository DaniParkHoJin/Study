package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.SubjectVO;

public class SubjectDAO {
	// �а� ���
	public void getSubjectTotalList() {
		String sql = "select * from subject order by no";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		SubjectVO svo = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			System.out.printf("%-10s\t%-10s\t%-20s\n", "�Ϸù�ȣ", "�а���ȣ", "�а���");

			while (rs.next()) {
				svo = new SubjectVO();
				svo.setNo(rs.getInt("no"));
				svo.setS_num(rs.getString("s_num"));
				svo.setS_name(rs.getString("s_name"));
				System.out.printf("%-10s\t%-10s\t%-20s\n", svo.getNo(), svo.getS_num(), svo.getS_name());

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

	}

	// �а� ���
	public void getSubjectRegiste(SubjectVO svo) throws Exception {
		String sql = "insert into subject(no, s_num, s_name) values(subject_seq.nextval, ?, ?)";

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection(); // DBUtil�� ���� DB ����
			pstmt = con.prepareStatement(sql); // �⺻ sql �� �ְ�
			pstmt.setString(1, svo.getS_num()); // ù��° ? �� VO���� �޾� �ִ´�.
			pstmt.setString(2, svo.getS_name()); // �ι�° ? �� Vo���� �޾� �ִ´�.

			int i = pstmt.executeUpdate();

			if (i == 1) {
				System.out.println(svo.getS_name() + " �а� ��� �Ϸ�.");
				System.out.println("�а� ��� ����!!");
			} else {
				System.out.println("�а� ��� ����!!");
			}

		} catch (SQLException e) {
			System.out.println("e=[" + e + "]");
		} catch (Exception e) {
			System.out.println("e=[" + e + "]");
		} finally {
			// ������ ���̽����� ���ῡ ���Ǿ��� ������Ʈ�� ����
			try {

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

	// �а� ����
	public void setSubjectUpdate(SubjectVO svo) throws Exception {

		String sql = "update subject set s_num=?, s_name=? where no=?";
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, svo.getS_num());
			pstmt.setString(2, svo.getS_name());
			pstmt.setInt(3, svo.getNo());

			int i = pstmt.executeUpdate();

			if (i == 1) {
				System.out.println(svo.getS_name() + "�а� ���� �Ϸ�.");
				System.out.println("�а� ���� ����!!");
			} else {
				System.out.println("�а� ���� ����!!");
			}
		} catch (SQLException e) {
			System.out.println("e=[" + e + "]");
		} catch (Exception e) {
			System.out.println("e=[" + e + "]");
		} finally {
			// ������ ���̽����� ���ῡ ���Ǿ��� ������Ʈ�� ����
			try {

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

	// �а� ����
	public void setSubjectDelete(int no) throws Exception {
		StringBuffer sql = new StringBuffer();
		sql.append("delete from subject where no = ?");
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, no);
			int i = pstmt.executeUpdate();

			if (i == 1) {
				System.out.println("�а� ���� �Ϸ�.");
				System.out.println("�а� ���� ����!!");
			} else {
				System.out.println("�а� ���� ����!!");
			}

		} catch (SQLException e) {
			System.out.println("e=[" + e + "]");

		} catch (Exception e) {
			System.out.println("e=[" + e + "]");

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
}
