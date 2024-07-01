package model;

public class SubjectVO {
	// 필드 선언
	private int no; // 학과 일련번호
	private String s_num; //  학과 번호
	private String s_name; // 학과명
	// 기본 생성자
	public SubjectVO() {
		super();
	}
	// 필드를 모두 받는 생성자
	public SubjectVO(int no, String s_num, String s_name) {
		super();
		this.no = no;
		this.s_num = s_num;
		this.s_name = s_name;
	}
	// 접근자
	public int getNo() {
		return no;
	}
	public String getS_num() {
		return s_num;
	}
	public String getS_name() {
		return s_name;
	}
	// 설정자
	public void setNo(int no) {
		this.no = no;
	}
	public void setS_num(String s_num) {
		this.s_num = s_num;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	@Override
	public String toString() {
		return "SubjectVo [no=" + no + ", s_num=" + s_num + ", s_name=" + s_name + "]";
	}
	
	
	
	
}
