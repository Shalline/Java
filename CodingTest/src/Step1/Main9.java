package Step1;

/*
날짜 : 2025/07/10
이름 : 김수진
내용 : 백준 1단계 9번문제 나머지 출력하기
*/

import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
		
		sc.close();
	}
}
