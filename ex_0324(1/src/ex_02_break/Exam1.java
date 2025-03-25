package ex_02_break;

import java.util.*;

public class Exam1 {
	public static void main(String[] args) {
		// 1 ~50 사이의 난수를 생성하고
		// 난수를 맞추는 프로그램 만들기
		// 적은 값이 난수보다 작으면
		// "맞춰야할 숫자가 더 큽니다."
		// 적은 값이 난수보다 크면
		// "맞춰야할 숫자가 더 작습니다."
		
		// 정답을 x번만에 맞췄습니다
		
		// 문제풀때 막막하면 경우의 수를 찾기
		// 1. 난수를 맞추는 경우 -> if
		// 2. 난수보다 큰 경우 -> if
		// 3. 난수보다 작은 경우 -> if
		
		// 반복횟수를 구하기 어려우니까 while문을 써보는게 어떨까? 고민
		
		Random r = new Random();
		int random = r.nextInt(50)+1;
		Scanner sc = new Scanner(System.in);
		
//		for(int i = 0; i <=random; i++) {
//			if(i < random) {
//				System.out.print("맞춰야할 숫자가 더 큽니다.");
//			}else if(i > random) {
//				System.out.print("맞춰야할 숫자가 더 작습니다");
//			} else ( i = random){
//			System.out.println("정답");
//		}
		
		int count = 0;
		while(true) {
			System.out.print("찾는 숫자를 입력 : ");
			int answer = sc.nextInt();
			count++;
			if(answer == random) {
				System.out.print("정답입니다");
				System.out.println(count+" 번만에 맞췄습니다.");

				System.out.println();
				break;
			} else if(answer > random) {
				System.out.print("맞춰야할 숫자가 더 작습니다");

				System.out.println();
			} else if(answer < random) {
				System.out.print("맞춰야할 숫자가 더 큽니다");

				System.out.println();
			}
		}
		
//		
//		for(int i = 0; i< 1; ) {
//			System.out.print("찾는 숫자를 입력 : ");
//			int answer = sc.nextInt();
//			count++;
//			if(answer == random) {
//				System.out.print("정답입니다");
//				System.out.println(count+" 번만에 맞췄습니다.");
//
//				System.out.println();
//				break;
//			} else if(answer > random) {
//				System.out.print("맞춰야할 숫자가 더 작습니다");
//
//				System.out.println();
//				continue;
//			} else if(answer < random) {
//				System.out.print("맞춰야할 숫자가 더 큽니다");
//
//				System.out.println();
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
