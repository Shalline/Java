package Step2;

/*
날짜 : 2025/07/10
이름 : 김수진
내용 : 백준 2단계 5번문제 45분전 알람시계 만들기

기준 시간: 10시 10분
현재 분이 10이니까 45를 못 뺌 → 1시간 빼서 9시로 만듦
그러면 10분 + 60분 = 70분이라고 생각하고 45를 뺌
70 - 45 = 25분

기준 시간: 0시 30분
30 < 45 → 못 빼니까 시를 하나 줄여야 함
그런데 시가 0이라서 -1이 되면 음수가 되잖아?
→ 자정(0시)에서 1시간 전은 전날 23시예요!
그래서 시를 23으로 바꿔야 함
분은 30 + 60 - 45 = 45
✅ 최종 시간: 23시 45분
*/

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		
		if(M<45) {
			H--;
			M +=60;
		}
		M -= 45;
		
		// 자정 0시에서 한시간 전은 전날 23시라서..
		if(H<0) {
			H=23;
		}
		
		System.out.println(H + " " + M);
		sc.close();
	}
}