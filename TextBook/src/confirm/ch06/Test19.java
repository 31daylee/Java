package confirm.ch06;
//Account 답안 코드_강사님 버전 

	class Account1 {
		
		private int balance;
		
		public int getBalance() {
			return balance;
		}
		
		public void setBalance(int balance) {
			
			if(balance >= 0 && balance <= 1000000) {
				this.balance = balance;
			}
			
		}
	}

	public class Test19 {
		public static void main(String[] args) {
			// 19번
			Account1 account = new Account1();
			
			account.setBalance(10000);
			System.out.println("현재잔고 : " + account.getBalance());
			
			account.setBalance(-100);
			System.out.println("현재잔고 : " + account.getBalance());
			
			account.setBalance(2000000);
			System.out.println("현재잔고 : " + account.getBalance());
			
			account.setBalance(300000);
			System.out.println("현재잔고 : " + account.getBalance());
			
		}
	
	}
