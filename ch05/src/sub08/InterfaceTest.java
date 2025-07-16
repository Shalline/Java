package sub08;

/*
   날짜 : 2025/07/16
   이름 : 김수진
   내용 : 인터페이스 실습하기
*/

public class InterfaceTest {

	public static void main(String[] args) {
		
		// 인터페이스 역할1 - 통일된 표준화 설계
		RemoteControl lg = new RemoteLg();
		lg.powerOn();
		lg.powerOff();
		lg.chUp();
		lg.chDown();
		lg.soundUp();
		lg.soundDown();
		
		
		RemoteControl s = new RemoteSamsung();
		s.powerOn();
		s.powerOff();
		s.chUp();
		s.chDown();
		s.soundUp();
		s.soundDown();
		
		// 인터페이스 역할2 - 결합도 완화(유연성)
		Bulb bulb = new Bulb();
		Socket socket = new Power(bulb);
	
		socket.switchOn();
		socket.switchOff();
		
		// 인터페이스 역할3 - 다중상속 효과
		SmartTv smartTv = new SmartTv();
		smartTv.process();
		
	}

}



















