package test3;
/**
 * 날짜 : 2023/06/23
 * 이름 : 이현정
 * 내용 : 정적변수 연습문제 
 * 
 */
class Student {
	public static int studentId; //studentId의 속성을 보기위해서는 어디서 참조가 되고 있는지 찾아보는게 먼저다 (1)와 (2)참고
	private String studentName;
	private String major;
	private int grage;
	
	
	public Student(String studentName, String major, int grade) {
		this.studentId++; //증감식을 가진다-> 타입이 int... (1)
		this.studentName = studentName;
		this.major = major;
		this.grage = grade;
	}
	
	public void studentInfo() {
		System.out.println("============");
		System.out.println("학번 : "+ studentId);
		System.out.println("이름 : "+ studentName);
		System.out.println("전공 : "+ major);
		System.out.println("학년 : "+ grage);
		System.out.println("-------------");
	}
}


public class Test04 {

	public static void main(String[] args) {
		
		Student.studentId = 20201000; //Student가 studentId로 직접참조 -> static 이다... (2)
		
		Student kim = new Student("김유신", "국문과", 1);
		kim.studentInfo();
		
		Student lee = new Student("이순신", "경제학과", 1);
		lee.studentInfo();
		
		Student lim = new Student("임꺽정", "경영학과", 1);
		lim.studentInfo();
				

	}

}
