package sub4;
/**
 * 날짜 : 2023/06/14
 * 이름 : 이현정
 * 내용 : Java 반복문 while 실습하기
 * 
 */
public class WhileTest {

	public static void main(String[] args) {
		
		
		//1 부터 10까지 합
		int sum = 0;
		int k = 1;
		
		while(k <= 10 ) {
			
			sum += k;
			k++;
			
		}
		System.out.println("1 부터 10까지 합 : "+ sum);
		
		//do-while
		
		int tot = 0;
		int i = 1;
		
		do { 
			if(i % 2 == 0) {
			tot += i;
			}
			i++;
			
		}
		while(i <= 10);
		
		
		System.out.println("1 부터 10까지 짝수합 : "+ tot);
		
		
		//break
		int num = 1;
		
		while(true) {
			
			if(num % 5 == 0 && num % 7 == 0 ) { // 5로 나눴을 때와 7로 나눴을 때 값이 0인걸 찾기
				break;  // 35번 돌았을 때 조건식에 해당하는 값이 나오므로 break문을 타고 나오게 됨
			}
			num++;
		}
		System.out.println("5와 7의 최소공배수 : "+ num);
		
		
		//continue
		int total = 0;
		int j = 0;
		
		
		while(j <= 10) {
			j++;
			
			if(j % 2 == 1) { // j가 나머지 값이1이라면 while문 위로 올려줌. 만약 나머지가 1이 아닌(=나머지 2: 짝수)인 경우에 total로 내려감
				continue; // 반복문 처음으로 이동
				
			}
			total +=j;
		}
		
		System.out.println("1부터 10까지 짝수합 : "+ total);
	}
	

}
