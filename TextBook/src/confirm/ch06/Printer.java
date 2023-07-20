package confirm.ch06;
/**
 * 날짜 : 2023/07/19
 * 이름 : 이현정
 * 내용 : Java 교재 p274 16번
 */

public class Printer{
	
	
	public static void println(int value) {
		System.out.println(value);
	}
	public static void println(boolean value) {
		System.out.println(value);
	}

	public static void println(double value) {
		System.out.println(value);
	}
	public static void println(String value) {
		System.out.println(value);
	}
	
	
	
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	}
	
	
}