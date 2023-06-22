package sub8;
/**
 * 날짜 : 2023/06/23
 * 이름 : 이현정
 * 내용 : Java 추상클래스 실습하기 
 */
public class Sedan extends Car {
	
	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name,color,speed);
		this.cc = cc;
		
	}
	
	public void speedTurbo() {
		this.speed += 20;
	}
	public void show() {
		super.show();
		System.out.println("배기량: "+ this.cc);
	}

	//추상메서드 2개가 오버라이드 메서드로 정의
	@Override
	public void speedUp(int speed) {
		this.speed += speed;
		
	}


	@Override
	public void speedDown(int speed) {
		this.speed -= speed;
		
	}

}
