package sub3;

public class Calc {
	
	
	// 싱글톤 객체
	private static Calc instance = new Calc(); // 1. 클래스 내에서 자기 자신을 객체로 생성 /2.  private 이므로 외부에서 참조를 못함 - 그렇다면 instance를 이용해 참조할 수 있는 다른 게터를 제공한다
	public static Calc getInstance () {
		return instance;
	}
	private Calc() {}	// 3. private 생성자 만들기 
	
	
	
	
	
	
	
	public int plus(int x, int y) {
		return x + y;
	}	
		
	public int minus(int x, int y) {
		return x - y;
	}
	public int multi(int x, int y) {
		return x * y;
	}
	public int div(int x, int y) {
		return x / y;
	}
	
}
