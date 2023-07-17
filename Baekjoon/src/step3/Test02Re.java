package step3;

import java.util.Scanner;

public class Test02Re {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t,a,b;
		
		t= sc.nextInt();
		//int arr[] = new int arr[t];
		int[] arr = new int[t];
		
		for(int i=0; i<t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			arr[i]= a+b;
			
		}for(int k : arr) {
			System.out.println(k);
		}
		sc.close();

	}

}
