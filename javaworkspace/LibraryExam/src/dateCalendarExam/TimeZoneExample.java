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
			strAmPm = "����";
		} else {
			strAmPm = "����";
		}
		
		int hour;
		int minute;
		int second;
		
		hour = now.get(Calendar.HOUR);
		minute = now.get(Calendar.MINUTE);
		second = now.get(Calendar.SECOND);
		
		System.out.print(strAmPm + " ");
		System.out.print(hour + "�� ");
		System.out.print(minute + "�� ");
		System.out.print(second + "�� ");
	
	}

}
