package sub3;

import java.io.FileOutputStream;
import java.util.Properties;

/*
날짜 : 2025/07/23
이름 : 김수진
내용 : 프로퍼티스 자료구조 실습하기
*/

public class PropertiesTest {

	public static void main(String[] args) {
		
		// 프로퍼티 : 기-값이 모두 문자열인 자료구조
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		System.out.println(prop);
		
		// 직렬화는아닌데 직렬화라고 이해하삼
		String path = "C:\\Users\\GGG\\Desktop\\fruit.properties";
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			prop.store(fos, null);
			fos.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료..."); 
	}

}
