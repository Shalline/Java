package sub2;

/*
날짜 : 2025/07/24
이름 : 김수진
내용 : 자바 스레드 인터럽트 실습하기
*/


class SubThread extends Thread {
	
	@Override
	public void run() {
		
		int i = 1;
		
		try {
			
			while(true) {
				
				System.out.println("SubThread : "+i);
				i++;
				
				Thread.sleep(1000); // 1초 일시 정지
			}
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}	
	}
}

public class ThreadInterruptTest {

	public static void main(String[] args) {
		
		SubThread sub = new SubThread();
		
		// 작업스레드 실행
		sub.start();
		
		
		try {
			// 메인 스레드 5초 일시 정지
			Thread.sleep(1000*5);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		// 작업 스레드 일시정지 발생 시키기
		sub.interrupt();
		
		System.out.println("프로그램 종료...");
		
	}

}
