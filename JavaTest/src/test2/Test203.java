package test2;

/*
날짜 : 2025/07/10
이름 : 김수진
내용 : 자바 배열 역순으로 정렬 연습문제
*/

public class Test203 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0; i<10; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.print("\n");
		
		for(int j = 0; j<5; j++){
			int temp = arr[j];
			arr[j] = arr[9-j];
			arr[9-j] = temp;
		}
		for(int n = 0; n<10; n++) { //int n : arr 하면 밑에 그냥 n으로 출력하면된.
			System.out.print(arr[n]+", ");
		}
	}
}