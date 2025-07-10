package test1;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		char grade = ' '; // char grade = 0; 이렇게 해도 된다.
		
		System.out.println("입력한 점수는 "+score+"입니다." );
		
		// 조건을 다줘도 되고 간단히 해도 나오긴 함.
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}else if(score >=80) {
			grade = 'B';
		}else if(score >=70) {
			grade = 'C';
		}else if(score >=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.printf("등금은 %c입니다.", grade);
		
		sc.close();
	}
}