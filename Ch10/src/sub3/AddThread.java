package sub3;

public class AddThread extends Add implements Runnable{ // Add class를 상속받았기에 인터페이스를 구현받고 이와 관련된 자식클래스 실행(오버라이딩) 

	private int start;
	private int end;
	
	public AddThread (int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	
	@Override
	public void run() {
		for(int k=start; k<=end; k++) {
			setNum(k);
		}
	}

}
