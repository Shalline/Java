package sub02;

/*
날짜 : 2025/07/14
이름 : 김수진
내용 : 클래스 은행계좌 실습하기
*/

public class Account {

		// 속성
		private String bank;
		private String id;
		private String name;
		private int balance;
		
		public Account(String bank, String id, String name, int balance) {
			this.bank = bank;
			this.id = id;
			this.name = name;
			this.balance= balance;
		}
		
		// 기능
		public void deposit(int money) {
			this.balance += money;
		}
		public void withraw(int money) {
			this.balance -= money;
		}
		public void show() {
			System.out.println("--------------------------");
			System.out.println("은행명 : " + this.bank);
			System.out.println("계좌번호 : " + this.id);
			System.out.println("입금주 : " + this.name);
			System.out.println("현재잔액 : " + this.balance);
			System.out.println("--------------------------");
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBank() {
			return bank;
		}
		public void setBank(String bank) {
			this.bank = bank;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
}
