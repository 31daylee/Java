package sub1;
/**
 * 날짜 : 2023/06/19
 * 이름 : 이현정
 * 내용 : Java 클래스 실습하기
 */

// Car 클래스 정의
public class Car {
	
	// 필드(속성)
	String name;
	String color;
	int speed;
	
	
	
	
	
	
	// 메서드(기능) 필드 속성과 관련된 기능을 정의
	public void speedUp(int speed) {
		this.speed += speed; // this.speed = this.speed + speed // this 를 쓰는 것은 매개변수와 구분하기 위해서이고, 전역변수를 지정하기 위해서다. 그리고 출력문 밖으로 나가면 매개변수는 더이상 사용할 수가 없기에 전역변수를 기준을 삼는다 
		
	
	}
	public void speedDown(int speed) {
		this.speed -= speed;
		
	}
	public void show() {
		
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
		
	}

	
	
	
	
	
	
}
