package sub6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
날짜 : 2025/07/22
이름 : 김수진
내용 : 자바 날짜/시간 클래스 실습하기
*/

public class DateTest {

	public static void main(String[] args) {
		
		// Date 클래서
		Date date = new Date();
		System.out.println("date :" + date);
		// date.toString() 생략됨 객체정보를 출력하는 메서드
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String result = sdf.format(date);
		System.out.println("result : "+ result);
		
		// Calendar 클래스, new로 객체 생성안됨, 싱글톤임
		Calendar cal = Calendar.getInstance();
		
		int year  = cal.get(Calendar.YEAR);
		// Jan가 0이라서 +1해줘야 1월됨
		int month = cal.get(Calendar.MONTH)+1;
		int dt    = cal.get(Calendar.DATE);
		int hour  = cal.get(Calendar.HOUR_OF_DAY);
		int min   = cal.get(Calendar.MINUTE);
		int sec   = cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%02d-%02d %02d:%02d:%02d",
				year, month, dt, hour, min, sec);
	}

}
