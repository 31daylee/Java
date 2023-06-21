package sub6;
/**
 * 날짜 : 2023/06/21
 * 이름 : 이현정
 * 내용 : Java 오버라이드 실습하기 
 */
public class Sedan extends Car {
	
	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name,color,speed);
		this.cc = cc;
		
	}
	
	@Override
	public void speedUp(int speed) {
		this.speed += speed + 20; //자식 클래스에서 재정의
	}
	
	public void speedTurbo() {
		this.speed += 20;
	}
	public void show() {
		super.show();
		System.out.println("배기량: "+ this.cc);
	}

}
