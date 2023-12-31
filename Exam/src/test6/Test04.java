package test6;
/**
 * 날짜 : 2023/07/18
 * 이름 : 이현정
 * 내용 : 자바 총정리 연습문제
 */
public class Test04 {

	public static void main(String[] args) {
		
		System.out.printf("%7s %10s %5s %6s\n", "10진수","2진수","8진수","16진수");
		
		for(int num =1; num <=128; num++) {
			System.out.printf("%7s %10s %5s %6s\n", num, 
														Integer.toBinaryString(num), // 2진수
														Integer.toOctalString(num),  // 8진수
														Integer.toHexString(num));   // 16진수
		}
	}

}
