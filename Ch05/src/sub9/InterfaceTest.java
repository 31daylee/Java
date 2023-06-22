package sub9;
/**
 * 날짜 : 2023/06/22
 * 이름 : 이현정
 * 내용 : Java 인터페이스 실습하기 
 * 
 * 인터페이스(Interface)
 * - 클래스간의 공통의 표준 규격을 위한 설계 문법
 * - 인터페이스를 활용해서 객체간 결합도를 완화하는 효과(다형성)
 * - 부수적으로 다중상속 효과 
 */

class Tv extends Computer implements Internet{

	@Override
	public void access() {
		surf();
		
	}
	public void powerOn() {
		booting();
	}
}

class Computer {
	
	public void booting() {
		System.out.println("시스템 부팅...");
	}
	public void surf() {
		System.out.println("인터넷 서핑...");
	}
}

interface Internet {
	public void access();
}




public class InterfaceTest {
	
	public static void main(String[] args) {
		
		//인터페이스 활용1 - 표준화된 클래스설계와 다형성 활용 
		Car sonata = new Sedan("소나타", "흰색", 0);
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
	
		Car bongo = new Truck("봉고", "남색", 0);
		bongo.speedUp(60);
		bongo.speedDown(20);
		bongo.show();
		
		
		//인터페이스 활용2 - 결합도 완화
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
				
		socket.switchOn();
		socket.switchOff();
		
		
		//인터페이스 활용3 - 다중 상속 효과 -> 하나의 자식에겐 둘의 부모가 없음 따라서 상속은 한 번만 일어나되, 다른 클래스는 구현을 통해 연결해야함
		
		Tv smartTv = new Tv(); //다형성 활용을 할 수 없다. 상속받는 부모1과 구현받는 부모2를 선택할 수 없음
		smartTv.powerOn();
		smartTv.access();
		
		
		
		
		
		
	}

}
