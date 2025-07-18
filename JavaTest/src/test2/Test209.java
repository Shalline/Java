package test2;

/*
날짜 : 2025/07/10
이름 : 김수진
내용 : 자바 최대공약수 재귀 매서드 연습문제
*/

public class Test209 {

	public static void main(String[] args) {
		
		System.out.println(" 	 1과 5의 	최대공약수 : "+gcd(5,1));
		System.out.println(" 	 3과 6의	최대공약수 : "+gcd(3,6));
		System.out.println("   12과 18의 최대공약수 : "+gcd(12,18));
		System.out.println("   68과 24의 최대공약수 : "+gcd(68,24));
		System.out.println(" 192과 162의 최대공약수 : "+gcd(192,162));
	}
	public static int gcd(int a, int b) {
		
		if(a%b == 0) {
			return b;
		}else {
			return gcd( b, a%b);
		}
	}
}