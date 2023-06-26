package sub3;
/**
 * 날짜 : 2023/06/26
 * 이름 : 이현정
 * 내용 : Java 예외 발생 시키기 실습하기  
 */ 



//사용자 정의 예외클래스
class MinusException extends Exception{
	
	public MinusException(String msg) {
		super(msg);
		
	}
}

class OverException extends Exception {
	
	public OverException(String msg) {
		super(msg);
	}
}

class Score {
	public void check(int score) throws MinusException, OverException { //체크는 마이너스예외가 발생할 수 있는 Minus 와 Over 같은 부모를 상속받고 있기에 Exception으롤 통합가능
		
		if(score < 0) {
			//예외 발생 시키기
			throw new MinusException("점수는 음수가 될 수 없습니다.");
		}else if (score > 100) {
			//예외 발생 시키기 
			throw new OverException("점수는 100점을 초과할 수 없습니다.");
			
		} else {
			System.out.println("점수가 정상입니다.");
		}
		
	}
}
public class ThrowTest {

	public static void main(String[] args) {
		
		
		Score score = new Score();
		
		try {
	
			score.check(-3);  //minusException
			score.check(102); //overException
			score.check(96);
		} catch (MinusException e) {
			e.printStackTrace();
		}catch (OverException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료...");
		
	}

}
