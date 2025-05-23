package ex03_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Ex01_HashMap {
	public static void main(String[] args) {
		HashMap<Integer, Character> map = new HashMap<>();
		
		// put(K,V)
		// HashMap에 데이터 추가하기
		map.put(1,'A');
		map.put(2,'B');
		map.put(3,'C');
		map.put(4,'A'); // map에 저장되는 value는 중복될 수 있다. key는 중복될 수 없다.
		
		System.out.println(map);
		
		map.put(1, 'F'); // 같은 값을 가진 key가 있다면 value를 갱신한다.
		
		System.out.println(map);
		
		// remove(K k )
		// 데이터의 삭제
		// 조회든 삭제든 key값을 기준으로 해야한다.
		
		map.remove(3);
		
		System.out.println(map);
		
		// size()
		// 컬렉션의 크기를 반환
		System.out.println("map의 크기 : "+map.size());
		
		// get(K k)
		// 데이터의 조회
		char res = map.get(1);
		
		System.out.println(res);
		
		HashMap<String, Double> map2 = new HashMap<String, Double>();
		
		map2.put("k1",100.0);
		map2.put("k2",3.14);
		map2.put("k3",4.15);

		double result = map2.get("k2");
		
		System.out.println(result);
		
		// containskey(K k)
		// map안에 key가 존재하면 true, 없으면 false
		
		// containsvalue(V v)
		// map안에 value가 존재하면 true, 없으면 false
		
		
		// KeySet()
		// 모든 key를 Set으로 변환
		Iterator<String> iter = map2.keySet().iterator();
		
		while(iter.hasNext()) {
			// key를 하나씩 꺼내서 val에 대입한다
			String val = iter.next();
			System.out.println("key : "+val+", value : "+map2.get(val));
		}
		
		// values()  
		// 모든 value를 Collection타입으로 반환
		Iterator<Double> iter2 = map2.values().iterator();
		
		while(iter2.hasNext()) {
			double val = iter2.next();
			System.out.println("value : "+val);
		}
		
		// entrySet()
		// Key-value쌍을 하나의 Entry로 반환
		// key와 value를 동시에 다루고 싶을때 효율적 이다.

		// Set<map.Entry<k,v>>
		
		Iterator<Map.Entry<String, Double>> iter3 = map2.entrySet().iterator();
		
		// Entry
		// HashMap내부에서 key-value쌍 하나를 표현할 수 있는 객체
		while(iter3.hasNext()) {
			Entry<String,Double> entry = iter3.next();
			System.out.println("key : "+entry.getKey()+", value : "+ entry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
