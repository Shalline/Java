package Step2;

/*
날짜 : 2025/07/10
이름 : 김수진
내용 : 백준 2단계 3번문제 윤년 출력하기
*/

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		// int B = sc.nextInt();
		
		if(A%4==0 && A%100!=0 || A%400==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		sc.close();
	}
}