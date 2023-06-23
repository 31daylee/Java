package test3;
/**
 * 날짜 : 2023/06/23
 * 이름 : 이현정
 * 내용 : 인터페이스 연습문제  
 */
interface Buyer {
	public void buy();
	
}

interface Seller {
	public void sell();
	
}

class Customers implements Buyer,Seller {

	@Override
	public void sell() {
		System.out.println("판매하기");
		
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
		
	}
	
	
}


public class Test10 {

	public static void main(String[] args) {
		Buyer buyer = new Customers(); // 동시 참조가 가능한 Customer 타입으로 지정
		Seller seller = new Customers();
		
		buyer.buy();
		seller.sell();
		

	}

}
