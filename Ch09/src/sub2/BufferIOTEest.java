package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 날짜 : 2023/06/29
 * 이름 : 이현정
 * 내용 : Java 버퍼 스트림 실습하기
 * 
 * 버퍼 스트림
 * - 기본 입출력 스트림에 Buffer를 장착해서 빠른 입출력을 지원하는 보조 스트림
 */
public class BufferIOTEest {
	
	public static void main(String[] args) {
		
		String path ="C:\\Users\\Java\\Desktop\\Workspace.zip";
		String target ="C:\\Users\\Java\\Desktop\\Workspace2.zip";
		
		try {
			//스트림 생성 및 연결 
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(target);
			
			//보조스트림
			BufferedInputStream bis = new BufferedInputStream(fis);  // 단독으로 사용불가하여 메인스트림(file~)이 필요
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			// 파일 읽기,쓰기 할 때 버퍼를 사용함
			while(true) {
				
				//파일 읽기
				int data = bis.read();
				
				
				if(data == -1) {
					//파일을 모두 읽었을 때 반복 종료
					break;
					
				}
				// 파일 쓰기
				bos.write(data);
				
				
			}
			bis.close();
			
			bos.flush();  // 출력 시스템에 있는 버퍼를 비우기
			bos.close();
			
			fis.close(); //fis와 fos 는 옵션 
			fos.close();
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
		
	}
}
