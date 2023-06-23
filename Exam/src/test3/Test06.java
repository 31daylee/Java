package test3;
/**
 * 날짜 : 2023/06/23
 * 이름 : 이현정
 * 내용 : Java 클래스 상속 연습문제  
 */

class Rent{
	public void payment() {
		System.out.println("임대료를 받습니다.");
	}
}

class Landload extends Rent {
	
	public void getMoney() {
		System.out.println("건물주 입니다.");
		payment(); //임대료를 받습니다란 출력값에 대한 실행문 
	}
}


public class Test06 {

	public static void main(String[] args) {
		Landload master = new Landload();
		master.getMoney();
				

	}

}
