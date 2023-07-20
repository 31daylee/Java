package confirm.ch07;
/**
 * 날짜 : 2023/07/20
 * 이름 : 이현정
 * 내용 : 자바 총정리 연습문제_8번
 */
public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
	}
}
