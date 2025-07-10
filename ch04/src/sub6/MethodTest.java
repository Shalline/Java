package sub6;

/*
날짜 : 2025/07/09
이름 : 김수진
내용 : 자바 매서드 실습하기
*/

public class MethodTest { // Java는 class라고 하는 구조체로 이루어지고 Method로 구성
	
	// main 매서드 : Java 애플리케이션이 시작 매서드(진입점)
	public static void main(String[] args) {
		
		// main에서 함수 즉 애서드 호출함
		int y1 = f(1); // 인자깝 : 1을 f 매서드의 매개변수 x에 대입
		int y2 = f(2); // 인자깝 : 2를 f 매서드의 매개변수 x에 대입
		int y3 = f(3); // 인자깝 : 3을 f 매서드의 매개변수 x에 대입
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);
		
		// 지역변수와 매서드 호출
		int total1 = sum(1,10);
		int total2 = sum(1,100);
		
		System.out.println("total : " + total1);
		System.out.println("tota2 : " + total2);
		
	}
	
// 	매서드 정의, f()라는 함수에서 반환(매개변수 여기서 int x)이 없어서 void
//	public static void f() {
//		
//	}
	public static int f(int x) { // 매개변수 x
		// 매서드를 호출할때 x값 대입
		int y = 2 * x + 3;
		return y; 				 // return값의 타입을 매서드 이름앞에 선언
	
	} // main end
	
	// 매서드 정의
	public static int sum(int start, int end) { // 매개변수도 지역변수
		
		// 지역변수 :  매서드 내에서 선언한 변수, 매서드 호출 스택에서
		// 매서드가 종료되면 사라짐(해제)
		int total = 0;
		
		for(int k=start; k<=end ; k++) { 
			// k변수는 for문에서 선언했기 때문에 for가 종료되면 해제됨
			
			total += k;
			
		}
		
		return total;
	}
	
}

















