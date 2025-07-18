package p224;

class Sample {
	public int a;
	private int b;
	int c; // default
	protected int d;
}

// 강사님이 추가해 준거. 이렇게도 접근됨.
class Sub extends Sample {
	public void method() {
		this.d = 10;
		d = 10;
	}
	
}

public class AccessEx {

	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
		// sample.b = 10; // private라 접근 안됨 오류!
		sample.c = 10;
	}
}
