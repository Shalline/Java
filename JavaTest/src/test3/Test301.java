package test3;

/*
 * 날짜 : 2025/07/16
 * 이름 : 김수진
* 내용 : 자바 클래스 연습문제
*/

public class Test301 {
	
	 private String name;
	 private int age;
	 
	 public Test301(String name, int age) {
		 this.name = name;
		 this.age = age;
	 }
	 
	 public void show() {
		 System.out.println("================");
		 System.out.println("이름 : "+this.name);
		 System.out.println("나이 : "+this.age);
		 System.out.println("----------------");
	 }
	 
	 public static void main(String[] args) {
		Test301 kim = new Test301("김유신", 23); 
		Test301 lee  = new Test301("이순신", 31); 
		kim.show();
		lee.show();
	 }
}
