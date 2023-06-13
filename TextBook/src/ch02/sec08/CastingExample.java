package ch02.sec08;
/**
 * 날짜 : 2023/06/13
 * 이름 : 이현정
 * 내용 : 교재 p58 예제
 */
public class CastingExample {

	public static void main(String[] args) {
		int var1 = 10;
		byte var2 = (byte) var1; // var1 은 int 타입. int 타입은 byte타입보다 크기에 강제변환이 필요
		System.out.println(var2);
		
		long var3 = 300;
		int var4 = (int)var3;
		System.out.println(var4);
		
		int var5 = 65;
		char var6 = (char)var5;
		System.out.println(var6);
		
		double var7 = 3.14;
		int var8 = (int)var7;
		System.out.println(var8);
	}

}
