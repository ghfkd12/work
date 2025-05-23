package ex11_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Ex01_Stream {
	public static void main(String[] args) {
		// 스트림
		// 컬렉션(데이터들이 들어가있다)
		// 데이터들을 하나씩 처리하는 방식이다
		// 데이터를 저장한다기보다는 처리하는 기능에 집중되어있다.
		
		List<String> names = Arrays.asList("Tom","Jane","John");
		
		// 특징
		// 1. 선언형이다 : 기본적으로 컬렉션안에 들어있는 내용들에 대해 판별할때 반복문을 쓴다.
		// 				스트림을 사용하게 되면 반복문없이 데이터 처리가 가능하다.
		// 				기능은 마련이 되어있고 사용만 하면 된다.
		names.stream().forEach(System.out::println);
		
		System.out.println();
		
		// 2. 내부반복 : 개발자가 직접 반복문을 작성하지 않는다
		// 			   스트림 api가 반복을 대신 처리해준다.
		
		// 외부반복(직접 for문 작성)
		for(String name : names) {
			System.out.println(name);
		}
		
		// 내부반복(stream이 알아서 반복)
		names.stream().forEach(System.out::println);
		
		System.out.println();
		
		// 3. 불변성 : 원본 데이터는 변경되지 않는다
		names.stream()
				.filter(s -> s.length() <= 3)
				.forEach(System.out::println);
		
		System.out.println();
		
		// 4. 자연연산 : 최종 연산이 실행되기 전까지 중간 연산이 수행되지 않는다.
		
		// 스트림사용방법
		// 스트림을 생성한다
		// 배열로부터 생성하는것도 가능하다
		
		String[] fruits = {"Apple","banana","cherry"};
		
		Stream<String> fruitStream = Arrays.stream(fruits);
		fruitStream.forEach(System.out::println);
		System.out.println();
		
		// 컬렉션 객체로부터 생성하는 것도 가능하다.
		Stream<String> nameStream = names.stream();
		nameStream.forEach(System.out::println);
		
		System.out.println();
		
		// Stream.of()
		Stream<String> stream = Stream.of("A","B","C");
		stream.forEach(System.out::println);
		System.out.println();
		
		// 중간연산
		// 중간연산은 스트림을 변환하거나 필터링 하는 연산
		// 새로운 스트림을 반환하며, 지연처리가 된다.
		
		// filter(Predicate)
		// 조건에 맞는 요소만 필터링
		List<String> list = Arrays.asList("apple","banana","avocado");
		
		list.stream().filter(s -> s.startsWith("a"))
			.forEach(System.out::println);
		
		System.out.println();
		
		// map(Function)
		// 요소를 변환할 때 사용
		list.stream().map(String::toUpperCase)
			.forEach(System.out::println);
		
		System.out.println();
		
		// distinct()
		// 중복을 제거
		List<Integer> list1 = Arrays.asList(1,1,1,2,3,4,5,6,3,11,4,9,2,2,5,6,7,8,3,6,8,9,10);
		
		list1.stream().distinct().forEach(System.out::println);
		
		System.out.println();
	
		// sorted()
		// 오름차순정렬
		Stream.of("banana","apple","cherry")
			  .sorted().forEach(System.out::println);
		
		System.out.println();
		
		// sorted(Comparator)
		
		Stream.of("banana","apple","cherry")
		// 제네릭타입을 안쓰면 타입의 추론이 일어나느데
		// reversed를 사용하면 무조건 타입을 명시해야함
			  .sorted(Comparator.<String,String>comparing(t -> t).reversed())
			  .forEach(System.out::println);
		
		System.out.println();
		
		// comparing(t -> t) 항등함수
		// 항등함수 : 입력값을 그대로 반환하는 함수
		// f(x) = x;
		
		// limit()/ skip()
		// 처음부터 x개를 제한
		// 처음부터 x개를 건너 뜀
		
		Stream.of(1,2,3,4,5)
			.limit(3)
			.forEach(System.out::println);
		
		System.out.println();
		
		Stream.of(1,2,3,4,5)
		.skip(2)
		.forEach(System.out::println);
		
		System.out.println();
		
		// peek()
		// 값을 그대로 유지하면서 중간에 볼 수 있다
		Stream.of("one","two","three")
			.peek(t -> System.out.println("peek : "+t))
			.map(String::toUpperCase)
			.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
