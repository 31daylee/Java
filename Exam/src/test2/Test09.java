package test2;
/**
 * 날짜 : 2023/06/15
 * 이름 : 이현정
 * 내용 : 자바 최대공약수 재귀 메서드 연습문제
 */
public class Test09 {

	public static void main(String[] args) {
		
		
		System.out.println("  1과   5의 최대공약수 : "+gcd(5, 1));
		System.out.println("  3과   6의 최대공약수 : "+gcd(6, 3));
		System.out.println(" 12과  18의 최대공약수 : "+gcd(18, 12));
		System.out.println(" 60과  24의 최대공약수 : "+gcd(60, 24));
		System.out.println("192과 162의 최대공약수 : "+gcd(192, 162));

	}

	public static int gcd(int a, int b) {
		
		if(a%b == 0) { //나눴을 때 나머지가 0이면 나눈값이 나머지가 된다
			return b;
		}else {
			return gcd(b, a%b); //나눠서 나눈 나머지를 활용해 반복하기 
		}	
	}

}
