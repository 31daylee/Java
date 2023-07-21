package confirm.ch08;
/**
 * 날짜 : 2023/07/21
 * 이름 : 이현정
 * 내용 : 자바 총정리 _ 교재 p389 5번
 */
public class Tv implements Remocon{
	
	@Override
	public void powerOn() {
		
	}
	
	public static void main(String[] args) {
		Remocon r = new Tv();
		r.powerOn();
	}
}
