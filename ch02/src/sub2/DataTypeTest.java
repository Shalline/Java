package sub2;

/*
	날짜 : 2025/07/07
	이름 : 김수진
	내용 : 자바 변수 자료형 실습하기
*/

public class DataTypeTest {

	public static void main(String[] args) {
		
		// 정수형
		byte  num1 = 127; // -128~127까지
		short num2 = 32767; //2바이트
		char  num3 = 65;
		int   num4 = 2147483647;
		long  num5 = 9_223_372_036_854_775_807L;
		// L은 접미사
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		System.out.println("num5 : " + num5);
		
		// 실수형
		float var1 = 0.123456789f; // 소수점 8자리까지 출력
		double var2 = 0.1234567890123456789; // 소수점 17자리까지 출력
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		
		// 논리형
		boolean value1 = true;
		boolean value2 = false;
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		
		// 문자형
		char c1 = 'A';
		char c2 = 'd';
		char c3 = 'D';
		
		System.out.print("" +c1);
		System.out.print("" +c2);
		System.out.println("" +c3); //일부러 붙이고 아래의 프린트문이랑 띄우려고
		// 여기만 ln해서 줄바꿈 시행함
		
		int n1 = c1; // char는 정수형 타입이기 때문에 int형으로 대입가능
		
		System.out.println("nq : " + n1);
		
		// 문자열
		
		String s1 = "M";
		String s2 = "a";
		String s3 = "D";
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		
	}
	
	
	
}
