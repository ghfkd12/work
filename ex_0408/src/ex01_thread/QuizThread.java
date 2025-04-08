package ex01_thread;

import java.util.Random;
import java.util.Scanner;

// startGame()메서드를 만들고 그안에서 1~100사이의 난수 두개를 더하는 문제를 출제
// 키보드에서 답을 입력하여 5문제가 정답처리 될 때까지 로직을 반복
// 모든문제를 맞추는데 몇 초가 걸렸는지를 화면에 출력하며 프로그램을 종료하기
public class QuizThread extends Thread {	
	public synchronized void startGame() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		long timeTest = 0;
		
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < 5; i++) {
			int ran1 = r.nextInt(99)+1;
			int ran2 = r.nextInt(99)+1;
			
			int result = ran1+ran2;
			while(true) {
				try {
					System.out.printf("%d + %d = ",ran1,ran2);
					int sum = sc.nextInt();
					
					System.out.println(result + " : " + sum);
					if(sum > result) {
						System.out.println("다시");
					} else if(sum < result){
						System.out.println("다시");
					} else {
						System.out.println("정답입니다.");
						break;
					}
					Thread.sleep(1000);
					
				} catch (Exception e) {
					System.out.println("에러");
				}
			}
			System.out.println("프로그램 종료");
			long endTime = System.currentTimeMillis();
			
			timeTest = (endTime - startTime)/1000 ;
			
			System.out.printf("걸린 시간은 %d 초이다.", timeTest);
		}
	}
	
	@Override
	public synchronized void run() {
		
	}
	
	
}
