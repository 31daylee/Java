package confirm.ch07;
/**
 * 날짜 : 2023/07/20
 * 이름 : 이현정
 * 내용 : 자바 총정리 연습문제_12번
 */
public class Example {
	public static void action(A a) {
		a.method1();
		if(a instanceof C c) {
			c.method2();
		}
	}
	
	
	public static void main(String[] args) {
		action(new A());
		action(new B());
		action(new C());
	}

}
