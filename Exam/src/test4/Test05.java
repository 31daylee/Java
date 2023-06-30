package test4;
/**
 * 날짜 : 2023/06/30
 * 이름 : 이현정
 * 내용 : String, Wrapper 클래스 연습문제 
 */
public class Test05 {

	public static void main(String[] args) {
		
		
		String strCsv = "60,72,82,86,92";
		String [] scores = strCsv.split(","); //문자열을 배열로 만드는 split();
		
		int total = 0;
		
		for(int i=0; i<scores.length; i++) {
			
			total += Integer.parseInt(scores[i]); //배열의 인덱스를 활용해(현재 문자열) total 은 int 이므로 문자열에서 정수변환이 필요 > Integer.parseInt(); 사용하기 
			
		}
		System.out.println("총점 : " + total);
	}
	

}
