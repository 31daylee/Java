package confirm.ch03;
/**
 * 날짜 : 2023/07/18
 * 이름 : 이현정
 * 내용 : 교재 p107
 */
public class Test5 {

	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		
		//1
		double area1 = (lengthTop+lengthBottom)*height/2.0;
		//2
		double area2 = (lengthTop+lengthBottom)*height*1.0/2;
		//3
		double area3 = (double)(lengthTop+lengthBottom)*height/2;
		//4
		double area4 = (double)((lengthTop+lengthBottom)*height/2);
		
		System.out.println(area1);
		System.out.println(area2);
		System.out.println(area3);
		System.out.println(area4);
	}

}
