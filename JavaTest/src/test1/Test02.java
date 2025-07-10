package test1;

import java.util.Scanner;

/*
날짜 : 2025/07/09
이름 : 김수진
내용 : 자바 기본 입출력 연습문제
*/

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year;
		int birth;
		String name;
		
		System.out.print("올해 년도 입력 : ");
		year = sc.nextInt();
		System.out.print("태어난 년도 입력 : ");
		birth = sc.nextInt();
		
		sc.nextLine(); // 👉 줄바꿈 문자 제거 (버퍼 비우기)
		
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		// next 까지만 하면 굳이 줄바꿈 문자 제거 안해도 되나?
		
		int age = year - birth;
		
		System.out.printf("%s님 안녕하새요.\n당신은 올해 만 %d세 입니다.",
				name, age);
		
		sc.close();	
	}
}