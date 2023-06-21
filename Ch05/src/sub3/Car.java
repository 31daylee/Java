package sub3;
/**
 * 날짜 : 2023/06/20
 * 이름 : 이현정
 * 내용 : 클래스 변수, 클래스 메서드 실습하기 
 */ 
public class Car {
	
	//필드
	private String name; // Heap에 저장된다 
	private String color; // Heap에 저장된다 
	private int speed; // Heap에 저장된다 
	
	
	//클래스 변수 (=정적변수)
	public static int count ; // static 은 public 이므로 캡슐화를 하지 않음, Method Area 에 저장된다 
	
	
	//생성자 // 초기화를 담당하는 메서드
	public Car( String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++; //(this 생략가능)
		
	}
	
	public static int getCount() { //리턴 타입이므로 int로 변경해주기 / 클래스 메서드 
		return count;  // 카운터는 static을 다루기에 static으로 선언을 하는게 문법적으로 맞음 
	}
	
	
	
	public void speedUp(int speed) {
		this.speed += speed;
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	public void show () {
		System.out.println("차랑명 : "+ this.name);
		System.out.println("차량색 : "+ this.color);
		System.out.println("현재속도 : "+ this.speed);
	}

}
