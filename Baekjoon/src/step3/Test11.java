package step3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 날짜 : 2023/09/14
 * 이름 : 이현정
 * 내용 : A+B - 5
 */
public class Test11 {

	public static void main(String[] args) {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int num = Integer.parseInt(br.readLine());
			int[] sum = new int[num];
			
			int[] a = new int[num];
			int[] b = new int[num];
			
			for(int i=0; i<num; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				a[i] = Integer.parseInt(st.nextToken());
				b[i] = Integer.parseInt(st.nextToken());
				sum[i] = a[i]+b[i];
				
			}
			br.close();
			
			for(int i=0; i<num; i++) {
				System.out.println(sum[i]);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
