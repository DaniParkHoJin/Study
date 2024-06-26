package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.SubjectVo;

public class SubjectDAO {
	// 학과 목록
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

			System.out.printf("%-10s\t%-10s\t%-20s", "일련번호", "학과번호", "학과명");

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
			con = DBUtil.getConnection(); // DBUtil을 통해 DB 접속
			pstmt = con.prepareStatement(sql); // 기본 sql 문 넣고
			pstmt.setString(1, svo.getS_num()); // 첫번째 ? 에 VO에서 받아 넣는다.
			pstmt.setString(2, svo.getS_name()); // 두번째 ? 에 Vo에서 받아 넣는다.

			int i = pstmt.executeUpdate();

			if (i == 1) {
				System.out.println(svo.getS_name() + " 학과 등록 완료.");
				System.out.println("학과 등록 성공!!");
			} else {
				System.out.println("학과 등록 실패!!");
			}

		} catch (SQLException e) {
			System.out.println("e=[" + e + "]");
		} catch (Exception e) {
			System.out.println("e=[" + e + "]");
		} finally {
			// 데이터 베이스와의 연결에 사용되었던 오브젝트를 해제
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
