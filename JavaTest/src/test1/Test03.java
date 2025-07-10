package test1;

/*
날짜 : 2025/07/09
이름 : 김수진
내용 : 자바 연산자 연습문제
*/

public class Test03 {

	public static void main(String[] args) {
		
		int num = 1;
		int result = 0;
		
		result = num++; // 선 대입 후 연산
		System.out.println("result : " +result);
		result = ++num; // 선 연산 후 대입
		System.out.println("result : " +result);
		result = num--;
		System.out.println("result : " +result);
		result = --num;
		System.out.println("result : " +result);

	}

}
