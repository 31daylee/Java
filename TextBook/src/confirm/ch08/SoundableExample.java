package confirm.ch08;
/**
 * 날짜 : 2023/07/21
 * 이름 : 이현정
 * 내용 : 자바 총정리 _ 교재 p389 6번
 */
class Cat implements Soundable{

	@Override
	public String sound() {
		return "야옹";
	}
	
}

class Dog implements Soundable{

	@Override
	public String sound() {
		return "멍멍";
	}
	
}



public class SoundableExample {
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}

}
