package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class GenericTest {

	public static void main(String[] args) {
		
		
		Stack<Integer> st = new Stack<>();
		
//		st.push(1);
//		st.push(2);
//		st.push(3);
//		st.push(4);
//		
		
		for (int i=1; i<6; i++) {
			
			st.push(i);
		}
		System.out.println(st);
		
		
		for (int i=1; i<6; i++) {
			
			st.pop();
			System.out.println(st);
		}
		
		
		List<Integer> list = new ArrayList<>();
		
		
		
		for(int i=1; i<6; i++) {
			
			list.add(i);
		}
		System.out.println(list);
		
		
		
		
			
			list.removeAll(list);
			System.out.println(list);
		
			
			Map<Integer,String> map = new HashMap<>();
			
			
			map.put(1, "사과");
			map.put(2, "포도");
			
			
		
		
	}

}
