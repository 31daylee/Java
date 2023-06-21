package sub4;
/**
 * 날짜 : 2023/06/20
 * 이름 : 이현정
 * 내용 : 싱글톤 객체와 인스턴스 객체 실습 
 * 
 * 클래스 변수, 클래스 메서드(정적변수, 정적메서드)
 * - static 을 선언한 변수, 메서드로 Method Area 에서 생성
 * - 별도의 객체생성 New를 하지 않고 클래스 타입으로 참조
 * - 객체(Instance)들 간의 공유 목적으로 클래스변수, 클래스메서드 사용
 * 
 * 싱글톤 객체(Singleton)
 * - static 을 활용한 싱글톤 객체는 오직 하나의 인스턴스로 메모리상에 존재
 * - 싱글톤 객체를 사용해서 메모리 절약과 성능 향상을 기대
 * 
 */ 
 
class Adder {
	
	//싱글톤 객체 세트(11~15라인)
	private static Adder instance = new Adder();
	public static Adder getInstance() {
		return instance;
	}
	private Adder() {} // 생성자 
	
	private Adder(int value) {
		y += value;
	}

	private int x;
	private int y;
	
	public void add(int x, int y) { // overload
		this.x += x; // heap과 관련된 Adder 메서드에 대입
		y++;   //인트 x와 인트 y가 스택에 쌓이지만 메서드 선언이 없기에(y와 관련) pop하고 끝나게 된다
		
		
	}
	public void add(int[] arr) {
		x += arr[0];  //x가 원래 1 이었음 여기에서 +20 x = x + arr[0]=10 (0번째 인덱스를 참조하는 값)
		y += arr[1];  // y는 0이었음 ???
		
	}
	public static void add(Adder a2) {  //정적변수(static) - Method Area에서 호출 ref 2에 따르면 a1이 a2로 대입된다 
		a2.x += 10;
		
	}
	
	public static Adder add(Adder a3, int value) {
		return new Adder(value); // new는 힙에 생성이 된다 / new adder의 주소가 리턴된다. 어디로? a1으로(ref3) 따라서 a1이 가르키는 인스턴스는 0ㅌ110이 아니고 0x333으로 변경이 된다 
	}
	
	public void show() {
		System.out.println("x : "+ x);
		System.out.println("y : "+ y);
	}
	
	
}


public class AdderTest {
	
	public static void main(String[] args) {
		
		//Adder a1 = new Adder(); 싱글톤 객체이므로 불가
		
		Adder a1 = Adder.getInstance();
		
		a1.add(1,2);
		a1.show();
		
		int[] arr = {10,20};
		a1.add(arr);
		a1.show();
		
		Adder.add(a1);  //ref 2
		a1.show();
		
		a1 = Adder.add(a1, 3); // ref3
		a1.show();
	}

}

