package sub3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 날짜 : 2023/06/29
 * 이름 : 이현정
 * 내용 : Java 직렬화 실습하기
 * 
 * 객체 직렬화, 역직렬화
 * - 직렬화(Serialization)는 자바 객체를 스트림을 통해 외부 파일로 생성하는 직업
 * - 역직렬화(Deserializaion)는 외부 객체파일을 다시 자바 객체(인스턴스)로 생성하는 작업 
 * - 스트림으로 전송된 객체는 Serializable 인터페이스 구현
 */
public class SerializeTest {

	public static void main(String[] args) {
		
		
		// 객체 생성
		Apple apple = new Apple("한국", 3000);
	
		
		String path = "C:\\Users\\Java\\Desktop\\Apple.dat";
	
		
		
		try {
			//객체스트림 생성
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos); //보조스트림이기에 단독 사용 불가 
			
			// 객체 내보내기(직렬화)
			oos.writeObject(apple);
		
			
			// 스트림 해제
			oos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
		System.out.println("프로그램 종료... ");
		

	}

}
