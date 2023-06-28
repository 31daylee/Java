package sub3;

import java.util.ArrayList;
import java.util.List;


/**
 * 날짜 : 2023/06/28
 * 이름 : 이현정
 * 내용 : Java 리스트 실습하기
 * 
 * 리스트(List)
 * - 배열과 유사하지만 동적으로 생성되는 선형 자료구조 
 * - List 를 구현한 ArrayList
 */
public class ListTest {
	
	public static void main(String[] args) {
		
		// List 생성
		List<Integer> list = new ArrayList<>(); //List 로 선언하므로써 다형성
		
		// 데이터 입력
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list); // 모든 객체들은 Object 클래스에 상속을 받음- toString을 통해서 list 에 대한 메서드를 호출함 이 방식은 "[" + 원소 +원소2+"]" 의 형식을 지님 
		
		// 데이터 삽입
		list.add(1,6); //1번 인덱스에 6번 integer 삽입
		System.out.println(list); 
		
		// 데이터 제거 
		list.remove(2); //2번 인덱스의 원소를 제거 
		System.out.println(list);  // toString 호출 
		
		// 데이터 출력
		System.out.println("list 1번째 원소 : " + list.get(0));
		System.out.println("list 2번째 원소 : " + list.get(1));
		System.out.println("list 3번째 원소 : " + list.get(3));
		
		// 리스트 크기
		System.out.println("list 크기 : "+ list.size());
		
		
		// 리스트 반복문
		for(int num : list) {  // list 안에는 boxing 되어있는 인티저가 저장 - 그걸 int num 으로 출력(기본타입) => auto-unboxing
			System.out.println(num);
		}
		
		
		// 문자열 리스트
		List<String> people = new ArrayList<>();
		
		people.add("김유신");
		people.add("김춘추");
		people.add("장보고");
		people.add("강감찬");
		people.add("이순신");
		
		System.out.println(people);
		
		// 객체 리스트
		List<Apple> apples = new ArrayList<>();
		
		Apple a1 = new Apple("한국",3000);
		Apple a2 = new Apple("미국",2000);
		
		apples.add(a1);
		apples.add(a2);
		apples.add(new Apple("일본",1000));
		
		Apple apple = apples.get(0);
		apple.show();
		
		
		apples.get(1).show();    //연달아서 데이터 출력 : 체인 
		apples.get(2).show();    //연달아서 데이터 출력 : 체인 
		
		
	}

}
