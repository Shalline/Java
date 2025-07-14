package sub01;

/*
날짜 : 2025/07/14
이름 : 김수진
내용 : 클래스 은행계좌 실습하기
*/

public class Account {

		// 속성
		public String bank;
		public String id;
		public String name;
		public int balance;
		
		// 기능
		public void deposit(int money) {
			this.balance += money;
		}
		public void withraw(int money) {
			this.balance -= money;
				}
		public void show() {
			System.out.println("--------------------------");
			System.out.println("은행명 : " + this.balance);
			System.out.println("계좌번호 : " + this.id);
			System.out.println("입금주 : " + this.name);
			System.out.println("현재잔액 : " + this.balance);
			System.out.println("--------------------------");
		}
}
