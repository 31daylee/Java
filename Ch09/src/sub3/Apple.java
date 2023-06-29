package sub3;

import java.io.Serializable;

public class Apple implements Serializable{  //사과 객체가 될 그리고 직렬화를 통해서 파일로 나갈 대상 
	
	private static final long serialVersionUID = 1L; // 클래스 이름에 Waring 이 떠서 첫 번쨰 클릭(버전아이디추가) 후 생성
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
		
	}
	
	public void show() {
		System.out.println("원산지 : "+ country);
		System.out.println("가격 : "+ price);
	}
	
}
