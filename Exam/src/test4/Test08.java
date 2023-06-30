package test4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 날짜 : 2023/06/30
 * 이름 : 이현정
 * 내용 : 로또번호 연습문제  
 */
public class Test08 {

	public static void main(String[] args) {
		
		for(int count = 1; count <=5; count++) {
			System.out.println(makeLotto());
		}

	}

	
	
	public static Set<Integer> makeLotto() { // 중복허용을 하지 않기에 Set으로 로또번호를 구할 수 있음
		
		Set<Integer> lottoSet = new HashSet<>();
		
		for(;;) { // 무한반복 - while True
			int num = (int)(Math.random()*46)+1;
			
			lottoSet.add(num);
			
			if(lottoSet.size() == 6) {
				break;
			}
		}
		
		
		//정렬
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		return treeSet;
	}
}
