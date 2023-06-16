package test2;
/**
 * 날짜 : 2023/06/15
 * 이름 : 이현정
 * 내용 : 자바 배열 선택정렬 연습문제
 */
public class Test04 {

	public static void main(String[] args) {
		
		int arr[] = {4,2,1,5,3};
		
		for(int i=0; i<4; i++) {
			
			for(int j=i+1; j<5; j++) {
				
				if(arr[i] > arr[j]) {
					int temp = arr[j]; // 인접한 숫자와 비교
					arr[j] = arr[i];	// 자리 교환식 (들어갈 자리 양보)
					arr[i] = temp; 		// 자리 교환식 (자리에 들어가기)
					}
				}
			}
		
			for(int n : arr) {
				System.out.print(n +" ");
			}
		}

}
