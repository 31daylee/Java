package test4;

import java.util.ArrayList;
import java.util.List;

/**
 * 날짜 : 2023/06/30
 * 이름 : 이현정
 * 내용 : 객체 리스트 연습문제  
 */

class Member{
	String id;
	String name;
	int age;
	
	Member(String id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString(){ //객체의 정보-문자열을 출력
		return id + "," +name+","+age;

	}	
}



public class Test09 {

	public static void main(String[] args) {
		
		Member m1 = new Member("hong", "홍길동", 30);
		Member m2 = new Member("lee", "이순신", 40);
		Member m3 = new Member("kim", "김유신", 50);
		
		
		ArrayList<Member> memberList = new ArrayList<>();
		memberList.add(m1);
		memberList.add(m2);
		memberList.add(m3);
		
		for(Member m : memberList) {
			System.out.println(m);
		}
		
		
		
		

	}

}
