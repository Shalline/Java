package test3;

/**
 * 날짜 : 2025/07/16
 * 이름 : 김수진
 * 내용 : 객체 연습문제 
*/

class Adder {
	private static Adder instance = new Adder();
	
	public static Adder getInstance() {
		return instance;
	}
	
	private Adder() {}          // 싱글콘이니까 private일것
	
	private Adder(int value) {   // 이미 주어진 코드
		y += value;
	}
	
	private int x;
	private int y;
	
	// add 메서드 매개변수 타입, 오버로드임
	public void add(int x, int y) {
		this.x += x;
		this.y += y;       // y++; 대신 this.y += y;가 맞습니다.
	}
	
	public void add(int[] arr) {
		this.x += arr[0];
		this.y += arr[1];
	}
	
	// static add 메서드 파라미터 타입
	public static void add(Adder a2) {
		a2.x += 10;
	}
	
	// static add 메서드 반환 타입 및 파라미터 타입
	public static Adder add(Adder a3, int value) {
		return new Adder(value);
	}
	
	public void show() {
		System.out.println("-----------------");
		System.out.println("X : " + x);
		System.out.println("Y : " + y);
	}
}

public class Test306 {
	public static void main(String[] args) {
		Adder a1 = Adder.getInstance();   // ??? 인스턴스 생성 빈칸 채우기
				
		a1.add(1, 2);
		a1.show();
		
		int[] arr = {10, 20};
		a1.add(arr);
		a1.show();
		
		Adder.add(a1);
		a1.show();
		
		a1 = Adder.add(a1, 3);
		a1.show();
	}
}