package test3;

/*
 * 날짜 : 2025/07/16
 * 이름 : 김수진
 * 내용 : 다형성 연습문제
*/

abstract class Product {
    protected String productName;   // ???
    protected int price;            // ???

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    public void spec() {}     // 비어있는 부분 (추상메서드)
}

class SmartPhone extends Product {
    public SmartPhone(String productName, int price) {
        super(productName, price);
    }

    @Override
    public void spec() {
        System.out.println("--------------------");
        System.out.println("제품명 : " + productName);
        System.out.println("제품가격 : " + price);
    }
}

class Computer extends Product {
    public Computer(String productName, int price) {
        super(productName, price);
    }

    @Override
    public void spec() {
        System.out.println("--------------------");
        System.out.println("제품명 : " + productName);
        System.out.println("제품가격 : " + price);
    }
}

public class Test308 {
    public static void main(String[] args) {
        Product[] products = new Product[2];
        products[0] = new SmartPhone("갤럭시S25", 1200000);
        products[1] = new Computer("LG그램", 1500000);
        
        //p1.spec(); 쌤은 이걸로 함
        for(Product p : products) {
            p.spec();
        }
    }
}
