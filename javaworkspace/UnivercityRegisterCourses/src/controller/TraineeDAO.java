package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.TraineeVO;

public class TraineeDAO {
	// 수강신청
	public void setTraineeRegistr(TraineeVO tvo) throws Exception {

		String sql = "insert into trainee " + "(no, sd_num, l_abbre, t_section, t_date)" + " value"
				+ "(trainee_seq.nextval, ?, ?, ?, sysdate)";
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, tvo.getSd_num());
			pstmt.setString(2, tvo.getL_abbre());
			pstmt.setString(3, tvo.getT_section());

			int i = pstmt.executeUpdate();

			if (i == 1) {
				System.out.println("수강 신청 완료.");
				System.out.println("수강 신청 성공!!!");
			} else {
				System.out.println("수강 신청 실패!!!");
			}

		} catch (SQLException e) {
			System.out.println("e = [" + e + "]");
		} catch (Exception e) {
			System.out.println("e = [" + e + "]");
		} finally {
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

	// 개인 수강 신청 전체 목록
	public void getTraineeTotalList(String sd_num) throws Exception {

		String sql = "select tr.no as no, tr.sd_num as sd_num, tr.l_abbre as l_abbre, le.l_name as l_name, st.sd_name as sd_name, t_section, t_date"
				+ " from trainee tr, lesson le, student st"
				+ " where tr.sd_num = ? and tr.l_abbre = le.l_abbre and tr.sd_num = st.sd_num order by t_date";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		TraineeVO tvo = null;

		try {
			con = DBUtil.getConnection();

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, sd_num);
			rs = pstmt.executeQuery();

			System.out.printf("%-10s\t%-15s\t%-10s%-20s%-15s%-10s%-15s\n", "일련번호", "학생번호", "과목약어", "과목명", "학생이름",
					"과목구분", "등록일");

			while (rs.next()) {
				tvo = new TraineeVO();
				tvo.setNo(rs.getInt("no"));
				tvo.setSd_num(rs.getString("sd_num"));
				tvo.setL_abbre(rs.getString("l_abbre"));
				tvo.setT_section(rs.getString("t_section"));
				tvo.setT_date(rs.getString("t_date"));

				System.out.printf("%-10d\t%-15s\t%-10s%-20s%-15s%-10s%-15s\n", tvo.getNo(), tvo.getSd_num(),
						tvo.getL_abbre(), rs.getString("l_name"), rs.getString("sd_name"), tvo.getT_section(),
						tvo.getT_date());

			}

		} catch (SQLException se) {
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
			}
		}

	}

	// 수강 신청 취소
	public void setTraineeDelete(int no) {

		StringBuffer sql = new StringBuffer();

		sql.append("delete from trainee where no = ?");
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, no);
			int i = pstmt.executeUpdate();
			if (i == 1) {
				System.out.println("수강 신청 취소 완료.");
				System.out.println("수강 신청 취소 성공!!!");
			} else {
				System.out.println("수강 신청 취소 실패!!!");
			}
		} catch (SQLException e) {
			System.out.println("e=[" + e + "]");
		} catch (Exception e) {
			System.out.println("e=[" + e + "]");
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
			}
		}

	}

}
