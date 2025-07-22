package sub4;

public class Apple{ // extends Object 암묵적으로 상속되고있다.

	private String country;
	private int price;
	
	public Apple(String country, int price) {
		super();
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}
	
	public void show() {
		System.out.println("원산지 : " + country);
		System.out.println("가격 : " + price);
	}
}
