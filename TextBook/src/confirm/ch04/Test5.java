package confirm.ch04;
/**
 * 날짜 : 2023/07/18
 * 이름 : 이현정
 * 내용 : 교재 p138
 */
public class Test5 {
	public static void main(String[] args) {
		
		
		
		for(int x=0; x<=10; x++ ) {
			
			for(int y=0; y<=10; y++) {
				if(4 * x + 5 * y == 60) {
					System.out.println("("+ x + "," + y +")");
				}
				
			}
		}
	}
}
