package sub2;


/**
 * 날짜 : 2023/06/27
 * 이름 : 이현정
 * 내용 : Java StringBuilder 실습하기
 * 
 * String 클래스
 * - String 문자열을 처리하는 클래스
 * - 문자열 비교는 equals, 다양한 문자열 가공 메서드 제공
 * - String 클래스의 immutable 특성으로 인한 성능을 개선하기 위해 StringBuilder 사용
 */

public class StringBuilderTest {
	public static void main(String[] args) {
		
		//String immutable 특성
		//매번 새로운 객체를 생성함 -불필요한 메모리 사용
		String str = "Java";
		System.out.println("str 객체 주소 값 : " + System.identityHashCode(str));
		
		str += "Programming";
		System.out.println("str 객체 주소 값 : " + System.identityHashCode(str));
		System.out.println("str : " + str);
		
		//String의 immutable 특성을 개선한 StringBuilder
		//스트링빌더 사용 시 - 동일한 객체 주소 값을 지님 
		StringBuilder sb = new StringBuilder("Java");
		System.out.println("sb 객체 주소 값 : "+ System.identityHashCode(sb));
		
		sb.append("Programming");
		System.out.println("sb 객체 주소 값 : "+ System.identityHashCode(sb));
		
		System.out.println("sb : " + sb);
	}
}
