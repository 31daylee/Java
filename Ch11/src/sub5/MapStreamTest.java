package sub5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import sub3.Person;

/**
 * 날짜 : 2023/07/04
 * 이름 : 이현정
 * 내용 : Java 스트림 매핑 실습하기  
 * 
 * 맵 스트림
 * - 스트림 요소(컬렉션 원소)를 다른 요소로 변환 시키는 스트림
 * - map(), flatMap() 등 
 */
public class MapStreamTest {


	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();
		people.add(new Person("김유신",23));
		people.add(new Person("김춘추",21));
		people.add(new Person("장보고",33));
		people.add(new Person("강감찬",43));
		people.add(new Person("이순신",53));
		
		
		// map
		people
			.stream()
			.map(person-> person.getName())
			.forEach(name -> System.out.print(name+", "));
		
		System.err.println();
		
		
		List<String> list = Arrays.asList("1,2,3","4,5,6","7,8,9");
		System.out.println(list);
		
		
		// flatMap 하나의 원소를 여러 개의 요소로 변환하는 
		list
			.stream()
			.flatMap(str -> Arrays.stream(str.split(","))) //문자열 데이터를 개별적 데이터로 출력 
			.forEach(num -> System.out.print(num+ ", ")); //num은 숫자열이 아닌 문자열 데이터
		
		System.err.println();
		
		
		// flatMapToInt
		int result = list
						.stream()
						.flatMapToInt(str -> {
							
							String[] strArr = str.split(",");
				
							int[] nums = new int[strArr.length];
		
							for(int i=0; i<strArr.length; i++) {
								nums[i] = Integer.parseInt(strArr[i]);
							}
				
							return Arrays.stream(nums);
				
						}).sum();
		
		System.out.println("result : "+ result);
	}

}
