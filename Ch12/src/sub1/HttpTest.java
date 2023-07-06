package sub1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 날짜 : 2023/07/06
 * 이름 : 이현정
 * 내용 : HTTP 통신 실습하기 
 * 
 */
public class HttpTest {
	
	public static void main(String[] args) {
		
		//선언
		FileOutputStream fos = null; //파일에 기록하는 스트림
		BufferedReader br = null; //버퍼를 장착한 문자 스트림 
		
		
		try {
			URL url = new URL("https://google.com");
			
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			fos =new FileOutputStream("./Result.txt"); //현재디렉토리는 sub1을 가리킴	
					
			String line = null;
			
			
			while((line = br.readLine()) != null) { 
				
				System.out.println(line);
			
				fos .write(line.getBytes());
			}
			
			
			br.close();
			fos.close();
	
					
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
		
		
	}
}
