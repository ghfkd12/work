package ex01_set;

import java.util.HashSet;
import java.util.Random;

public class Ex01_set {
	public static void main(String[] args) {
		// Set은 객체의 저장순서를 저장하지 않는다.
		// 수학의 집합과 유사한 개념을 지니고 있다.
		// 중복을 허용하지 않는다.
		// index를 부여하지 않기 때문에 데이터가 입력된 순서대로 출력된다는
		// 보장이 없다.
		
		// HashSet
		// Set 인터페이스에서 가장 많이 사용되는 클래스
		
		HashSet<String> hs1 = new HashSet<>();
		
		// add(E e)
		// 데이터의 추가
		hs1.add("apple");
		hs1.add("banana");
		hs1.add("orange");
		hs1.add("apple"); // 중복된 데이터는 추가되지 않는다
		
		System.out.println(hs1); // 입력 순서대로 출력되지는 않는다.
		
		hs1.add(null); //null도 한번만 저장이 가능하다
		
		System.out.println(hs1);
		
		// HashSet이 중복되는 요소를 어떻게 체크하는가?
		// 1. hashcode()로 같은 주소를 가지고 있는지 비교
		// 2. 해시값이 같으면 equals()로 실제값을 비교
		// 둘다 같으면 삭제
		
		// remove()
		// 삭제
		hs1.remove("apple");
		
		System.out.println(hs1);
		
		// size()
		// 들어있는 요소의 개수를 반환받을 수 있다.
		System.out.println(hs1.size());
		
		// contains(Object o)
		// 요소가 포함되어 있는지 판별
		System.out.println(hs1.contains("banana"));
		
		// ArrayList와 다르게 요소를 하나만 뽑아올 수 없다.
		
		// HashSet을 언제 쓰면 좋을까
		// 1. 중복되는 데이터가 없이 뽑을 때
		// 2. 순서나 정렬이 중요하지 않을 때
		
		// HashSet객체를 이용하여 로또번호 뽑기
		
		HashSet<Integer> hs2 = new HashSet<>();
		
		// 1~45사이의 난수 6개 뽑기
//		Random r = new Random(45);
		
//		out:for(int i = 0; i <=6; i++) {
//			int ran = r.nextInt(45)+1;
//			for(int j = 0; j<i; j++) {
//				if(i == j) {
//					continue out;
//				}
//			}
//			System.out.println(ran);
//		}
		
		while(hs2.size() != 6) {
			int r = new Random().nextInt(45)+1;
			hs2.add(r);
		}
		
		System.out.println(hs2);
		
//		for(int ran : hs2) {
//			hs2.add(ran);
//		}
//		
//		System.out.println(hs2);
		
		// 인덱스가 없기 때문에 하나만 고를 수가 없다.
		
		// HashSet을 배열형태로 변환
		
//		hs2.toArray(new Integer[0]);
		
//		Object[] arr = hs2.toArray();
		// 오브젝트로 받았기 때문에 형변환이 필요하다.
		// -> 타입 안정성이 떨어진다.
		
		Integer[] arr = hs2.toArray(new Integer[0]);
		// Integer에 [0]을 쓰는 이유
		// 적절한 크기의 새 배열을 만들어서 반환을 해준다.
		
		for(Integer x : arr) {
			System.out.print(x+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
