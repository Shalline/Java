package Step2;

/*
날짜 : 2025/07/10
이름 : 김수진
내용 : 백준 2단계 4번문제 사분면 구하기
*/

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("1");
		}else if(x<0 && y>0) {
			System.out.println("2");
		}else if(x<0 && y<0) {
			System.out.println("3");
		}else if(x>0 && y<0) {
			System.out.println("4");
		}
		sc.close();
	}
}