package model;

public class LessonVo {
	// 필드 선언
	private int no; // 과목 일련번호
	private String l_abbre; // 과목 약어
	private String l_name; // 과목명

	// 기본 생성자
	public LessonVo() {
		super();
	}

	// 모든 필드를 받는 생성자
	public LessonVo(int no, String l_abbre, String l_name) {
		super();
		this.no = no;
		this.l_abbre = l_abbre;
		this.l_name = l_name;
	}

	// 접속자
	public int getNo() {
		return no;
	}

	public String getL_abbre() {
		return l_abbre;
	}

	public String getL_name() {
		return l_name;
	}

	// 생성자
	public void setNo(int no) {
		this.no = no;
	}

	public void setL_abbre(String l_abbre) {
		this.l_abbre = l_abbre;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	@Override
	public String toString() {
		return "LessonVo [l_abbre=" + l_abbre + ", l_name=" + l_name + "]";
	}

}
