package ex01_Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exam2 {
	public static void main(String[] args) {
//		당신은 학교 성적 분석 시스템을 개발하고 있다.
//		주어진 학생 성적 데이터를 기반으로, 각 학생의 평균 점수를 계산한 후,
//		가장 평균 점수가 높은 학생의 이름과 평균 점수를 출력하는 프로그램을 작성하라.
//
//		🧾 데이터 설명
//		각 데이터는 "이름:과목:점수" 형식의 문자열로 주어진다.
//		예: "Alice:Math:85"는 Alice라는 학생이 Math 과목에서 85점을 받았다는 뜻이다.
//
//		📋 요구 사항
//		학생 정보를 관리하는 Student 클래스를 설계하라.
//
//		이름(name), 총점(totalScore), 과목 수(subjectCount)를 필드로 가진다.
//
//		점수를 추가하는 addScore(int score) 메서드를 정의하라.
//
//		평균을 반환하는 getAverage() 메서드를 정의하라.
//
//		이름을 반환하는 getName() 메서드를 정의하라.
//
//		주어진 성적 리스트를 활용하여, 이름별로 Student 객체를 생성하고 점수를 누적하라.
//
//		모든 학생 중에서 평균 점수가 가장 높은 학생의 이름과 평균 점수를 출력하라.
//
//		평균 점수는 소수점 한 자리 이상 나오도록 출력해도 무방하다.
		
		List<String> scores = Arrays.asList(
			    "Alice:Math:85", "Alice:English:78",
			    "Bob:Math:90", "Bob:English:92", "Bob:Science:88",
			    "Charlie:Math:70", "Charlie:English:60"
			);	
	
		
		
//		Map<String, Integer> asd = new HashMap<String, Integer>();
//		
//		for(String qwe : scores) {
//			String[] part = qwe.split(":");
//			
//			String name = part[0];
//			
//			asd.put(name, asd.getOrDefault(name, null))
//			
//		}
		
//		Map<List<String>,Integer> sudt = new HashMap<List<String>,Integer>();
//		
//		for(String qwe : scores) {
//			String[] part = qwe.split(":");
//			
//			String name = part[0];
//			String subject = part[1];
//			
//			List<String> asd = Arrays.asList(name,subject);
//			
//			sudt.put(asd, sudt.getOrDefault(asd, 0)+1);
//			
//		}
		
		Map<String, Student> studentMap = new HashMap<>();
		
		for(String record : scores) {
			String[] parts = record.split(":");
			String name = parts[0];
			int score = Integer.parseInt(parts[2]);
			
			// Student객체가 필요하다.
			// 값이 없을때만 넣어라(이미 키가 있다면 무시)
			studentMap.putIfAbsent(name, new Student(name));
			
			// name을 통해서 얻어온 Student객체를 통해 addScore메서드를 호출하고
			// 점수를 전달
			studentMap.get(name).addScore(score);
		}
		
		Student topStudent = null;
		double highAvg = 0;
		
		for(Student student : studentMap.values()) {
			double avg = student.getAverage();
			if(avg > highAvg) {
				highAvg = avg;
				topStudent = student;
			}
		}
		
		if(topStudent != null) {
			System.out.println(topStudent.getName()+"->"+highAvg);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
