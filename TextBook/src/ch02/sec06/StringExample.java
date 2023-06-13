package ch02.sec06;
/**
 * 날짜 : 2023/06/13
 * 이름 : 이현정
 * 내용 : 교재 p50 예제
 */
public class StringExample {

	public static void main(String[] args) {
		
		String name = "홍길동";
		String job = "프로그래머";
		String str = "나는\"자바\"를 배웁니다.";
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(str);
		
		
		str = "번호\t이름\t직업";
		System.out.println(str);
		System.out.println("나는\n");
		System.out.println("자바를\n");
		System.out.println("배웁니다.");

	}

}
