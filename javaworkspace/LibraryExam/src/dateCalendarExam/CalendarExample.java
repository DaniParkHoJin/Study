package dateCalendarExam;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar now;
		now = Calendar.getInstance();

		int year;
		int month;
		int day;
		int week;

		String strWeek;
		
		year = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH);
		day = now.get(Calendar.DAY_OF_MONTH);
		week = now.get(Calendar.DAY_OF_WEEK);
		strWeek = null;
		
		switch (week) {
		case Calendar.SUNDAY:
			strWeek = "일";
			break;		
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		default: 
			strWeek = "토";
		}
		
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
		
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초 ");
	}

}
