package confirm.ch07;
/**
 * 날짜 : 2023/07/20
 * 이름 : 이현정
 * 내용 : 자바 총정리 연습문제_7번
 */
public class Parent {

	public String nation;
		
	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String Parent) call");
	}
	


}
