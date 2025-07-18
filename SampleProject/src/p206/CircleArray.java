package p206;

class Circle{
	int radius;						   // 객체 만드는 것
	public Circle(int radius) {        // 다른곳에서 Circle이 호출되면 
									   // 여기서 정의된 것을 수행
		this.radius = radius;
	}
	public double getArea() {          // 일종의 함수 getArea()란 행동에 대한 정의
		return 3.14*radius*radius;     // java에서 일반 메서드
	}
}

public class CircleArray {
	public static void main(String[] args) {
		// 보통 이렇게 생성과 선언을 분리하지는 않는데 책이라서
		// 잘 알라고 해놓은 듯 
		// Circle[] c = new Circle[5];
		Circle [] c; // 선언
		c = new Circle[5]; // 생성
		
		for(int i=0; i<c.length; i++)
			c[i] = new Circle(i);
			
		for(int i=0; i<c.length; i ++)
			System.out.print((int)(c[i].getArea()) + " ");
	}
}
