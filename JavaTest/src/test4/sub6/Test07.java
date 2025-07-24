package test4.sub6;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test07 {
	public static void main(String[] args) {
		for(int count=1; count <=5; count++) {
		System.out.println(makeLotto());
		}
	}
	  public static Set<Integer> makeLotto() {
		  Set<Integer> lottoSet = new HashSet<>();
	  
		for(;;) { //무한 반복
			// num값이 1~46까지
			int num = (int) Math.ceil(Math.random()*46);
			lottoSet.add(num);
			if(lottoSet.size() == 6) {
			break;
			}
		}
		
	// 정렬을 위해 TreeSet 사용
	Set<Integer> treeSet = new TreeSet<>(lottoSet);
	
	return treeSet;
	}
}