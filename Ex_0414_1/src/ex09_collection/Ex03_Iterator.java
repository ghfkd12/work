package ex09_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ex03_Iterator {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,32,32,3,4));
		
		Iterator<Integer> iter = list.iterator();
		
//		while(iter.hasNext()) {
//			int value = iter.next();
//			System.out.println(value+" ");
//		}
		
		// Iterator가 리스트 원본의 주소를 참조한다.
		// next()메서드를 호출하면, 참조한 주소로 가서 요소를 직접 읽어온다.
		
		// 한번 사용한 Iterator객체는 재사용 불가능
		// 순회를 하고나면 hasNext()가 가리키는게 리스트의 끝이기 때문에
		// false를 반환하므로 재사용이 불가능하다.
		
		// remove()
		// 현재 Iterator가 가리키고있는 요소를 원본 리스트에서 제거한다.
		
		while(iter.hasNext()) {
			int value = iter.next();
			if(value % 2 == 0) {
				iter.remove(); // 원본에서도 제거된다.
			}
		}
		
		System.out.println(list);
		
		// Set은 index가 없기 때문에 하나씩 꺼내는것이 불가능하다.
		// Iterator를 이용하면 꺼낼 수 있다.
		
		Set<Integer> hs = new HashSet<>();
		
		hs.add(1);
		hs.add(3);
		hs.add(2);
		hs.add(4);
		hs.add(5);
		
		Iterator<Integer> hsIter = hs.iterator();
		
		while(hsIter.hasNext()) {
			int value = hsIter.next();
			System.out.println(value+" ");
		}
		System.out.println();
		// 개선된 for문을 쓰던가 Iterator를 쓰던가 편한걸로 쓰자
		
		for(Integer value : hs) {
			System.out.println(value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
