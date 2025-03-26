package ex05_inheritance;


// 자식클래스
public class Customer extends Person {
	
	int memberId;
	
	public Customer(String name, int age, int memberId) {
		// super(); 부모 생성자의 호출
		super(name, age);
		this.memberId = memberId;
	}
	
	void enter() {
		System.out.printf("회원번호 %d (%s,%d세)님이 입장하셨습니다\n",memberId,name,age);
	}
}
