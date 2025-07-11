package Step2;

import java.util.Scanner;

/*
날짜 : 2025/07/11
이름 : 김수진
내용 : 백준 2단계 7번문제 주사위 3개

현재시각입력, 요리시간 입력하면
최종 요리 완료시간이 나와야 한다.
*/

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 주사위 3개 숫자 입력 받기
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int prize = 0;

        // 3개가 모두 같은 경우  
        if (a == b && b == c) {
            prize = 10000 + a * 1000;
        }
        // 2개만 같은 경우
        else if (a == b || a == c) {
            prize = 1000 + a * 100;
        }
        else if (b == c) {
            prize = 1000 + b * 100;
        }
        // 모두 다른 경우
        else {
            int max = Math.max(a, Math.max(b, c)); // 가장 큰 값
            prize = max * 100;
        }

        // 상금 출력
        System.out.println(prize);
    }
}
