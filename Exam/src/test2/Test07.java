package test2;
/**
 * 날짜 : 2023/06/15
 * 이름 : 이현정
 * 내용 : 자바 최대공약수 메서드 연습문제
 */
public class Test07 {

	public static void main(String[] args) {
		
		System.out.println("  1과   5의 최대공약수 : "+gcd(1,5));
		System.out.println("  3과   6의 최대공약수 : "+gcd(3,6));
		System.out.println(" 12과  18의 최대공약수 : "+gcd(12,18));
		System.out.println(" 60과  24의 최대공약수 : "+gcd(60,24));
		System.out.println("192과 162의 최대공약수 : "+gcd(192,162));

	}

	private static int gcd(int a, int b) {
		
		int temp = 0;
		
		if(a < b) {
			temp = a;
			
		}else {
			temp = b;
		}// 두 수 중에 작은 수를 temp에 넣자
		
		while (true) {
			
			if(a % temp == 0 && b % temp == 0 ) {
				break;  // 나눴을 때 0을 만드는 값은 최대공약수이기에 a와 b모두 0을 만드는 temp값을 찾는다면 멈춰라
			}
			temp--;	 // 나머지가 0일 될 때까지 temp의 수를 낮추는 식
		}
		return temp;
		
	}
}

