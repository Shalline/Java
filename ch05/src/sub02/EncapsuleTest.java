package sub02;

/*
날짜 : 2025/07/14
이름 : 김수진
내용 : 인캡슐 실습하기

캡슐화(정보은닉, Encapsulation)
- 갭슐화는 객체의 속성을 외부에서 참조하지 못하게 객체의 속성을 은닉하는 특성
- 클래스의 속성을 반드시 private로 성언
- private 선언을 하면 생성자(Constructor)로 속성을 초기화
- 윽닌된정보(속성)를 안전하게 사용하기 위해 Getter, Setter 사용

*/

public class EncapsuleTest {

	public static void main(String[] args) {
		
		// 객체 생성
		Car sonata = new Car("소나타", "흰색",0); //생성자 호출
		
		// 은닉된 속석(맴버변수)은 생성자(Constructor)로 초기화
		// sonata.name = "소타나";
		
		sonata.speedUp(80);
		sonata.sppedDwon(20);
		sonata.show();
		
		// 객체 생성과 초기화
		Car avante = new Car("아반테","검정색",0);
		
		avante.speedUp(60);
		avante.sppedDwon(20);
		avante.show();
		
		// 개별 속성이 은닞되어 있기 떄문에 속성 수정 불가
		// Setter로 수정
		// avante.colot = "남색";
		avante.setColor("남색");
		avante.show();
		
		// Account 객체 생성과 초기화
		Account kb = new Account("국민은행","101-11-1001","김유신",10000);
		
		kb.show();
		
		kb.deposit(20000);
		kb.setName("김유진");
		kb.show();
		
		kb.deposit(20000);
		kb.setBank("우리은행");
		kb.setId("101-21-1001");
		kb.show();
		
		Book book1 = new Book("삼국지","나관중","10001",10);
		book1.show();
		
		boolean isOK = book1.borrowBook();
		
		if(isOK) {
			System.out.println(book1.getTitle()+"도서대출성공");
		}else {
			System.out.println(book1.getTitle()+"도서대출실해");
		}
		book1.show();
	}

}
