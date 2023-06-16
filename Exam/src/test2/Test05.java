package test2;

import java.util.Scanner;

/**
 * 날짜 : 2023/06/15
 * 이름 : 이현정
 * 내용 : 자바 배열 이진탐색 연습문제
 */
public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {5, 10, 18, 22, 35, 55, 75, 103, 152}; 
		
		System.out.print("검색할 값 입력 : ");  
		int value = sc.nextInt();
		
		int start = 0;
		int end = arr.length -1;
		int loc = 0;
		boolean state = false;
		
		while(start <= end) {
			
			int mid = (start + end) / 2;
			
			if(arr[mid]> value) {  //중간값이 내가 찾으려는 value값보다 작다면? if문 실행하기
				end = mid -1;    // 끝은 중간값에서 앞까지
			}else if(arr[mid] < value) {
				start = mid + 1;  // 시작은 중간값보다 하나 큰 자리로 
			}else {
				loc = mid;
				state = true;
				break;
			}
		}
		if(state) {
			System.err.printf("찾는 위치 : %d번째 있습니다.", loc+1);
		}else {
			System.out.println("찾는 숫자가 없습니다.");
		}
		sc.close();

	}

}
