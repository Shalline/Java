package Step1;

/*
날짜 : 2025/07/10
이름 : 김수진
내용 : 백준 1단계 10번문제 세자리수 곱 출력하기
*/

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int b1 = B%10;
		int b2 = (B/10)%10;
		int b3 = B/100;
		
		System.out.println(A*b1);
		System.out.println(A*b2);
		System.out.println(A*b3);
		System.out.println(A*B);
		
		sc.close();
	}
}
