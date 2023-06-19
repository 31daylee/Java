package sub2;
/**
 * 날짜 : 2023/06/19
 * 이름 : 이현정
 * 내용 : Java 캡슐화 실습하기
 * 
 * 
 * 캡슐화(정보은닉, Encapsulation)
 * - 캡슐화는 객체의 속성을 외부에 참조하지 못하게 객체의 정보(속성)를 은닉하는 특성
 * - 클래스의 속성은 반드시 private 선언을 통해 캡슐화
 * - private 속성의 초기화를 위해 생성자(constructor) 정의하기 
 * - 은닉된 정보의 안전한 사용을 위해서 Getter, Setter를 제공
 * 
 * 
 */
public class EncapsuleTest { //Car 클래스의 외부
	
	public static void main(String[] args) {
		
		// Car 객체 생성 초기화
		Car sonata = new Car("소나타","흰색",10); // 여기서 값을 대입해주기
		//sonata.color = "흰색"; // 속성이 지금 보이는 상태
		//sonata.name = "소나타";  private 로 변경되어 참조 불가 -> 그러면 초기화를 어떻게 하지? -> 생성자 만들기
		//sonata.speed = 10;
		sonata.setName("그랜저");
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		// Car 객체 생성 초기화
		Car avante = new Car("아반떼", "검은색", 10);
		avante.setColor("남색");
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		
		
		
		// Account 객체 생성 초기화
		Account kb = new Account ("국민은행", "123-45-6789", "이현정", 10000);
		
		kb.deposit(40000);
		kb.withdraw(30000);
		kb.show();
		
		// Account 객체 생성 초기화
		Account wr = new Account ("우리은행", "987-65-4321", "홍길동",1000);
		wr.deposit(39000);
		wr.withdraw(7000);
		wr.show();
	}

}
