package ex04_exam;

import java.util.Scanner;

public class MethodMain {
	private static double r;

	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		
		int[] arr = {1,2,3,4,5};
		
		mt.maxFinder(arr);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원의 넓이 : ");
		
//		MethodTest mt2 = new MethodTest();
//		
//		mt2.circleArea(r);
//		
//		double circleArea = r*r*3.14;
		
		mt.circleArea(5);
		
		System.out.println(mt.circleRound(5));
		
		mt.calculator(5,3,'+');
//		
//		while(true) {
//			System.out.println("숫자 입력 :");
//			int answer = sc.nextInt();
//			if(mt.check(answer,"test").equals("정답!")){
//				System.out.println(mt.count+"만에 정답");
//				break;
//			} else {
//				System.out.println(mt.check(answer));
//				mt.count++;
//			}
//		}
		
//		mt.check();
	}
}
