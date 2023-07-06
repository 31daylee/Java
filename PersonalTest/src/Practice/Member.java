package Practice;

public class Member {
	
	//필드
	private String name;
	private String hp;
	private int age;
	
	
	
	
	
	//생성자
	public Member(String name, String hp, int age) {
		this.name = name;
		this.hp = hp;
		this.age =age;
	}
	
	
	
	
	
	//메서드
	public void ageUp(int age) {
		this.age += age;
		
	}public void ageDown(int age) {
		this.age -= age; 
		
	}public void show() {
		System.out.println("name : "+ this.name);
		System.out.println("hp : "+ this.hp);
		System.out.println("age : "+ this.age);
	}
	
	//Getter, Setter
	
	public String getName () {
		return name;
	}public void setName(String name) {
		this.name = name;
	}
	
	public String getHp () {
		return hp;
	}public void setHp(String hp) {
		this.hp = hp;
	}
	
	public int getAge () {
		return age;
	} public void setAge(int age) {
		this.age = age;
	}
	
}
