package ex01_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
	private String name;
	private int score;
	
	public Student(String name, int i) {
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}

public class Exam1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		// 짝수만 출력하기
		
		numbers.stream().filter(x -> x %2 ==0).forEach(System.out::println);
		
		
		
		// kim으로 시작하는 이름만 골라서 대문자로 변환하고\
		// 알파벳순으로 정렬하여 출력하는 코드 작성하기
//		List<String> names = Arrays.asList("kim chulsoo", "lee younghee", "park minsue", "kim younghee", "choi gildong");
//		
//		names.stream().map(null)
//					  .filter(t-> t.startsWith("kim".toUpperCase()))
//					  .sorted()
//					  .forEach(System.out::println);
//		
		
		// 짝수의 제곱값만 모아서 리스트로 반환하기
		List<String> num = Arrays.asList("1","2","3","4","5","6");
		
		List<Integer>  even_num = num.stream()
			.map(Integer::parseInt)
			.filter(n -> n % 2 ==0)
			.map(n -> n* n)
			.collect(Collectors.toList());
			
			System.out.println(even_num);
			
			
			// 점수가 가장 높은 학생의 이름 출력하기
			
		List<Student> students = Arrays.asList(
		       new Student("Alice", 85),
		       new Student("Bob", 92),
		       new Student("Charlie", 78)
		    );

//		     Optional<Student> high = Stream.of(students).max(Comparator.naturalOrder());
//		     
//		     System.out.println(high);
			
		 Stream<Student> stream = students.stream();
		     
//		 Optional<Student> opt = stream
//				 	.max(Comparator.comparing(Student::getScore)).ifPresent(t ->System.out.println(t.getName));;
//		 System.out.println(opt.get().getName());
		 
		 
		 // ifPresent
		 // Optional클래스에서 제공하는 메서드로
		 // 값이 존재할 경우에만 어떤 동작을 수행하고 싶을 때 사용하는 메서드
		 // Optional안에 값이 있으면 Consumer<T>를 실행하고
		 // 값이 없으면 아무 일도 일어나지 않는다.
		 stream
		 	.max(Comparator.comparing(Student::getScore))
		 	.ifPresent(t -> System.out.println(t.getName()));

			
		// orElse(default벨류)
		// 값이 없으면 기본값을 반환
		 // ifPresnetOrElse(value, default)
		 // 값이 있으면 value, 없으면 default
			
			
			//푸하하하하하하하ㅏ하하하하하하하하하하하하하하하하하하하하하하하하하
		 //푸하하하하하하하ㅏ하하하하하하하하하하하하하하하하하하하하하하하하하
		 //푸하하하하하하하ㅏ하하하하하하하하하하하하하하하하하하하하하하하하하
		 //푸하하하하하하하ㅏ하하하하하하하하하하하하하하하하하하하하하하하하하
		 //푸하하하하하하하ㅏ하하하하하하하하하하하하하하하하하하하하하하하하하
		 //푸하하하하하하하ㅏ하하하하하하하하하하하하하하하하하하하하하하하하하
		 //푸하하하하하하하ㅏ하하하하하하하하하하하하하하하하하하하하하하하하하
		 //푸하하하하하하하ㅏ하하하하하하하하하하하하하하하하하하하하하하하하하
		 //푸하하하하하하하ㅏ하하하하하하하하하하하하하하하하하하하하하하하하하
		 //푸하하하하하하하ㅏ하하하하하하하하하하하하하하하하하하하하하하하하하
		 //푸하하하하하하하ㅏ하하하하하하하하하하하하하하하하하하하하하하하하하
		 //푸하하하하하하하ㅏ하하하하하하하하하하하하하하하하하하하하하하하하하
		 //푸하하하하하하하ㅏ하하하하하하하하하하하하하하하하하하하하하하하하하
		 //푸하하하하하하하ㅏ하하하하하하하하하하하하하하하하하하하하하하하하하
		 //푸하하하하하하하ㅏ하하하하하하하하하하하하하하하하하하하하하하하하하
		 //푸하하하하하하하ㅏ하하하하하하하하하하하하하하하하하하하하하하하하하
		 //푸하하하하하하하ㅏ하하하하하하하하하하하하하하하하하하하하하하하하하
		 //푸하하하하하하하ㅏ하하하하하하하하하하하하하하하하하하하하하하하하하
		 //푸하하하하하하하ㅏ하하하하하하하하하하하하하하하하하하하하하하하하하
		 //푸하하하하하하하ㅏ하하하하하하하하하하하하하하하하하하하하하하하하하
		 //푸하하하하하하하ㅏ하하하하하하하하하하하하하하하하하하하하하하하하하
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}
}
