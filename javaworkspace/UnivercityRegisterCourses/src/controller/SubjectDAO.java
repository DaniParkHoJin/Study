package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.SubjectVO;

public class SubjectDAO {
	// 학과 목록
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

			System.out.printf("%-10s\t%-10s\t%-20s\n", "일련번호", "학과번호", "학과명");

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

	// 학과 등록
	public void getSubjectRegiste(SubjectVO svo) throws Exception {
		String sql = "insert into subject(no, s_num, s_name) values(subject_seq.nextval, ?, ?)";

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

	// 학과 수정
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
				System.out.println(svo.getS_name() + "학과 수정 완료.");
				System.out.println("학과 수정 성공!!");
			} else {
				System.out.println("학과 수정 실패!!");
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

	// 학과 삭제
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
				System.out.println("학과 삭제 완료.");
				System.out.println("학과 삭제 성공!!");
			} else {
				System.out.println("학과 삭제 실패!!");
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
