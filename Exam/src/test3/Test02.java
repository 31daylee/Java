package test3;
/**
 * 날짜 : 2023/06/23
 * 이름 : 이현정
 * 내용 : Java 생성자 연습문제 
 */
class King {
	
	private String name;
	private int year;
	
	
	//생성자 (오버로드) -> 생성자는 void(반환타입)을 지니지 않는다 
	public King(int year) { //클래스의 이름이 들어간다 (King 자리에)
		this("정조");
		this.year =year;
	}
	
	public King(String name) {
		this.name = name;
	}
	
	public King (String name,int year) {
		this.name = name;
		this.year = year;
	}
	
	//메서드
	public void show() {
		System.out.println("name : "+ name);
		System.out.println("year : "+ year);
	}
	
}




public class Test02 {
	public static void main(String[] args) {
		
		King k1 = new King ("태조", 1392);
		King k2 = new King ("세종대왕");
		King k3 = new King (1776);
		 
		k1.show();
		k2.show();
		k3.show();
	}
}

