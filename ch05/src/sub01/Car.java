package sub01;

/*
날짜 : 2025/07/
이름 : 김수진
내용 :  실습하기
*/

// 현실의 객체를 표현하는 문법 Class로 설계 추상화
// Class 설계(정의)
public class Car {
	
	// 속성(맴버변수, 필드)
	String name;
	String color;
	int speed;
	
	// 기능(맴버매서드) 매서드의 기능은 static 안쓴다
	public void speedUp(int speed) { 
		// this는 자기참조 키워드, 클래스의 맴버변수를 참조
		this.speed += speed;
	}
	public void sppedDwon(int speed) {
		
			this.speed -= speed;
		}
	public void show() {
		
		System.out.println("차량명: " + this.name); //이렇게 해도됨
		System.out.println("차량색: " + color); // 여기서는 this 생략가능
		System.out.println("현재속도: " + speed);
		
	}
}
