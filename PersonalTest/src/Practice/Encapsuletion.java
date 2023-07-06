package Practice;

public class Encapsuletion {
	
	public static void main(String[] args) {
		
		Member a = new Member("홍길동","010-1234-5678",10);
		
		//a.name = "홍길동";
		//a.hp = "010-1234-5678";
		//a.age = 10;
		
		a.ageUp(10);
		a.ageDown(2);
		a.show();
		
	}

}
