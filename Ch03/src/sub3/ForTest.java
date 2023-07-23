package sub3;
/**
 * ��吏� : 2023/06/13
 * �대� : �댄����
 * �댁�� : Java 諛�蹂듬Ц For �ㅼ�듯��湲�
 * 
 */
public class ForTest {

	public static void main(String[] args) {
		
		//for
		for(int i=1; i<=5; i++) {
		
		System.out.println("i : "+ i);
		
		
		}
		
		//1遺��� 10源�吏��� ��
		int sum = 0;
		
		for (int k=1; k<=10; k++) {
			
			sum += k;
		
		
		} System.out.println("1遺��� 10源�吏��� ��" + sum);
		
		
		//1遺��� 10源�吏��� 吏�����
		int tot = 0;
		
		for(int k=1; k<=10; k++) {
			if(k % 2 == 0) {
				tot += k;
			}
		}
		System.out.println("1遺��� 10源�吏��� 吏�����" + tot);
		
		
		//for 以�泥�
		for(int a=1; a<=3; a++) {
			
			System.out.println("a : "+ a);
			
			for(int b=1; b<=5; b++) {
				System.out.println("b : "+ b);
				
			}
			for(int c=1; c<=7; c++) {
				System.out.println("c : " + c);
			}
		}
	
		
		//援ш뎄��
		for(int x=2; x<=9; x++) {
			 
			System.out.println(x+ "��");
			
			for(int y=1; y<=9; y++) {
				
				int z = x * y;
				System.out.printf("%d x %d = %d\n",x,y,z);
			}
		}
		//蹂��쇨���
		for(int start=1; start <=10; start++) {
			
			
			for(int end=1; end <=start; end++) {
				
				System.out.print("��");
			}
			System.out.print("\n"); // 媛���

		


	
	} }}


