package test1;

/*
날짜 : 2025/07/09
이름 : 김수진
내용 : 자바 반복문 연습문제
*/

public class Test08 {

	public static void main(String[] args) {
			
		// 공백 출력
		int n = 5;
		for(int i=0 ; i<n ; i++) {
			for(int j=n-1 ; j>i   ; j-- ) {
				System.out.print(" ");
			}
		// 별출력
		for(int j=0 ; j < 2* i + 1  ; j++ ) {
			System.out.print("*");
		}
		System.out.print("\n");
		}
	}
}
