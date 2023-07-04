package sub2;
/**
 * 날짜 : 2023/07/03
 * 이름 : 이현정
 * 내용 : 자바 Thread Synchronized 실습하기
 * 
 * 동기화(Synchronized)
 * - 동기방식은 순서를 지키며 처리되는 실행 흐름
 * - 비동기방식은 순서를 지키지 않고 처리되는 실행 흐름 
 */

public class ThreadSyncTest {

	public static void main(String[] args) throws InterruptedException {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		//자식 스레드 : 메인스레드에서 벗어나 각자의 기능을 함 => 비동기 방식
		ct1.start();
		ct2.start();
		ct3.start();
		
		
		
		// 자식 스레드 작업이 완료 후 다시 메인 스레드로 합류(스레드 대기)
		// 자식 스레드의 합류 (메인스레드가 자식 스레드가 실행이 끝날 때까지 기다려줌) / join 시에 예외발생 
		ct1.join();
		ct2.join();
		ct3.join();
		
		
	
		
		System.out.println("count 값 : "+ count.getNum());
		
		
	}

}
