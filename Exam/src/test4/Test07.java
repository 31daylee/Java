package test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 날짜 : 2023/06/30
 * 이름 : 이현정
 * 내용 : 리스트 연습문제  
 */
public class Test07 {

	public static void main(String[] args) {
		
		//60~100사이 임의의 수 10개를 더하므로 결과값이 항상 다름 
		printList(createList());

	}
	public static void printList(List<Integer> scoreList) {
		
		int total = 0;
		int size = scoreList.size(); //사이즈는 10 
		
		for(int i =0; i<size; i++) {
			
			int score = scoreList.get(i); //스코어 10개 자리 수에서 수를 끄집어 내기 => get()
			
			total += score;
			
			System.out.print(score);
			
			if(i == size -1) {
				System.out.print(" = ");
			}else {
				System.out.print(" + ");
			}
		}
		System.out.print(total);
		
	}
	
	public static List<Integer> createList() { //리턴타입자리가 문제 > 리턴타입이 무엇이지? > scoreList 의 타입이 뭐지 > List<Integer>
		
		List<Integer> scoreList = new ArrayList<>(); //scoreList 는 정수가 나오므로 이것의 리턴타입은 List<Integer>
		Random rand = new Random();
		
		for(int i =1; i<=10; i++) {
			
			int num = rand.nextInt(41)+60; //1~40까지 랜덤 수 + 60 => 60에서 100사이 
			scoreList.add(num); // 소코어리스트에서 집어 넣기 => add()
			
		}
		return scoreList;
	}

}
