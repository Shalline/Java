package sub06;

/*
   날짜 : 2025/07/15
   이름 : 김수진
   내용 : 다형성 실습하기
   
   다형성(Polymorphism)
   - 상속관계에서 부모클래스의 기능이 자식클래스에서 다양한 형태로 변하는 튿징
   - 객체 생성할 때 타입선언을 부모클래스 타입으로 선언(업캐스팅)
   - 다형성을 통해서 프로그래밍의 중목코드 줄이고 유연성 향상
*/

public class PolyTest {

	public static void main(String[] args) {
		
		// 다형성 - 자식객체의 타입선언을 부모타입으로 선언
		Animal tiger = new Tiger(); // 업캐스팅
		Animal egle = new Egle(); // 업캐스팅
		Animal shark = new Shark(); // 업캐스팅
		
		tiger.move();
		tiger.hunt();
		
		egle.move();
		egle.hunt();
		
		shark.move();
		shark.hunt();
		
		// 다운 캐스팅 - 부모답인의 객체를 자식타입으로 캐스팅(casting 형변환)
		Tiger t = (Tiger) tiger; // 캐스팅 지정연산(Tiger) 해줘야 됨
		Egle e = (Egle) egle;
		Shark s = (Shark) shark;
		
		t.move();
		t.hunt();
		
		e.move();
		e.hunt();
		
		s.move();
		s.hunt();
		
		
		// 다형성을 활용한 객체 배열
		Animal[] arr = {t, e, s};
		
		arr[0].move();
		arr[1].move();
		arr[2].move();
		
	}

}














