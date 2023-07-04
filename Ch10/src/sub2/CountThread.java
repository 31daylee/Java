package sub2;

public class CountThread extends Thread{

	private Count count;
	
	public CountThread(Count count) {
		this.count = count;
	}
	
	
	@Override
	public void run() { //3개의 스레드가 진행 -> setNum 으로 이동
		
		for(int i=1; i<=100; i++) {
			count.setNum();
		}

	}

}
