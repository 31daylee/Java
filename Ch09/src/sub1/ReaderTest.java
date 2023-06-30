package sub1;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 날짜 : 2023/06/29
 * 이름 : 이현정
 * 내용 : Java 문자 스트림 실습하기
 * 
 * 문자 스트림
 * - 아시아권 문자를 위한 문자 전용 스트림
 * - 유니코드 기반으로 UTF-8 인코딩으로 아시아권 문자 인코딩 처리 
 */
public class ReaderTest {
	public static void main(String[] args) {
		
		String path ="C:\\Users\\Java\\Desktop\\Sample1.txt";
		String target ="C:\\Users\\Java\\Desktop\\Sample2.txt";
	
		
		try {
		//스트림 생성 및 연결 
			FileReader fr = new FileReader(path);
			FileWriter fw = new FileWriter(target);
		
		
		
		while(true) {
			
			//파일 읽기
			int data = fr.read(); //byte도 정수타입이므로 int타입
			
			if(data == -1) { //주석을 보면 -1인 경우에 reached했다란 말이 있음. 따라서 -1와 비교를 한다 
				break;
			}
			
			// 숫자를 문자로 변환 
			char ch = (char) data;
			
			System.out.print(ch); //영어는 가능하지만 한글은 유니코드라 출력 불가 
			
			// 파일 쓰기
			fw.write(data);
			
			
		}
		fr.close();
		fw.close();
		
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}

	System.out.println("\n프로그램 종료...");
	
	
}// main end

}