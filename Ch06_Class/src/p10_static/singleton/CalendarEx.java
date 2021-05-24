package p10_static.singleton;

import java.util.Calendar;
//Calendar: 추상 클래스이므로 객체 생성 불가
public class CalendarEx {

	public static void main(String[] args) {
		//Calendar Class 추상 클래스이므로 자식객체 생성대신 Singleton형식으로 클래스내용 사용
		Calendar cal = Calendar.getInstance();
		int year = cal.get(cal.YEAR);
		int month = cal.get(cal.MONTH);
		int day = cal.get(cal.DATE);
		System.out.println(year + "/" + month + "/" + day);

	}

}
