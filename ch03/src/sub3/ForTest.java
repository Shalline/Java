package sub3;

/*
날짜 : 2025/07/08
이름 : 김수진
내용 : 자바 for 조건문 실습하기
*/

public class ForTest {

	public static void main(String[] args) {
		
	// for 기본
		for(int i=0 ; i< 10 ; i++ ) { // 10보다 작을때 까지(0~9).
			System.out.println("i : " + i);
			
		}
		
	// 1부터 10까지 합
		int sum = 0;
		
		for(int k=1; k <=10; k++) {
			sum = sum + k; // sum += k;
		}
		System.out.println("1부터 10까지 합 : " + sum);
		
	// 1부터 10까지 짝수합
		int tot = 0;
		
		for(int k=1; k <=10; k++) {
			// (int k=2; k <=10; k2+) 이렇게 해도 된
			
			if(k % 2 == 0) {
				tot += k;
			}
		}
		System.out.println("1부터 10까지 짝수합 : " + tot);
		
	// for 중첩
		for(int a=1 ; a<=3 ; a++) {
			
			System.out.println("a : " + a);
			
			for(int b=1 ; b<=5 ; b++) {
				
				System.out.println("b : " + b);
			}
		}
		
	// 구구단 
		for(int x=1 ; x <=9 ; x++) {
			
			System.out.println("x : " + x);
			
			for(int y=1 ; y<=9 ; y++) {
				
				int z = x * y;
				
				//System.out.println(x + " x " + y + " = " + z);
				System.out.printf("%d x %d = %d\n", x, y, z);
			}
			
		}
		
	// 별 삼각형
		for(int start = 1 ; start <= 10 ; start++) {
			
			for(int end = 1; end <= start ; end++) {
				System.out.print("★");
			}
			
			System.out.print("\n");  //개행
		}
		
		for (int start1 = 10; start1 >= 1; start1--) {
			
		    for (int end1 = 1; end1 <= start1; end1++) {
		        System.out.print("★");
		    }
		    
		    System.out.print("\n");
		}
		
	}

}



































