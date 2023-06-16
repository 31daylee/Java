package test2;

import java.security.PublicKey;
import java.util.Scanner;

/**
 * 날짜 : 2023/06/15
 * 이름 : 이현정
 * 내용 : 자바 메서드 연습문제
 */
public class Test06 {

	public static void intro () {  
		System.out.println("******* START *******");
		System.out.println("두개의 정수를 입력");
	}
	
	public static int input(Scanner sc, String name) { //name의 타입을 찾는 곳은 input을 호출하는 곳으로 이동(36-37라인)
		System.out.print("변수 "+ name +"값 입력 : ");
		int input = sc.nextInt();
		return input;	
	}
	public static void result (int val) {
		System.out.println("덧셈 결과 : "+ val);
		System.out.println("******* END *******");
	}
	public static int add (int x, int y) { // int + int => int 
		return x + y;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		intro ();  //START값 호출문
	
		int a = input(sc, "a"); //문자('')가 아닌 문자열("")
		int b = input(sc, "b");
		
		int output = add(a,b);
		result(output); //result 호출 장소 - output의 매개변수 타입은? => int 
		
		sc.close();
	}

}
