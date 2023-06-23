package test3;
/**
 * 날짜 : 2023/06/23
 * 이름 : 이현정
 * 내용 : 싱글톤 객체 연습문제 (다시 풀어보기)
 * 
 */

class Vehicle {
	//필드
	private String name;
	private int price;
	
	//생성자
	public Vehicle(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	//메서드
	public void info() {
		System.out.println("===========");
		System.out.println("차량명 : "+ name);
		System.out.println("가격 : "+ price);
		System.out.println("-------------");
	}
}

//싱글톤
class CarFactory {
	private static CarFactory instance = new CarFactory(); //CarFactory안에서 자기자신을 생성함 
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		return instance;
	}
	public Vehicle createCar(String name, int price) {   //= Vehicle v = new Vehicle (name,price);
		return new Vehicle(name, price);				//= return v;
	}
}




public class Test05 {

	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance(); // new CarFactory();가 불가능한 이유는 카펙토리는 싱글톤이기때문에 
		Vehicle avante = factory.createCar("아반떼", 2500);
		Vehicle sonata = factory.createCar("소나타", 3000);
		
		avante.info();
		sonata.info();
	}

}
