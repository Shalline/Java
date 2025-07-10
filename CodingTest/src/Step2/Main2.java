package Step2;

/*
날짜 : 2025/07/10
이름 : 김수진
내용 : 백준 2단계 2번문제 시험성적 출력하기
*/

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		// int B = sc.nextInt();
		
		if (A >= 90 && A <= 100) {
            System.out.println("A");
        } else if (A >= 80 && A <= 89) {
            System.out.println("B");
        } else if (A >= 70 && A <= 79) {
            System.out.println("C");
        } else if (A >= 60 && A <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
		
		sc.close();
	}
}
