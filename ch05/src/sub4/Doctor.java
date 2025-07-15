package sub4;

public class Doctor extends Person{

	private String specialty;
	
	public Doctor(String name, int age, String specialty) {
		
		super(name, age);
		this.specialty = specialty;
	}
	
	public void work() {
		super.work();
		System.out.println("저는의사고, ["+this.specialty+"]선생님 입니다.");
	}
}
