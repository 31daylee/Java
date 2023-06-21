package sub5;
/**
 * 날짜 : 2023/06/21
 * 이름 : 이현정
 * 내용 : Java 클래스 상속 실습하기 
 */
public class Car {
	
	//필드
	protected String name;
	protected String color;
	protected int speed;
	
	
	//생성자
	public Car(String name,  String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	
	//메서드 
	public void speedUp(int speed) {
		this.speed += speed;
		
	}
	public void speedDown(int speed) {
		this.speed -= speed;
		
	}
	public void show() {
		System.out.println("차량명 : "+ this.name);
		System.out.println("차량색 : "+ this.color);
		System.out.println("현재속도 : "+ this.speed);
	}

}
