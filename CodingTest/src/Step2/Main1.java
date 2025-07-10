package Step2;

/*
날짜 : 2025/07/10
이름 : 김수진
내용 : 백준 2단계 1번문제 두 수 비교하기
*/

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A > B) {
			System.out.println(">");
		}else if(A < B) {
			System.out.println("<");
		}else if(A == B) {
			System.out.println("==");
		}
		sc.close();
	}
}
