package sec03;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {

		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WENDESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		
		}
		
		System.out.println("오늘의 요일은 "+ today + "입니다.");
		
		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 쉽니다.");
		} else {
			System.out.println("자바 공부를 합니다");
		}
		
	}

}
