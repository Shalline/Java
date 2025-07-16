package sub08;


// 인터페이스 구현
public class RemoteLg implements RemoteControl { 

	@Override
	public void powerOn() {
		System.out.println("Lg poweron...");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Lg poweroff...");
		
	}

	@Override
	public void chUp() {
		System.out.println("Lg chUp...");
		
	}

	@Override
	public void chDown() {
		System.out.println("Lg chDown...");
		
	}

	@Override
	public void soundUp() {
		System.out.println("Lg soundUp...");
		
	}

	@Override
	public void soundDown() {
		System.out.println("Lg soundDown...");
		
	}
	
	
}
