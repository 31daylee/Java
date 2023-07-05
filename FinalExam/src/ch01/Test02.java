package ch01;

/**
 * 날짜 : 2023/07/05
 * 이름 : 이현정
 * 내용 : 세모
 */
public class Test02 {

	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++) {
			
			for(int j=4; j>i; j--) {
				System.out.print("☆");
			}
			for(int j=1; j<=(2*i)-1; j++) {
				System.out.print("★");
			}
			for(int j=4; j>i; j--) {
				System.out.print("☆");
			}
			System.out.println();
		}
	}
}

