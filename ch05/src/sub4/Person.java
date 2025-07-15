package sub4;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void work() {
		System.out.println("Person is Working");
	}
	
	public void introduce() {
		System.out.println("이름은 ["+name+"]이고, 나이는 ["+age+"]입니다.");
		
	}
	// ✅ 여기서 메인 메서드 작성
	public static void main(String[] args) {
		Doctor doctor = new Doctor("김유신", 23, "소아과");
		Engineer engineer = new Engineer("김춘추", 70, "소프트웨어");

		System.out.println("=== 의사 소개 ===");
		doctor.introduce();
		doctor.work();

		System.out.println();

		System.out.println("=== 엔지니어 소개 ===");
		engineer.introduce();
		engineer.work();
	}
}

