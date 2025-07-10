package Step1;

/*
날짜 : 2025/07/10
이름 : 김수진
내용 : 백준 1단계 5번문제 숫자 나누셈 출력하기
*/

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		double b = sc.nextInt();
		
		System.out.println(a/b);
		
		sc.close();
	}
}