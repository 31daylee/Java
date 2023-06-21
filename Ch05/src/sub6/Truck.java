package sub6;
/**
 * 날짜 : 2023/06/21
 * 이름 : 이현정
 * 내용 : Java 오버라이드 실습하기 
 */
public class Truck extends Car {
	
	private int capacity;
	
	public Truck(String name, String color, int speed, int capacity) {
		super(name,color,speed);
		this.capacity = capacity;
	}	
	
	@Override	
		public void speedUp(int speed) {
		this.speed += speed -20;
	}
	
	public void load(int capacity) {
		this.capacity += capacity;
	}
	public void show() {
		super.show();
		System.err.println("적재량 : " + this.capacity);
	}

}
