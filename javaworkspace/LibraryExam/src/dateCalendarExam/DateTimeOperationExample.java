package dateCalendarExam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		System.out.println("����ð�: "+ now.format(dateTimeFormatter));
		
		LocalDateTime result1 = now.plusYears(1);
		System.out.println("1�� ��: " + result1.format(dateTimeFormatter));
		
		LocalDateTime result2 = now.minusMonths(2);
		System.out.println("2���� ��: " + result2.format(dateTimeFormatter));
		
		LocalDateTime result3 = now.plusDays(7);
		System.out.println("7�� ��: " + result3.format(dateTimeFormatter));
		
	}

}
