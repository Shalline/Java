package sub02;

/*
날짜 : 2025/07/
이름 : 김수진
내용 : 자동차 클래스 실습하기
*/

// 현실의 객체를 표현하는 문법 Class로 설계 추상화
// Class 설계(정의)
public class Car {
	
	// 속성(맴버변수, 필드) - 속성은 무조건 private 선언!
	private String name;
	private String color;
	private int speed;
	
	// 생성자(Constructot) - 속성을 초기화하는 반환타입이 없고
	// 클래스 명인 매서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	// 매서드는 무전건 public 선언!
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
	
	// Getter/Setter - 은닉된 속성을 안전하게 처리하기 위한 매서드
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}
