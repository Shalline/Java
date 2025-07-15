package sub04;

// 부모 클래서 Car를 상속받는거
public class Sedan extends Car {
	
	private int cc; // 배기향
	
	public Sedan(String name, String color, int speed, int cc) {
		// 부모클래스 생성자 호출
		// 자식클래스는 부모클래스 속성을 초기화해줘햐 됨
		super(name, color, speed);
		this.cc = cc;

	}
	
	public void tirbo() {
		// 부모 클래스 speed를 참조하기 위해 접근권할을 private에서 protectedㄹ 변경
		this.speed += 10;
	}
	
	public void show() {
		super.show(); // 부모클래스 show() 호출
		System.out.println("배기량 : " + this.cc);
	}
	
}
