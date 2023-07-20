package confirm.ch05;
/**
 * 날짜 : 2023/07/19
 * 이름 : 이현정
 * 내용 : Java 교재 p199
 */
public class Test07 {

	public static void main(String[] args) {
		int[] array = {1,5,3,8,2};
		
		int maxValue = array[0];
		
		for(int i =1; i<array.length; i++) {
			if(array[i] > maxValue) {
				maxValue = array[i];
			}
			
		}System.out.println(maxValue);
	}

}
