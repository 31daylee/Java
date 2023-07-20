package confirm.ch06;
/**
 * 날짜 : 2023/07/19
 * 이름 : 이현정
 * 내용 : Java 교재 p274 18번
 */

public class ShopService {
	
	private static ShopService instance = new ShopService();
	
	private ShopService() {}
	public static ShopService getInstance() {
		return instance;
	}
	
	
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		}else {
			System.out.println("다른 ShopService 객체입니다.");
		}
	}

}
