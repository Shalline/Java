package Step1;

/*
날짜 : 2025/07/10
이름 : 김수진
내용 : 백준 1단계 11번문제 10^12타입 출력하기

타입	    범위 (대략)
int		약 -2×10⁹ ~ 2×10⁹ (±2,147,483,647)
long	약 -9×10¹⁸ ~ 9×10¹⁸ (±9,223,372,036,854,775,807)

*/

import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		
		System.out.println(A+B+C);
		
		sc.close();
	}
}
