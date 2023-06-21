package sub5;
/**
 * 날짜 : 2023/06/21
 * 이름 : 이현정
 * 내용 : Java 클래스 상속 실습하기 
 */
public class Sedan extends Car{
	
	
	private int cc;
	
	
	//생성자
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed); // 부모클래스 초기화
		this.cc = cc; //자식클래스 초기화
	}
	
	public void speedTurbo() {
		//private에서 protected로 접근 권한 변경해서 자식클래스 참조 
		this.speed += 20; //speed 는 부모의 기능 - 부모님의 speed는 private이므로 외부에서 참조불가 => protected 접근 제한자로 변경하기 
	}
	public void show() {
		super.show(); //부모클래스의 show()를 실행하는 
		System.out.println("배기량 : "+ this.cc);
	}
	

}
