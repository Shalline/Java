package test1;

/*
날짜 : 2025/07/09
이름 : 김수진
내용 : 자바 피보나치 수열 연습문제
*/

// n1+n2가 n1이 되고 n3가 n2가 되는..
public class Test10 {

	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		System.out.print(n1+", ");
		System.out.print(n2+", ");
		
		for(int i=1 ; i <=10; i++) {
			n3 = n1 + n2;
			
			System.out.print(n3+", ");
			
			n1 = n2;
			n2 = n3;
		}

	}

}
