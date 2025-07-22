package sub1;

// 재네릭 클래스 FruirBox의 치환변수 T를 선언
public class FruitBox<T> { // <>재네릭문법
	
	private T fruit ;
	
	public T getFruit() {
		return fruit;
	}
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
	
}
