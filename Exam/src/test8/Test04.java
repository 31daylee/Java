package test8;
/**
 * 날짜 : 2023/07/21
 * 이름 : 이현정
 * 내용 : 자바 총정리 연습문제
 */
public class Test04 {

	public static void main(String[] args) {
		
		int i = 5;
		char c = 'A';
		float f = 3.14f;
		double d = 31.4;
		boolean b = true;
		String s = "Hello";
		
		printArgInfo(i);
		printArgInfo(c);
		printArgInfo(f);
		printArgInfo(d);
		printArgInfo(b);
		printArgInfo(s);
	}
	
	public static void printArgInfo(Object arg) { //직접호출하므로 static 붙여주기+반환타입 없으니 void + arg매개 변수가 참조되니깐 매개변수칸에 입력 다만, 타입이 무엇인가? 생각하기-> 제네릭
		
		System.out.println("타입 : "+ arg.getClass());
		System.out.println("값 : "+ arg.toString());
	}

}
