package step3;

import java.util.Scanner;

/**
 * 날짜 : 2023/07/17
 * 이름 : 이현정
 * 내용 : A + B -3
 */
public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t= sc.nextInt();
		int arr[] = new int[t]; // 배열의 길이 지정
		
		
		for(int i =0; i<t; i++) { //0부터 t까지의 인덱스 정의
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a + b; //입력된 a와 b의 합을 각각의 인덱스에 저장
			
		}
		sc.close();
		
		for (int k : arr) { //arr 에 있는 데이터를 순차적으로 매 반복마다 k에 하나씩 할당
			System.out.println(k);
		}
	
		
		
		
	}

}
