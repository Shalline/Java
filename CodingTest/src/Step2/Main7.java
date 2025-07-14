package Step2;

/*
날짜 : 2025/07/11
이름 : 김수진
내용 : 백준 2단계 7번문제 주사위 3개

*/

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 3개의 눈 입력
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int reward;

        if (a == b && b == c) {
            // 3개가 모두 같은 경우
            reward = 10000 + a * 1000;
        } else if (a == b || a == c) {
            // a가 b 또는 c와 같은 경우 (2개만 같은 경우)
            reward = 1000 + a * 100;
        } else if (b == c) {
            // b와 c가 같은 경우 (2개만 같은 경우)
            reward = 1000 + b * 100;
        } else {
            // 모두 다른 경우
            int max = Math.max(a, Math.max(b, c));
            reward = max * 100;
        }

        // 상금 출력
        System.out.println(reward);

        scanner.close();
    }
}