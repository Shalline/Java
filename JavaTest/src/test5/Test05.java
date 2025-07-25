package test5;


class Apple {
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}
	
}

class Banana {
	private String country;
	private int price;
	
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Banana [country=" + country + ", price=" + price + "]";
	}
}

class Grape {
	private String country;
	private int price;
	
	public Grape(String country, int price) {
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Grape [country=" + country + ", price=" + price + "]";
	}
	
}

public class Test05 {

	 public static void main(String[] args) {
		 Apple  apple  = new Apple("한국", 3000);
		 Banana banana = new Banana("미국", 2000);
		 Grape  grape  = new Grape("일본", 1000);
		 
		 showInfo(apple);
		 showInfo(banana);
		 showInfo(grape);
		 
		 }
		public static void showInfo( Object fruit) {
			
			// 업캐스팅한 Object의 과일을 다시 다운캐스팅해서
			// fruit에 과일이 있는지 확인해야된다. instanceof
			if(fruit instanceof Apple) { 
			 Apple apple = (Apple)fruit;
			 System.out.println(apple);
			 
			 }else if(fruit instanceof Banana) {
			 Banana banana = (Banana)fruit;
			 System.out.println(banana);
			 
			 }else if(fruit instanceof Grape) {
			 Grape grape = (Grape)fruit;
			 System.out.println(grape);
			 }
		}

}
