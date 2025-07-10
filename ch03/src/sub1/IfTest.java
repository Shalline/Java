package sub1;

/*
	날짜 : 2025/07/08
	이름 : 김수진
	내용 : 자바 조건문 실습하기
*/

public class IfTest {

	public static void main(String[] args) {
		
	// if
		int num1 = 1;
		int num2 = 2;
		
		if(num1 < num2) {
			// 조건이 참일때 실행
			System.out.println("num1이 num2보다 작다.");
		}
		
		// 조건이 거짓이면 실행안됨
		if(num1 > 1) {
			System.out.println("num1은 1보다 크다.");
		}
		
		if(num1 > 0) {
			if(num2 >1) {
				System.out.println("num1은 0보다 크고, num2는 1보다 크다.");
				}
		}
		
		if(num1 > 0 && num2 >1) {
			System.out.println("num1은 0보다 크고, num2는 1보다 크다.");
		}
		
	// if ~ else
		int var1 = 1, var2 = 2;
		
		if(var1 > var2) {
			//조건이 참일 때
			System.out.println("var1은 var2보다 크다.");
		}else {
			//조건이 거짓일 때
			System.out.println("var1은 var2보다 작다.");
		}
		
	// if ~ else if ~ else
		int n1 = 1, n2 = 2, n3 =3, n4 = 4;
		
		// 만약 중간 조건중 하나가 참이면 거기서 빠져나감
		// 일종의 break 효과를 주는 것 
		if(n1 > n2) {
			System.out.println("n1은 n2보다 크다.");
		}else if(n2 > n3) {
			System.out.println("n2은 n3보다 크다.");
		}else if(n3 > n4) {
			System.out.println("n3은 n4보다 크다.");
		}else {
			System.out.println("n4가 제일 크다.");
		}
		
	}

}
