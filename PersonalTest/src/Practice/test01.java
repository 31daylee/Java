package Practice;

public class test01 {
	
	public static void main(String[] args) {
		
		int arr[][] = {{1,2,3,4,5},{6,7,8,9,10}};
		int a =0; 
		int b =0;
		
		while( a <arr.length ) {
			
			a++;
			
		 while( b <arr[a].length) {
			
				System.out.println(arr[a][b]+ " ");
				
				b++;
				
			}
		
		}
			
			
		
		
	}
	
}	