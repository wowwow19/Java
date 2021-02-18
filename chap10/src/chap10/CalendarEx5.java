package chap10;

import java.util.Calendar;

public class CalendarEx5 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(toString(cal));
		
		cal.add(Calendar.DATE, 1);
		System.out.println(toString(cal));
		
		cal.add(Calendar.MONTH, -6);
		System.out.println(toString(cal));
		
		cal.add(Calendar.DATE, 31);
		System.out.println(toString(cal));
		
		cal.add(Calendar.DATE, 31);
		System.out.println(toString(cal));	// 2020/10/19
		
		cal.roll(Calendar.DATE, 31);
		System.out.println(toString(cal));
	}
	
	public static String toString(Calendar cal) {
		return cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH)+1) + "월 " + cal.get(Calendar.DATE) + "일";
	}
}
