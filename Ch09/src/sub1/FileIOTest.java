package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 날짜 : 2023/06/29
 * 이름 : 이현정
 * 내용 : Java 파일 입출력 스트림 실습하기
 * 
 * 입출력 스트림(Input/Output Stream)
 * - 프로그램은 데이터 처리와 함께 데이터 저장을 위해 파일 입출력 수행
 * - 파일 입출력을 위해 스트림(데이터 연결 통로) 사용
 */
public class FileIOTest {

	public static void main(String[] args) {
		
		String path ="C:\\Users\\Java\\Desktop\\Sample1.txt";	
		String target = "C:\\Users\\Java\\Desktop\\Sample2.txt";
		
		
		try {
			//스트림 생성 및 연결 
			FileInputStream fis = new FileInputStream(path); //입력
			FileOutputStream fos = new FileOutputStream(target); //출력
			
			
			
			while(true) {
				
				//파일 읽기
				int data = fis.read(); //byte도 정수타입이므로 int타입
				
				if(data == -1) { //주석을 보면 -1인 경우에 reached했다란 말이 있음. 따라서 -1와 비교를 한다 
					break;
				}
				
				// 숫자를 문자로 변환 
				char ch = (char) data;
				
				System.out.print(ch); 
				
				
				// 파일 쓰기
				fos.write(data);
				
				
			}
			fis.close();
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 종료...");
		
		
	}// main end

}
