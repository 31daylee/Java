package sub7;

public class Tiger extends Animal {
	
	@Override
	public void move() {
		System.out.println("Tiger run ...");
	}
	
	public void hunt() { // 오버라이드 메서드 아니다 - Animal에 Hunt가 정의되어 있지 않음 
		System.out.println("Tiger hunt ...");
	}

}
