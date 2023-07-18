package confirm.ch04;
/**
 * 날짜 : 2023/07/18
 * 이름 : 이현정
 * 내용 : 교재 p138
 */
public class Test4 {
	public static void main(String[] args) {
		
		int x = 0;
		int y = 0;
		int sum = 0;
		
		while(true) {
			x = (int)(Math.random()*6)+1;
			y = (int)(Math.random()*6)+1;
			
			System.out.println("("+ x + "," + y +")");
			sum = x + y;
			if(sum ==5) {
				
			}break;
		}
		
	}
}
