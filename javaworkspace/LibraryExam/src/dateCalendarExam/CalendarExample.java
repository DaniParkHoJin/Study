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
			strWeek = "��";
			break;		
		case Calendar.MONDAY:
			strWeek = "��";
			break;
		case Calendar.TUESDAY:
			strWeek = "ȭ";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "��";
			break;
		case Calendar.THURSDAY:
			strWeek = "��";
			break;
		case Calendar.FRIDAY:
			strWeek = "��";
			break;
		default: 
			strWeek = "��";
		}
		
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
		
		
		System.out.print(year + "�� ");
		System.out.print(month + "�� ");
		System.out.print(day + "�� ");
		System.out.print(strWeek + "���� ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "�� ");
		System.out.print(minute + "�� ");
		System.out.print(second + "�� ");
	}

}
