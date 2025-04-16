package ex09_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01_ArrayList {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		
		arr[1] = 10;
		
		System.out.println(Arrays.toString(arr));
		
		// asList의 반환형이 List기때문에 ArrayList를 쓰지못한다.
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			list.add(i+1);
		}
		System.out.println(list);
		
		list.add(1,10);
		
		// ArrayList에선 1번자리에 10이 끼어들고
		// 나머지가 인덱스가 한칸씩 밀린다.
		System.out.println(list);
		
		ArrayList<Person> p_list = new ArrayList<>();
		
		Person p = new Person();
		
		p_list.add(p);
		
		System.out.println(p); // Person객체의 주소
		System.out.println(p_list.get(0)); // list의 첫번째 요소의 주소
		
		// p객체에 내용 세팅하기
		
		p_list.get(0).setAge(30);
		p_list.get(0).setName("홍길동");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 	}
}
