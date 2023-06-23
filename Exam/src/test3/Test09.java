package test3;
/**
 * 날짜 : 2023/06/23
 * 이름 : 이현정
 * 내용 : 추상클래스, 다형성 연습문제  
 */

abstract class Shape {
	public abstract void draw();
}

class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("draw Triangle!");
	}
}


class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("draw Circle!");
	}
}



public class Test09 {
	
	public static void main(String[] args) {
		
		Test09 here = new Test09();
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.draw(circle);
		here.draw(triangle);
				
	}
	
	public void draw(Shape obj) { //Circle 과 Triangle을 동시에 참조 가능한 Shape타입으로 입력하기 
		obj.draw();
		
	}

}
