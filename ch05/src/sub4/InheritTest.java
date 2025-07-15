package sub4;

/*
날짜 : 2025/07/15
이름 : 김수진
내용 : 상속 실습하기
*/


public class InheritTest {

	public static void main(String[] args) {
		
		Sedan sonata = new Sedan("소나타","흰색",0,2000);
		sonata.speedUp(80);
		sonata.tirbo();
		sonata.sppedDwon(20);
		sonata.show();
		
		Truck bongo = new Truck("본고","남색", 0,0);
		bongo.load(100);
		bongo.speedUp(80);
		bongo.sppedDwon(20);
		bongo.show();
	
		//
		StockAccount kb = new StockAccount("kb증권", "101-22-0100", "홓길동",10000,"삼성전사", 10, 10000);
		kb.deposit(100000);
		kb.withraw(50000);
		kb.buy(5,80000);
		kb.show();
		
		kb.sell(5, 900000);
		kb.show();
	} // main end 
	

}
