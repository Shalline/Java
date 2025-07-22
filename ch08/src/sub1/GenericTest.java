package sub1;

/*
날짜 : 2025/07/22
이름 : 김수진
내용 : 자바 재네릭 실습하기
*/

public class GenericTest {

	public static void main(String[] args) {
		
		Apple apple = new Apple("한국",3000);
		Banana banana = new Banana("대만",2000);
		
		//치환변수 T를 apple, banana로 치환
		FruitBox<Apple> box1 = new FruitBox<Apple>();
		FruitBox<Banana> box2 = new FruitBox<Banana>();
		
		box1.setFruit(apple);
		box2.setFruit(banana);
		
		System.out.println(box1.getFruit());
		System.out.println(box2.getFruit());
		
	}

}
