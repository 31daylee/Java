package Practice;

import java.util.Scanner;

public class SwichTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		switch(num / 10) {
		
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("B");
			break;
		case 8:
			System.out.println("C");
			break;
		case 7:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}

	}

}
