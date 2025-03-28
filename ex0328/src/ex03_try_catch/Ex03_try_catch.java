package ex03_try_catch;

import java.util.Scanner;

public class Ex03_try_catch {
	public static void main(String[] args) {
		// 다중 catch사용하기
		// 프로그램을 구동할 때 하나의 예외만 발생한다면 처리하기 어렵지 않다.
		// 다만 try구문 안에서 다양한 종류의 예외가 발생할 수 있다.
		// catch구문을 여러개 작성하여 예외별로 처리코드를 다르게 작성하여
		// 예외를 처리할 수 있다.
		
		Scanner sc = new Scanner(System.in);
		
		try {
			int[] cards = {4,5,1,2,8,7};
			System.out.println("몇번째 카드를 뽑겠습니까? >>");
			
			int cardIndex = sc.nextInt();
			System.out.println("뽑은 카드 번호는 : "+ cards[cardIndex]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("숫자만 입력해 주세요.");
		} catch (Exception e) {
			System.out.println("해당번호의 카드는 없습니다.");
		}
		System.out.println("프로그램 종료");
		
	}
}
