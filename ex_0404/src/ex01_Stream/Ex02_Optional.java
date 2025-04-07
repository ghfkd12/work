package ex01_Stream;

import java.util.Optional;

public class Ex02_Optional {
	public static void main(String[] args) {
		// 스트림의 최종 결과를 Optional로 반환하는 것들이 있었다.(max, min ..)
		// 제네릭 클래스로 T타입의 객체를 감싸는 Wrapper클래스이다.
		
		
		Optional<String> optStr = Optional.of("abcde");
		// optstr에 들어있는 글자 수를 반환받기
		
		Optional<Integer> optInt  = optStr.map(String::length);
		System.out.println(optStr.get());
		System.out.println(optInt.get());		
		
//		Optional.of("123").filter(x -> x.length()> 0)
//						  .map(Integer::parseInt)
//						  .get();
		
		
		int result1 = Optional.of("123").filter(x -> x.length()> 0)
										.map(Integer::parseInt)
										.get();
		
		System.out.println(result1);
		
		
	}
}
