package sub2;
/**
 * 날짜 : 2023/06/19
 * 이름 : 이현정
 * 내용 : Java 캡슐화 실습하기
 */
public class Car {
	
	//필드
	private String name; // 접근 권한을 private으로 변경한다 = 현재 클래스에서만 이용 가능 = 캡슐화 (*클래스의 속성은 무조건 private)
	private String color;
	private int speed;
	
	
	//생성자 (클래스 이름과 동일한 메서드) - 캡슐화로 못했던 초기화를 여기서 하기 // 캡슐화된 속성을 초기화하기 위한 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed =speed;
	}
	
	
	
	
	
	
	//메서드
	
	
	
	public void speedUp(int speed) {
		this.speed += speed;
	}	
	public void speedDown(int speed) {
		this.speed -= speed;
	
	}public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
	
	
	
	// Getter, Setter 정의
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	

}
