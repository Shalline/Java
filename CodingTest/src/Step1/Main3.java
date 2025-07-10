package Step1;

/*
	날짜 : 2025/07/10
	이름 : 김수진
	내용 : 백준 1단계 3번문제 숫자 차 출력하기
*/

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a-b);
		
		sc.close();
	}
}