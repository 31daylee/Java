package confirm.ch04;
/**
 * 날짜 : 2023/07/18
 * 이름 : 이현정
 * 내용 : 교재 p138
 */
public class Test3 {
	public static void main(String[] args) {
		
		int sum = 0;	
		
		for(int i=1; i<=100; i++) {
			
			if(i % 3 == 0) {
				sum +=i;
			}
			
		}
		System.out.println(sum);
	}
}
