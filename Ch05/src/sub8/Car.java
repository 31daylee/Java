package sub8;

public abstract class Car { //추상메서드를 지닌 클래스이기에 추상클래스로 정의할 수 있음 
	protected String name;
	protected String color;
	protected int speed;
	
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		
		
	}
	
	public abstract void speedUp(int speed); //메서드 선언 부분만 있고 내용이 없음 -> 메서드 선언(다만, 미완성적임 => 추상메서드)
	public abstract void speedDown(int speed);
	
	public void show() {
		System.out.println("차량명 : "+ this.name);
		System.out.println("차량색 : "+ this.color);
		System.out.println("현재속도 : "+ this.speed);
	}

}



