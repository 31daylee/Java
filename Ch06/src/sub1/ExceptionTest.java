package sub1;
/**
 * 날짜 : 2023/06/26
 * 이름 : 이현정
 * 내용 : Java 예외처리 실습하기  
 * 
 * 예외처리(Exception)
 * 	- 예외는 프로그램 실행 중에 발생하는 모든 에러(Error) 
 *	- 실행 중(Runtime) 발생하는 예외와 컴파일(ComplieTime)에 발생하는 예외처리
 * 	- 메서드 내부에 발생하는 예외를 호출한 쪽으로 throws 
 *  - 사용자가 생성한 예외를 throw  
 */ 
 
public class ExceptionTest {

	public static void main(String[] args) {
		
		//////////////////////////////
		//실행 예외
		/////////////////////////////
		
		//예외상황1 : 어떤 수를 0으로 나눌때 
		int num1 = 1;
		int num2 = 2;
		
		int rs1 = num1 + num2;
		int rs2 = num1 - num2;
		int rs3 = num1 * num2;
		//int rs4 = num1 / num2; //0이 되는 순간 예외가 발생함 -> try catch
		int rs4 = 0; //sys의 scope는 메인블록 내에서 선언이 있어야 실행가능하다
		
		try {
			//예외가 발생할 가능성이 있는 코드 작성
			rs4 = num1 / num2;
			
		}catch(ArithmeticException e) {
			//예외가 발생했을 때 처리할 코드 작성
			e.printStackTrace(); //예외 내용 출력
		
		}
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
		System.out.println("rs4 : " + rs4); //try 구문에 int rs4가 선언이 되었으면 출력이 불가능하다(try구문에서 끝났기때문)
		
		//예외상황2 : 배열의 인덱스 범위를 벗어났을 때 
		
		int[] arr = {1, 2, 3, 4, 5};
		
		try {

			for(int i =0; i<6; i++) { //만약에 i <6~ 인 경우에 예외처리가 발생함 (예외가 발생하는 조건식을 넣어줘야 예외발생처리문이 나타난다)
				System.out.println("arr["+i+"] : " + arr[i]);
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
		//for(int i =0; i<5; i++) { //만약에 i <6~ 인 경우에 예외처리가 발생함 -> try ~ catch 문으로 이동 
			//System.out.println("arr["+i+"] : " + arr[i]);
		//}
		
		
		//예외상황3 : 객체 생성없이 참조(NullPointerException)
		Animal ani = null; //객체 참조하지 않고 참조변수만 선언해둔 상태 
		
		try {
			ani.move();
			ani.hunt();
			
		}catch (NullPointerException e) {
			
			e.printStackTrace();
		}
		//ani.move();
		//ani.hunt(); //실행불가-예외) ani 는 스택에 생성되는 변수. 참조변수는 어떠한 값(참조값=메모리주소)을 지니고 있어야함 하지만, ani는 객체없는 null값을 지님
		
	
		
		//예외상황4: (ClassCastException)
		Animal a1 = new Tiger(); //업캐스팅
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		
		try {
			
			Eagle eagle = (Eagle) a1; //다운캐스팅 a1은 타이거이기에 예외발생 
			Shark shark = (Shark) a2;
			Tiger tiger = (Tiger) a2;
			
		}catch(ClassCastException e) {
			e.printStackTrace();
		}
//		Eagle eagle = (Eagle) a1; //다운캐스팅 a1은 타이거이기에 예외발생 
//		Shark shark = (Shark) a2;
//		Tiger tiger = (Tiger) a2;
		
		

		
		///////////////////////////////////////
		//일반 예외
		///////////////////////////////////////
		
		
		try {
			Class animal = Class.forName("sub1.Lion");
		} catch (ClassNotFoundException e) {
			// 찾을 수 없는 클래스 선언 
			e.printStackTrace();
		} finally {
			System.gc(); //Garbage Collector 메모리 정리
			System.out.println("finally 실행...");

		System.out.println("프로그램 정상 종료... ");
		}
	}

}
