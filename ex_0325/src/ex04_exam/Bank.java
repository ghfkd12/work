package ex04_exam;

import java.util.Scanner;


public class Bank {
	
	int money;
	int select;
	
	// 프로그램의 흐름
	public void bank() {
		UserInfo user = new UserInfo();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 입      금");
			System.out.println("2. 출      금");
			System.out.println("3. 잔 액 조 회");
			System.out.println("4. 종      료");
			
			System.out.printf("선택 : ");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("입 금");
				System.out.println("입금할 금액을 입력 : ");
				money = sc.nextInt();
				user.deposit(money);
				break;
			case 2:
				System.out.println("출 금");
				System.out.println("출금할 금액을 입력 : ");
				money = sc.nextInt();
				user.withdraw(money);
				break;
			case 3:
				System.out.println("잔액확인");
				System.out.println(user.showMoney()+"원");
				break;
			case 4:
				System.out.println("종료");
				return; // 함수 자체를 빠져나감
			}
			
			System.out.println("---");
			
		}
	}
}
