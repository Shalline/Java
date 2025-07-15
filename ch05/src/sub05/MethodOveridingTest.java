package sub05;

/*
날짜 : 2025/07/15
이름 : 김수진
내용 : MethodOveriding 실습하기
*/

class AAA {
	public void method1() {
		System.out.println("AAA:method1...");
	}
	public void method2() {
		System.out.println("AAA:method2...");
	}
	public void method3() {
		System.out.println("AAA:method3...");
	}
}
class BBB extends AAA {
	
	@Override
	public void method2() {
		// 부모클래스 method2를 Override이기 때문에 어노테이션 @Override 표시
		System.out.println("BBB:method2...");
	}
	public void method3(int a) { // 매개변수 선언, Overload 매서드
		System.out.println("BBB:method3...");
	}
}

class CCC extends BBB {
	
	@Override
	public void method1() {
		System.out.println("CCC:method1...");
	}
	
	@Override
	public void method2() {
		System.out.println("CCC:method2...");
	}
	public void method3(int a, int b) { // 매개변수 선언, Overload 매서드
		System.out.println("CCC:method3...");
	}
}

/*
CCC:method1... 
CCC:method2...
AAA:method3...
BBB:method3...
CCC:method3...
*/

public class MethodOveridingTest {

	public static void main(String[] args) {
		// 오버라이드 매서드 실습
		CCC c = new CCC();
		
		c.method1();
		c.method2();
		c.method3(); // 
		c.method3(1); // 
		c.method3(1,2); // 
		
		System.out.println("--------------------------");
		
		// Sedan 클래스 오버라이드 매서드 실습
		Sedan sonata = new Sedan("소나타","흰색", 0, 2000);
		sonata.speedUp(200);
		sonata.show();
		
		
	}

}