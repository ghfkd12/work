package ex_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Score {
	public static void main(String[] args) {
		
		Map <String, Integer> scores = new HashMap<>();
		
		
		scores.put("Alice", 85);
		scores.put("Bob", 72);
		scores.put("Charlie", 90);
		
		scores.entrySet().stream().filter(x -> x.getValue() >= 80).forEach(System.out::println);
		
//		for(Map.Entry<String, Integer> entry : scores.entrySet()) {
//			if(entry.getValue() >= 80) {
//				System.out.println(entry.getKey()+" : "+ entry.getValue());
//			}
//		}
			
		
		
		
		
		   
	}
}
