package test3;

/*
 * 날짜 : 2025/07/16
 * 이름 : 김수진
 * 내용 : 인터페이스 연습문제
*/

interface Buyer {          // Buyer 인터페이스 선언
    public void buy();
}

interface Seller {         // Seller 인터페이스 선언
    public void sell();
}

class Customers implements Buyer, Seller {   // 두 인터페이스 구현
    @Override
    public void sell() {
        System.out.println("판매하기");
    }

    @Override
    public void buy() {
        System.out.println("구매하기");
    }
}

public class Test310 {
    public static void main(String[] args) {
        Buyer buyer = new Customers();    // Buyer 타입으로 Customers 인스턴스 생성
        Seller seller = new Customers();  // Seller 타입으로 Customers 인스턴스 생성
        
        buyer.buy();
        seller.sell();
    }
}
