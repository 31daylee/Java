package sub5;

import java.io.File;
import java.io.IOException;

/**
 * 날짜 : 2023/06/30
 * 이름 : 이현정
 * 내용 : 자바 file 클래스 실습하기   
 * 
 * 파일 클래스
 * - File 클래스는 파일에 대한 경로나 정보를 조회할 때 사용하는 클래스
 * - 별도의 입출력 기능이 없어 스트림을 통한 데이터 입출력  
 * */
public class FileTest {

	public static void main(String[] args) {
		
		//파일 객체 생성
		File f1 = new File("C:\\\\Users\\\\Java\\\\Desktop\\\\file1.txt"); //입출력 기능이 없다 
		File f2 = new File("C:\\\\Users\\\\Java\\\\Desktop\\\\file2"); // 확장자가 없는건 폴더(디렉터리) 생성
		
		
		
		// 파일/폴더 생성 > 예외발생으로 예외처리 해줌 
		try {
			f1.createNewFile(); //파일
			f2.mkdir(); 		//디렉터리(make directory)
			
			// 파일 구분확인   
			System.out.println("f1 isFile : "+ f1.isFile());  //is 나 has로 시작하는 것은 boolean 함수 
			System.out.println("f1 isDirectory : "+ f1.isDirectory());
			System.out.println("f2 isFile : "+ f2.isFile());
			System.out.println("f2 isDirectory : "+ f2.isDirectory());
			System.out.println("f1 getName : "+ f1.getName());
			System.out.println("f2 getName : "+ f2.getName());
			System.out.println("f1 getAbsolutePath : "+ f1.getAbsolutePath()); //절대경로 : 시스템상 위치하는 모든 경로 
			System.out.println("f2 getAbsolutePath : "+ f2.getAbsolutePath());
			System.out.println("f1 getPath : "+ f1.getPath()); //상대경로 : 단순히 상위경로만 나타냄
			System.out.println("f2 getPath : "+ f2.getPath());
			
			
			f1.delete();
			f2.delete();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
		

	}

}
