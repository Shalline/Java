package sub06;

public class Dog extends Pet{
	@Override
	public void bark() {
		System.out.println("MungMung...");
	}
	// 오버라이드를 위한 매서드이기 때문에 매서드 내용은 필요 없음
	@Override
	public void petty() {
		System.out.println("doggy...");
	}
}
