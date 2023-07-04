package sub2;
/**
 * 날짜 : 2023/07/03
 * 이름 : 이현정
 * 내용 : 자바 Thread Synchronized 실습하기
 */
public class Count {
	
	private int num;
	
	
	public int getNum() {
		return num;
	}
	
	// 동기화 블럭 : 스레드가느이 경합을 막고 동기방식으로 실행
	public synchronized void setNum() { // 3개의 스레드가 진입. 이 과정(병행) 중에 에러발생할 수 있음. 따라서 스레드가 하나씩 진행가능하도록 대기를 시켜줘야함 => 동기화
		this.num++;
	}

}
