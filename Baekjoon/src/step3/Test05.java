package step3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * 날짜 : 2023/07/20
 * 이름 : 이현정
 * 내용 : 코딩은 체육과목 입니다
 */
public class Test05 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 시스템으로 받은 데이터를 문자 스트림으로 변환하는 역할 
		
		int a = 0;
		
		String str = " ";
		
		
		try {
			a = Integer.parseInt(br.readLine()); // br를 사용하여 문자열 입력 받고 readLine()을 통해 사용자가 엔터 키를 누를때까지 입력된 문자열을 읽어들인다. 그 후 문자열을 정수로 변환함 
			for(int i=1; i<=a/4; i++) {
				System.out.print("long"+str);
				
		}System.out.println("int");
			
		} catch (Exception e) {
			
		}
		
		
	}

}
