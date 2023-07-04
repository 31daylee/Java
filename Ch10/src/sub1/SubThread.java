package sub1;
/**
 * 날짜 : 2023/07/03
 * 이름 : 이현정
 * 내용 : 자바 Thread 실습하기
 */
public class SubThread extends Thread { // 메인스레드가 아닌 작업스레드로 이용하므로 Thread Class를 상속받음 

		private String name;
		
		
		public SubThread(String name) {
			this.name = name;
		}
		
		
		
		
		@Override
		public void run()	{
			
			for(int i=0; i<10; i++) {
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				System.out.println(name+ "스레드 실행...");
			}
		
			
			System.out.println(name+ "스레드 종료...");
		}
		
		

}


