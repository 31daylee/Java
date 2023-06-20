package sub3;
/**
 * 날짜 : 2023/06/20
 * 이름 : 이현정
 * 내용 : 클래스 변수, 클래스 메서드 실습하기 
 */ 
 

class Increment {
	private int num1;
	public static int num2;
	
	public Increment() {
		num1++;
		num2++;
		
	System.out.println("num1 : "+ num1);
	System.out.println("num2 : "+ num2);
	}
}




public class StaticTest {

	public static void main(String[] args) {
		
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		
		
		
		// 같은 패키니 내에서 선언하므로 import선언이 나타나지 않음
		// Car 실습 
		Car sonata = new Car("소나타", "흰색", 10); //1.객체 생성 2.생성자 호출 
		Car avante = new Car("아반떼", "검정", 20);
		Car grande = new Car("그랜저", "남색",30);
		
		sonata.show(); // show()는 멤버 메서드 -> Car.show() 불가 클래스 이름으로 참조를 하는 것은 오직 static만 가능하다 
		avante.show();
		grande.show();
		
		// 클래스 변수 참조 출력
		System.out.println("전체 차량 수 : " + Car.count); 
		
		// 클래스 메서드 참조 출력 
		System.out.println("현재 차량 수 : " + Car.getCount()); 
		
		
		
		
		
		//싱글톤 객체 실습
		//Calc c1 = new Calc(); 싱글톤(오직 하나의 인스턴스로 생성되는 객체)이므로 새로운 객체 생성이 불가능하다
		
		Calc c1 = Calc.getInstance(); // 게터는 클래스 메서드이므로 클래스 이름으로 참조함. 그리고 참조 연산자 (. dot) 추가 해주기// 싱글톤은 Method Area 에서 생성되므로 굳이 두개의 (New 객체생성)으로 메모리를 많이 쓸 필요가 없음. 따라서 공통된 Cacl를 이용한 싱글톤을 사용
		Calc c2 = Calc.getInstance();
		
		int result1 = c1.plus(1,2);
		int result2 = c2.minus(1,2);
		
		System.out.println("result1 : "+ result1);
		System.out.println("result2 : "+ result2);
		
		
		
		
		
		
		
		
		
		

	}

}
