package sub03;

/*
날짜 : 2025/07/14
이름 : 김수진
내용 : Static 변수(클래스 변수), Static 맹서드(클래스 매서드) 실습하기

클래스 변수(정적 변수), 블래스 매서드(정적 매서드)
- static을 ㅗ선언한 변수와 매서드
- Method Area 영역에 따로 관리
- new 객체 생성 없이 바로 클래스 타입으로 참조 
- 객체(인스턴스, 메모리상의 객체) 간의 데이터 공유 목적으로 활용
*/

class Increment {
	
	private int num1=0;
	public static int num2 = 0; // 클래스 변수(정적변수)
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
	
}

public class StaticTest {

	public static void main(String[] args) {
		
		// 클래스변수(정적변수) 실습
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		// 전체 차량수
		Car sonata = new Car("소나타", "흰색",0);
		Car avante = new Car("아반테","검정색",0);
		Car grandu = new Car("그랜저","검정색",0);
		
		sonata.show();
		avante.show();
		grandu.show();
		
		// 클래스 매서드(정적매서드)는 클래스타입으로 참조 호출
		System.out.println("전체 챠량수 : " + Car.getCount());
		
		
		/*
		 * 싱클톤 객체 실습
		 - 싱클톤(Singleton) 객체는 static을 화룡ㅇ한 객체로 오직 하난의 인스턴스마 메모리상(Method Area)로 존재
		 - 싱슬콘 객체를 사용해서 메모리 절야기과 성능 향상을 기대
		 - 외부 생엉ㄹ을 막기 위해 private 생성자 선언
		*/
		
		///////////////////////////////////////////////////
		// 싱글톤 객체 실습
		//////////////////////////////////////////////////
		
		// 여러개 객체를 생성할 필요가 없는 객체
		// Calc cal = new Calc(); // new Calc(); 동적생성 여러개 객체 생성됨
		// int result = cal.plus(1,2);
		// System.out.println("result : " + result);
		
		Calc c1 = Calc.getInstance();
		Calc c2 = Calc.getInstance();
		Calc c3 = Calc.getInstance();
		Calc c4 = Calc.getInstance();
		
		System.out.println("1 + 2" + c1.plus(1, 2));
		System.out.println("1 - 2" + c2.minus(1, 2));
		System.out.println("1 * 2" + c3.multi(1, 2));
		System.out.println("1 / 2" + c4.div(1, 2));
	}

}