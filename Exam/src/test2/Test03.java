package test2;
/**
 * 날짜 : 2023/06/15
 * 이름 : 이현정
 * 내용 : 자바 배열 문자 출력 연습문제
 */
public class Test03 {

	public static void main(String[] args) {
		
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i]+ ", " );
		}
		
		System.out.println("\n");
		
		for (int j = 0; j <5; j++) {
			int temp = arr[j]; // 임시 temp변수에 저장하라 
			arr[j] = arr[9 - j];
			arr[9 - j] = temp; // arr[9]를 템프에 넣기 전에 arr[9]-10을 첫번째 자리(arr[0])에 가져다 줘야함 
			
		}
		
		for(int n = 10; n >0 ;  n--) {
			System.out.print(n+", ");
		}

	}

}
