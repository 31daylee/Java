package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 날짜 : 2023/06/29
 * 이름 : 이현정
 * 내용 : Java 역직렬화 실습하기
 */
public class DeserializeTest {

	public static void main(String[] args) {
	
		String path = "C:\\Users\\Java\\Desktop\\Apple.dat";
		
		try {
			//스트림 생성
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//역직렬화 
			Apple apple =(Apple)ois.readObject(); // 모든 최상위 클래스(object)타입은 다운캐스팅이 가능함
			
			apple.show();
			
			//스트림 해제
			ois.close();
			fis.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료...");
	}
	
	
	

}
