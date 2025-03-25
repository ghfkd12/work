package ex01_multi_array;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		
		// 배열 arr의 총합과 평균을 구하시오
		// 총합 : 
		// 평균 : 
		
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				sum += arr[i][j];
				avg = sum/20.0;
			}
		}
			
		System.out.println("총합 : "+ sum);
		System.out.println("평균 : "+ avg);
		
		System.out.println("---");
		
		// 학생들의 정보를 입력하고, 출력하는 프로그램 작성하기
		// 학생들의 수학과 영어 성적을 등록하는 프로그램입니다.
		// 1. 프로그램을 실행하면 몇 몇의 정보를 저장할 것인지 입력받는다.
		// 2. 입력받은 수 만큼 학생들의 이름, 수학, 영어 성적을
		// 입력받는 프로그램 작성하기
		
		// 예시
		// 등록할 인원 수 : 2
		// 이름 : 홍길동
		// 수학 : 456
		// 영어 : 123
		//--------
		// 이름 :ㅁㄴㅇㅁㄴㅇ
		// 수학 :ㅣ ㅁㄴㅇㅁㄴㅇ
		// 영어 : ㅁㄴㅇㅁㄴㅇ
		//-----
		// 2명등록완료
		// 홍길동 456 123
		// ㅁㄴㅇㅁㄴㅇ ㅁㄴㅇㅁㄴㅇ ㅁㄴㅇㅁㄴㅇ
		
		Scanner sc = new Scanner(System.in);
//		
//		int[][] asd  = new int[0][3];
//		
//		int count = 0;
////		{{이름, 수학, 영어},{이름, 수학, 영어},{이름, 수학, 영어}}
//		System.out.println("등록할 인원수 : ");
//		count = sc.nextInt();
//		
//		for(int i = 0; i < asd.length; i++) {
//			int name = asd[0][0];
//			System.out.println("이름 : ");
//			name = sc.nextInt();
//			for(int j = 0; j <asd.length; j++ ) {
//				int math = asd[0][1];
//				math = sc.nextInt();
//				System.out.printf("수학 : %d\n",asd[i]);
//				System.out.printf("영어 : %d\n",asd[j]);
//			}
//			
//		}
//		
//		
//		int eng = sc.nextInt();
//		
		System.out.println("등록할 인원 수 : ");
		
		int x = sc.nextInt();
		
		String[][] stdInfo = new String[x][3];
		
		for(int i = 0; i < stdInfo.length; i++) {
			System.out.print("이름 : ");
			stdInfo[i][0] = sc.next();
			System.out.print("수학 : ");
			stdInfo[i][1] = sc.next();
			System.out.print("영어 : ");
			stdInfo[i][2] = sc.next();
			System.out.println("------");
		}
		for (int i  = 0; i< stdInfo.length; i++) {
			for(int j = 0; j < stdInfo[i].length; j++) {
				System.out.print(stdInfo[i][j]+" ");
			}
		}
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
