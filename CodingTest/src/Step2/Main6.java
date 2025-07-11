package Step2;

/*
날짜 : 2025/07/11
이름 : 김수진
내용 : 백준 2단계 6번문제 오븐시계 만들기

현재시각입력, 요리시간 입력하면
최종 요리 완료시간이 나와야 한다.

*/

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int C = sc.nextInt();
		
		// 전부 분으로 분해해서 처리
		int total = A*60+B;
		
		total += C;
		
		// 23시 59분이 지나면 24시가 되어 
		// 0시로 돌아가는 코드
		int hour = (total/60)%24;
		int min = total%60;
		
		System.out.println(hour + " " + min);
		sc.close();
	}
}