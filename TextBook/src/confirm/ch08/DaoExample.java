package confirm.ch08;
/**
 * 날짜 : 2023/07/21
 * 이름 : 이현정
 * 내용 : 자바 총정리 _ 교재 p389 7번
 */
class OracleDao implements DataAccessObject{
	@Override
	public void insert() {
		System.out.println("Oracle DB에서 검색");
		
	}
	@Override
	public void select() {
		System.out.println("Oracle DB에 삽입");
	}
	@Override
	public void update() {
		System.out.println("Oracle DB에 수정");
	}
	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
	}
}

class MySqlDao implements DataAccessObject{
	@Override
	public void insert() {
		System.out.println("MySql DB에서 검색");
	}
	@Override
	public void select() {
		System.out.println("MySql DB에 삽입");
	}
	@Override
	public void update() {
		System.out.println("MySql DB에 수정");
	}
	@Override
	public void delete() {
		System.out.println("MySql DB에서 삭제");
	}
}



public class DaoExample {

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

}
