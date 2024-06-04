package dateCalendarExam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		String StrNow1;
		StrNow1 = now.toString();
		System.out.println(StrNow1);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strnow2;
		strnow2 = simpleDateFormat.format(now);
		System.out.println(strnow2);
		
	}

}
