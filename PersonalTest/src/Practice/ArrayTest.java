package Practice;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[][] arrs = {{1,2,3,4,5},{6,7,8,9,10}};
		
	
		for(int a =0; a < arrs.length; a++ ) {
			for(int b =0; b<arrs[a].length; b++) {
				System.out.print(arrs[a][b]+ " ");
				
			}
			
		}
		
	}

}
