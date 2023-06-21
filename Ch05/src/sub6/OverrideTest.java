package sub6;
/**
 * 날짜 : 2023/06/21
 * 이름 : 이현정
 * 내용 : Java 오버라이드 실습하기 
 * 
 * 오버라이드(메서드 재정의)
 * - 부모클래스의 메서드를 자식클래스에서 재정의하는 문법
 * - 오버라이드 기능을 통해서 객체지향 프로그래밍 다형성을 구현
 */

class AAA  {
	
	public void method1() {
		System.out.println("AAA : method1...");
	}
	public void method2() {
		System.out.println("AAA : method2...");
	}
	//overload
	public void method3() {
		System.out.println("AAA : method3...");
	}
	
}

class BBB extends AAA{
	
	@Override
	public void method2() {
		System.out.println("BBB : method2...");
	}
	//overload
	public void method3(int a) {
		System.out.println("BBB : method3...");
	}
}
	


class CCC extends BBB{
	
	@Override
	public void method1() {
		System.out.println("CCC : method1...");
	}
	
	@Override
	public void method2() {
		System.out.println("CCC : method2...");
	}
	//overload
	public void method3(int a, int b) {
		System.out.println("CCC : method3...");
	}
	
}






public class OverrideTest {
	public static void main(String[] args) {
		
		//오버라이드 메서드 호출
		CCC c = new CCC();
		
		c.method1(); //할아버지의 내용을 손자가 덮어쓰기 때문에 손자(기존)의 내용으로 출력 / method1 은 override 메서드
		c.method2(); // 위와 동일
		c.method3(); // method3은 aaa,bbb,ccc에 다 있지만 매개변수만 다르다(오버로드) - 매개변수가 없는 형식인 AAA에서 실행된다
		c.method3(1); // 매개변수를 하나 가지는, int a가 있는 BBB에서 실행
		c.method3(1, 2); // 매개변수가 두개 가지는, CCC에서 실행 
		
		
		//Car 상속객체 생성
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		Truck bongo = new Truck("봉고", "남색", 0, 0);
		
		sonata.speedUp(80);
		sonata.show();
		
		bongo.speedUp(80);
		bongo.show();
		
		
		
		
		
		
		
		
	}

}
