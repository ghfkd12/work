package ex06_list;

import java.util.LinkedList;
import java.util.List;

public class Ex02_LinkedList {
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		// 요소의 추가
		list.add("Java");
		list.add("Python");
		list.add("C++");
		
		// 링크드 리스트에는 index가 없지만, 자바에서는 list인터페이스를
		// 구현하고 있기 때문에 index로 접근할 수 있도록 기능을 제공한다.
		
		// 3번째를 찾아간다.
		// Linked List의 경우 앞에서부터 노드를 따라가면서
		// 해당위치까지 이동해서 처리를 한다.
		
		// 맨 앞,뒤에 추가하기
		list.addFirst("HTML");
		list.addLast("JavaScript");
		
		System.out.println(list);
		
		// 조회
		System.out.println(list.get(0));
		
		//                  ArrayList          vs          LinkedList
		// 내부구조         배열기반(인덱스 보유)                  노드구조 기반
		// 메모리구조         연속된 공간                   노드마다 객체+포인터 연결
		// 중간 삽입/삭제       느림                              빠름
		// 인덱스에 접근        빠름                              느림
		// 전체순회            빠름                              느림
		// 성능요약          검색에 강함                      삽입/삭제에 강하다.
		//              인덱스에 접근이 많을 때              삽입/삭제가 자주 일어날 때
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
