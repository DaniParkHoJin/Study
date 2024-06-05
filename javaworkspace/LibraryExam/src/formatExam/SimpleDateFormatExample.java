package formatExam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(simpleDateFormat.format(now));
		
		simpleDateFormat = new SimpleDateFormat("yyyy�� MM�� dd��");
		System.out.println(simpleDateFormat.format(now));
		
		simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(simpleDateFormat.format(now));
		
		simpleDateFormat = new SimpleDateFormat("������ E����");
		System.out.println(simpleDateFormat.format(now));
		
		simpleDateFormat = new SimpleDateFormat("������ D��° ��");
		System.out.println(simpleDateFormat.format(now));
		
		simpleDateFormat = new SimpleDateFormat("�̴��� d��° ��");
		System.out.println(simpleDateFormat.format(now));
	}

}
