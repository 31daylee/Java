package confirm.ch08;
/**
 * 날짜 : 2023/07/21
 * 이름 : 이현정
 * 내용 : 자바 총정리 _ 교재 p389 8번
 */
public class Example {
	public static void action(A a) {
		a.method1();
		if(a instanceof C c) {
			c.method2();
		}
	}
	
	
	
	public static void main(String[] args) {
		action(new B());
		action(new C());
	}

}
