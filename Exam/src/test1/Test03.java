package test1;
/**
 * 날짜 : 2023/06/13
 * 이름 : 이현정
 * 내용 : 자바 연산자 연습문제
 */


public class Test03 {

	public static void main(String[] args) {
		
		int num = 1;
		int result = 1;
		
		result = num++; //대입이 첫번째 그 다음에 증감(++)
		System.out.println("result : "+ result);
		
		result = ++num;
		System.out.println("result : "+ result);
		
		result = num--;
		System.out.println("result : "+ result);
		
		result = --num;
		System.out.println("result : "+ result);
		
		

	}

}
