package sub07;

/*
   날짜 : 2025/07/16
   이름 : 김수진
   내용 : 추상클래스 실습하기
*/

public class AbstractTest {

	public static void main(String[] args) {
		
		// 추상 클래스는 단독으로 객체 생성 불가
		// Animal animal = new Animal();
		
		Animal tiger = new Tiger();
		Animal egle = new Egle();
		
		tiger.move();
		tiger.hunt();
		
		egle.move();
		egle.hunt();
		
	}

}





















