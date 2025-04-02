package ex03_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex04_Map {
	public static void main(String[] args) {
		// 학생별 국어, 영어, 수학 점수 저장 및 평균 계산
		// 학생 이름을 입력받고, 해당 학생의 국어, 영어, 수학 점수를 입력받는다
		// 3명의 학생 정보를 입력받은 후, 각 학생의 평균 점수를 계산하여 출력하시오
		  //학생 이름: 홍길동
//	      국어 점수: 90
//	      영어 점수: 85
//	      수학 점수: 88
//
//	      학생 이름: 김영희
//	      국어 점수: 100
//	      영어 점수: 95
//	      수학 점수: 90
//
//	      학생 이름: 이철수
//	      국어 점수: 80
//	      영어 점수: 70
//	      수학 점수: 75
//
//	      학생별 평균 점수:
//	      홍길동 - 평균: 87.66666666666667
//	      김영희 - 평균: 95.0
//	      이철수 - 평균: 75.0
		
		// 컬렉션을 중첩
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("학생 이름 : ");
//		String name = sc.next();
//		
//		HashMap<String, Integer> hm = new HashMap<>();
//		
//		int kor;
//		int eng;
//		int math;
//		
//		
//		
//		
//		for(int i = 0; i<hm.size(); i++ ) {
//			System.out.println("국어 : ");
//			kor = sc.nextInt();
//			System.out.println("영어 : ");
//			eng = sc.nextInt();
//			System.out.println("수학 : ");
//			math = sc.nextInt();
//			
//			
//		}
	
		Map<String, List<Integer>> studentMap = new HashMap<>();
		
		
		System.out.println("학생 정보 :");
		
		for(int i = 0; i < 3; i++) {
			System.out.println("학생 이름 : ");
			String name = sc.next();
			
			System.out.println("국어 점수 : ");
			int kor = sc.nextInt();
			
			System.out.println("영어 점수 : ");
			int eng = sc.nextInt();
			
			System.out.println("수학 점수 : ");
			int math = sc.nextInt();
			
			List<Integer> scores = Arrays.asList(kor,eng,math);
			studentMap.put(name, scores);
			
		}
		
		// 학생별 평균
		
		System.out.println("학생별 평균 점수 : ");
		// keySet()
		// HashMap에 들어있는 모든 key를 Set으로 만들어서 반환
		for(String name : studentMap.keySet()) {
			List<Integer> scores= studentMap.get(name);
			int total = 0;
			for(int s : scores) {
				total += s;
				
			}
			double avg = total/(double)scores.size();
			System.out.println(name+"- 평균 : "+ avg);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
