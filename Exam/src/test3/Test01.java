package test3;
/**
 * 날짜 : 2023/06/23
 * 이름 : 이현정
 * 내용 : Java 클래스 연습문제 
 * 
 */

public class Test01 {
	//필드
	private String name; 
	private int age;
	
	//생성자 
	public Test01 (String name, int age) {
		this.name = name;
		this.age = age;
	}
	//메서드
	public void show() {
		System.out.println("=============");
		System.out.println("이름 : "+ this.name);
		System.out.println("나이 : "+ this.age );
		System.out.println("-------------");
	}
	
	
	
	//메인실행문
	public static void main(String[] args) {
		
		Test01 kim = new Test01("김유신", 23); //클래스 이름이 들어감 
		Test01 lee = new Test01("이순신", 31);
		
		
		kim.show();
		lee.show();
	}

}
