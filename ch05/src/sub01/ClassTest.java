package sub01;

/*
날짜 : 2025/07/14
이름 : 김수진
내용 : 자바 객체지향 프로그래밍 클래스 실습하기

 스택(Stack)
 - 자바의 일반변수, 참조변수, 지역변수가 push되어 저장되는 메모리 영역
 - 해당 메서드 영역 및 프로그램이 종료되면 pop되어 있 메모리에서 제서
 - 객체(참조변수)는 스택에서 Heap 메모리 공간의 객체 인스턴스 참조
 
 힙(Heap) 
 - 자바의 객체가 생성되는 메모리 공간
 - 스택처럼 순서대로 쌓이지 않고 랜덤으로메모리 공간에 생성
 - 참조변수가 제거되어 더이상 참조 되지 않으면 Garbage Collector로 해제됨
*/

public class ClassTest {

	public static void main(String[] args) {
		
		// 객체 생성(인스턴스화)
		// 소나타는 객체(참조변수), Car는 참조타입
		Car sonata = new Car();
		
		// 객체 초기화
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;	
		
		// 객체 상호작용(기능 활용)
		sonata.speedUp(80);
		sonata.sppedDwon(10);
		sonata.show();
		
		// 객체생성, 초기화, 상호작용
		// 선언(declare)할 때는 일반적으로 null로 초기화
		Car avante = null; 
		avante = new Car(); // 생성
		
		// initialize
		// 초기화: 변수의 최고값을 대입
		avante.name = "아반테"; 
		avante.color = "검정생";
		avante.speed = 0;
		
		avante.speedUp(60);
		avante.sppedDwon(20);
		avante.show();
		
		/*
		은행계좌 개체 생성
		은행명 : 국민은행(kb)
		계봐번호: 101-11-1001
		예금주: 김유신
		현재잔액 : 0
		*/
		
		// 은행계화 객체 생성
		// 객체 초기화
		Account kb = new Account();
		kb.bank = "국민은행";
		kb.id = "101-11-1000";
		kb.name = "김유신";
		kb.balance = 0;
		
		kb.deposit(100000);
		kb.withraw(30000);
		kb.show();
		
		/*
		은행계좌 개체 생성
		은행명 : 우리은행(wr)
		계봐번호: 101-21-1001
		예금주: 김춘추
		초기잔액 : 10000
		출력잔액 : 25000
		*/
		
		Account wr = new Account();
		wr.bank = "우리은행";
		wr.id = "101-21-1000";
		wr.name = "김춘추";
		wr.balance = 10000;
		
		wr.deposit(20000);
		wr.withraw(5000);
		wr.show();
		
	}

}
