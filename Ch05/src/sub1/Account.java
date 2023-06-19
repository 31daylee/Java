package sub1;
/**
 * 날짜 : 2023/06/19
 * 이름 : 이현정
 * 내용 : Java 클래스 실습하기
 */

public class Account {
	
	// 속성
	String bank;
	String id;
	String name;
	int balance;  // 전역변수
	
	
	
	
	
	
	// 기능
	public void deposit(int money) {
		this.balance += money; // 동일한 클래스(Account 클래스)에 있는 밸런스를 참조해라 
	}
	public void withdraw(int money) {
		this.balance -= money;
		
	}
	public void show() {
		System.out.println(" ---------------- ");
		System.out.println("은행명 : "+ this.bank);
		System.out.println("계좌번호 : "+ this.id);
		System.out.println("입금주 : "+ this.name);
		System.out.println("현재잔액 : "+ this.balance);
		System.out.println(" ---------------- ");
		
		

				
	}

}
