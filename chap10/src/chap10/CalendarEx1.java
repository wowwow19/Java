package chap10;

import java.util.Calendar;
import java.util.Date;

public class CalendarEx1 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		Calendar cal = Calendar.getInstance();
		Date date = new Date();
		cal.set(Calendar.YEAR, cal.get(Calendar.YEAR) + 100);
		cal.set(2071, 11, 25, 0, 0, 0);
		
		System.out.println(cal);
		System.out.println(date);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("현재시간");
			System.out.println(cal.get(Calendar.YEAR));
			System.out.println(cal.get(Calendar.MONTH) + 1);
			System.out.println(cal.get(Calendar.DATE));
			System.out.println(cal.get(Calendar.HOUR));
			System.out.println(cal.get(Calendar.MINUTE));
			System.out.println(cal.get(Calendar.SECOND));
			System.out.println(cal.get(Calendar.DAY_OF_WEEK));
			System.out.println(cal.get(Calendar.DAY_OF_MONTH));
			System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
			System.out.println(cal.get(Calendar.DAY_OF_YEAR));
			System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
			System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
//			System.out.println();
//			System.out.println(date.getYear() + 1900);
//			System.out.println(date.getMonth() + 1);
//			System.out.println(date.getDate());
//			System.out.println(date.getHours());
//			System.out.println(date.getMinutes());
//			System.out.println(date.getSeconds());
//			System.out.println(date.getDay());
			Thread.sleep(1000);
		}
		
		
	}
}
