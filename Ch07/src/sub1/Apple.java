package sub1;
/**
 * 날짜 : 2023/06/27
 * 이름 : 이현정
 * 내용 : Java Object 클래스 실습하기
 */
public class Apple  { // 모든 클래스들은 Object 클래스를 상속받고 있음 
	
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
		
		
	}
	
	@Override
		public String toString() {
		
		System.out.println("객체 해시값 : " + hashCode());
		System.out.println("원산지 : "+ this.country);
		System.out.println("가격 : "+ this.price);
			return super.toString();
		}

}
