package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.SubjectVo;

public class SubjectDAO {
	// �а� ���
	public void getSubjectTotalList() {
		String sql = "select * from subject order by no";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		SubjectVo sVo = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			System.out.printf("%-10s\t%-10s\t%-20s", "�Ϸù�ȣ", "�а���ȣ", "�а���");

			while (rs.next()) {
				sVo = new SubjectVo();
				sVo.setNo(rs.getInt("no"));
				sVo.setS_num(rs.getString("s_num"));
				sVo.setS_name(rs.getString("s_name"));

				System.out.printf("%-10d\t%-10s\t%-20s", sVo.getNo(), sVo.getS_num(), sVo.getS_name());

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

	public void getSubjectRegiste(SubjectVo svo) {
		String sql = "insert into suject(no, s_num, s_name) values(suject_seq.nextval, ?, ?)";

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

}
