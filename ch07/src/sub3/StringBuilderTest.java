package sub3;

/*
날짜 : 2025/07/21
이름 : 김수진
내용 : StringBuilder 클래서 실습하기
*/


public class StringBuilderTest {

	public static void main(String[] args) {
		// String의 불변성(Immutable)
		String str = "Java";
		System.out.println("str 주소: "+ System.identityHashCode(str));
	
		str += "Ptogramming";
		System.out.println("str 주소: "+ System.identityHashCode(str));
		
		System.out.println(str);
		/*str 주소: 681842940
		str 주소: 989110044 
		결과를 보면 객체가 바뀐다는 것을 알 수 있다.*/
		
		
		//진번한 문자열 변경을 위한 StringBuffer
		StringBuffer sb = new StringBuffer (("Java"));
		System.out.println("sb 주소: "+ System.identityHashCode(str));
		
		sb.append("programming");
		System.out.println("sb 주소: "+ System.identityHashCode(sb));
		
		System.out.println(sb);
	}

}
