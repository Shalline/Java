package sub03;

public class Calc {
	
	// 싱클톤(Singleton) 객체
	private static Calc instance = new Calc();
	public static Calc getInstance() {
		return instance;
	}
	public static void setInstance(Calc instance) {
		Calc.instance = instance;
	}
	
	private Calc() {} // 외부 new 동적 생성을 막기위새
					  // private 생성자 선언
	
	
	public int plus(int a, int b) {
		return a+b;

	}
	public int minus(int a, int b) {
		return a-b;

	}
	public int multi(int a, int b) {
		return a*b;

	}
	public int div(int a, int b) {
		return a/b;

	}

}
