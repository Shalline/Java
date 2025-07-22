package sub1;

public class Banana{ // extends Object 암묵적으로 상속되고있다.

	private String country;
	private int price;
	
	public Banana(String country, int price) {
		super();
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Banana [country=" + country + ", price=" + price + "]";
	}
	
	
}
