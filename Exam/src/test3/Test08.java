package test3;
/**
 * 날짜 : 2023/06/23
 * 이름 : 이현정
 * 내용 : 다형성 연습문제  
 */

class Product {
	
	protected String category;
	protected int price;
	
	public Product (String category, int price) {
		this.category = category;
		this.price = price;
	}
	public void info() {}
}

class Television extends Product {
	
	public Television(String category, int price) {
		super(category, price);
	}
	
	@Override  // info라는 메서드는 부모메서드로 부터 재정의를 한 것 
	public void info() {
		System.out.println("제품분류 : " + category);
		System.out.println("제품가격 : " + price);
	}
}

class Computer extends Television {
	
	public Computer(String category, int price) {
		super(category,price);
	}
	
	@Override
	public void info() {
		System.out.println("제품분류 : " + category);
		System.out.println("제품가격 : " + price);
	}
}



public class Test08 {

	public static void main(String[] args) {
		
		Television p1 = new Television("가전", 100);
		Computer p2 = new Computer("컴퓨터", 150);
		
		p1.info();
		p2.info();

	}

}
