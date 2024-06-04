package dateCalendarExam;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneExample {

	public static void main(String[] args) {
		TimeZone timezone = TimeZone.getTimeZone("Asia/Seoul");
		Calendar now = Calendar.getInstance(timezone);
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm= null;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour;
		int minute;
		int second;
		
		hour = now.get(Calendar.HOUR);
		minute = now.get(Calendar.MINUTE);
		second = now.get(Calendar.SECOND);
		
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초 ");
	
	}

}
