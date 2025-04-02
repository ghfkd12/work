package ex02_lamda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Ex03_Function {
	public static void main(String[] args) {
		// 컬렉션 프레임워크의 인터페이스에 일부는 함수형 인터페이스를 사용한다.
//		Arrays.asList(1,2,3).forEach(null);
		ArrayList<String> list = new ArrayList<>();
		
		list.add("이름1");
		list.add("이름2");
		list.add("이름3");
		list.add("이름4");
		list.add("이름5");
		list.add("이름6");
		
		// void accept(T t)
		// 리스트에 들어있는 요소를 하나씩 꺼내서 출력을 해라
//		list.forEach(x -> System.out.println(x));
		list.forEach(System.out::println);
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		
		hs.forEach(System.out::println);
		
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("이름 1",1);
		hm.put("이름 2",2);
		hm.put("이름 3",3);
		hm.put("이름 4",4);
		
		hm.forEach((x,y) -> System.out.println(x+y));
		
		
		
		
		
		
		
		
		
		
	}
}
