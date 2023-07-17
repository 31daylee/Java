package test5;
/*
* 날짜 : 2023/07/17
* 이름 : 이현정
* 내용 : 자바 총정리 연습문제
* 
* 피타고라스 정리
* - 직각삼각형에서 빗변 길이의 제곱은 다른 두 변의 길이의 제곱의 합과 같다
* - a^2 + b^2 = c^2 : c가 빗변이 직각 삼각형 
* - 두 좌표평면의 길이를 구할 때 사용가능
*/
public class Test03 {

	public static void main(String[] args) {
		
		int a = 3, b=4, c = 5;
		
		boolean result = (a*a) + (b*b) == (c*c);
		System.out.println("결과 : "+ result);
		
		int x1 = 1, y1 = 1;
		int x2 = 4, y2 = 5;
		
		double distance = Math.sqrt((Math.pow((x2-x1), 2)) +
									(Math.pow((y2-y1), 2)));
									
		System.out.println("좌표평면 (1,1)과 (4,5) 사이거리 :  "+ distance);						
									
	}

}
