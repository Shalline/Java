package test4.sub2;

public class Product {

	private String productName;
	private String productId;
	private int price;
	private int quantity;
	
	// 생성자
	public Product(String productName, String productId,
			int price, int quantity	) {
		this.productName = productName;
		this.productId = productId;
		this.price = price;
		this.quantity = quantity;
	}

	public void updatePrice(int price) {
            this.price = price;
            System.out.println("키보드 가격 수정 됨");
	}
	public void addStock(int quantity) {
		this.quantity += quantity;
		System.out.println("키보드 "+quantity+"개 재고 추가 됨");
	}
	public void printProductInfo() {
		System.out.println("상품 ID : " + productId);
        System.out.println("상품이름 : " + productName);
        System.out.println("상품가격 : " + price);
        System.out.println("재고수량 : " + quantity);
	}
	
	
	
}
