package confirm.ch06;

class AccountTest{
	
	private static final AccountTest instance = new AccountTest();
	
	private  AccountTest() {}
	
	public static AccountTest getInstance() {
		return instance;
	}
	
	
	private int balance;
	
	public void setBalance(int balance) {
		if(balance >= 0 && balance <=1000000) {
			this.balance = balance;
		}
	
	}
	public int getBalance() {
		return balance;
	}
	
	
	
}

public class Account {
	
	public static void main(String[] args) {
		AccountTest accountTest = AccountTest.getInstance();
		
		accountTest.setBalance(10000);
		System.out.println("현재 잔고 : "+ accountTest.getBalance());
		
		accountTest.setBalance(-100);
		System.out.println("현재 잔고 : "+ accountTest.getBalance());
		
		accountTest.setBalance(2000000);
		System.out.println("현재 잔고 : "+ accountTest.getBalance());
		
		accountTest.setBalance(300000);
		System.out.println("현재 잔고 : "+ accountTest.getBalance());
	}
	
}
