package extest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {

    private List<Account> accounts = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BankApp app = new BankApp(); //뱅크앱 객체 생성
        app.start(); 				//app객체가 start()행동(매서드)을 하도록 호출
        System.out.println("프로그램 종료"); //start 매서드가 다 실행되고 나면 종료나옴
    }

    public void start() {
        boolean running = true; // running이 true인 동안 계속 반복되기위해서
        // 초기 값을 true로 주고 저 밑에서 5번 누르면 false가 되어 while문을 벗어나서
        // main문의 프로그램 종료로 간다.

        while (running) {
            printMenu(); //메뉴를 출력한다. 
            System.out.print("선택> ");
            int choice = Integer.parseInt(scanner.nextLine());
            //문자열입력받은것을 정수로 바꾼다.
            switch (choice) { // case에 따라 기능구현을 하기 위해 만든듯
                case 1 -> createAccount();
                case 2 -> listAccounts();
                case 3 -> depositAccount();
                case 4 -> withdrawAccount();
                case 5 -> { running = false; }//와일문 종료 선언
                default -> System.out.println("올바른 번호를 선택하세요.");
            } // 해당 선택지 외의 선택을 할경우 실행.
        }
    }

    public void printMenu() { //위에서 메뉴 호출되면 화면에 나옴
        System.out.println("-----------------------------------------------");
        System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
        System.out.println("-----------------------------------------------");
    }

    public void createAccount() {
        System.out.println("---------------계좌 생성---------------");

        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();

        System.out.print("예금주: ");
        String owner = scanner.nextLine();

        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(scanner.nextLine());
        //문자열입력받은걸 정수로 변환해서 balance 변수에 저장
        
        Account newAccount = new Account(ano, owner, balance);
        //Account 클래서 newAccount 객체에 생성자 호출새서 정보 저장
        //생성자 호출: 계좌번호(ano), 예금주(owner), 잔액(balance) 전달
        accounts.add(newAccount);
        // 처음에 만들었던 리스트 저장소에 add매서드 newAccount객체 정보 더함
        // private List<Account> accounts = new ArrayList<>();
        // 정보는 여기에 들어가 있음

        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    public void listAccounts() {
    	System.out.println("---------------계좌 목록---------------");

        for (Account account : accounts) {
            System.out.printf("계좌번호: %s | 예금주: %s | 잔액: %d\n",
                    account.getAno(), account.getOwner(), account.getBalance());
        }
    }

    public void depositAccount() {
    	System.out.println("---------------예    금---------------");

        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();

        Account account = findAccount(ano); // 계좌가 존재하는지 확인
        if (account == null) {
            System.out.println("해당 계좌가 존재하지 않습니다.");
            return;
        }
        // 계좌가 존재한다면
        System.out.print("입금액: ");
        int money = Integer.parseInt(scanner.nextLine());
        
        // account.getBalance() 현재 잔액을 get해서 가져와서 입력된 금액과 더한다.
        // 그 금액을 set으로 잔액 저장 어디에? account에..
        //private List<Account> accounts = new ArrayList<>();
        //accounts 객체 리스트에 값 저장
        account.setBalance(account.getBalance() + money);
        System.out.println("결과: 예금이 성공되었습니다.");
    }

    public void withdrawAccount() {
        System.out.println("---------------출    금---------------");

        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        
        // 입력한 계좌번호로 accounts 리스트에서 해당 계좌를 가져옴
        Account account = findAccount(ano);
        if (account == null) { // 계좌번호가 일치하지 않으면 null리턴
            System.out.println("해당 계좌가 존재하지 않습니다.");
            return;
        }
        // null이 아니라면 = 계좌가 있다면 출금 시작
        System.out.print("출금액: ");
        int money = Integer.parseInt(scanner.nextLine());
        
        // account에서 잔액을 가져오는데 입력된 금액과 비교해본다.
        if (account.getBalance() < money) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        //잔액이 모자라지 않다면 가져온 잔액값에 출금액만큼 빼서 
        //다시 set으로 저장, 업데이트
        account.setBalance(account.getBalance() - money);
        System.out.println("결과: 출금이 성공되었습니다.");
    }
    // 스트링 객체를 입력받아 일히하는 Account 객체를 반환
    public Account findAccount(String ano) {
    	//private List<Account> accounts = new ArrayList<>();
    	// accounts 리스트에 들어 있는 모든 Account 객체를 하나씩 꺼내서, 
    	// 그걸 account라는 이름으로 사용하면서 반복처리
        for (Account account : accounts) {
            if (account.getAno().equals(ano)) { //비교
                return account; // 일치하면 true 계좌번호 리턴
            }
        }
        return null; //일치하는 계좌없으면 null반환, 종료됨.
    }
}
