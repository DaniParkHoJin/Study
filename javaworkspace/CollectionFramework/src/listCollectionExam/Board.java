package listCollectionExam;

public class Board {
	// �ʵ�
	private String Subject;
	private String content;
	private String writer;
	
	// �⺻ ������
	public Board() {
		super();
	}
	// �ʵ带 ��� ���� ������
	public Board(String subject, String content, String writer) {
		super();
		Subject = subject;
		this.content = content;
		this.writer = writer;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
	
	
	
}
