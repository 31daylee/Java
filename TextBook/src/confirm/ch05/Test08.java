package confirm.ch05;
/**
 * 날짜 : 2023/07/19
 * 이름 : 이현정
 * 내용 : Java 교재 p199
 */
public class Test08 {

	public static void main(String[] args) {
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0;
		int count = 0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				
				sum += array[i][j];
				count++;
			}
		}
		
		avg = (double)sum/ count;
		
		System.out.println(sum);
		System.out.println(avg);

	}

}
