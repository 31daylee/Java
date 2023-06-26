package sub1;

public class Animal {
	
	public void move() {
		System.out.println("Animal move ...");
	}
	
	//오버라이드를 위한 메서드 선언 
	public void hunt() { // hunt의 메서드는 하위 클래스만 지니기에 Animal 상위 클래스에서도 선언이 필요함 
		
	}
}
