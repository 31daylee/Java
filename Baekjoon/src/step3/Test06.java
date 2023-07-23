package step3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 날짜 : 2023/07/23
 * 이름 : 이현정
 * 내용 : 빠른 A+B
 */
public class Test06 {

	public static void main(String[] args) {
		
		
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int num = Integer.parseInt(br.readLine());
			
			int[] a = new int[num]; // 배열의 길이가 num 인 새로운 배열 생성
			int[] b = new int[num];
			
			for(int i=0; i<num; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				a[i] = Integer.parseInt(st.nextToken());
				b[i] = Integer.parseInt(st.nextToken());
				
				
			}
			
			br.close();
			
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<num; i++) {
				sb.append(a[i]+b[i]).append('\n');
			}
			System.out.print(sb.toString());
			
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
