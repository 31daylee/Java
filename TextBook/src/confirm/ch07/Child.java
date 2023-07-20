package confirm.ch07;
/**
 * 날짜 : 2023/07/20
 * 이름 : 이현정
 * 내용 : 자바 총정리 연습문제_7번
 */
public class Child extends Parent{

	public String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
		
	
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
