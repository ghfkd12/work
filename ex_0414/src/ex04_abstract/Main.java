package ex04_abstract;

// 상속의 개념에서
abstract class Animal{
	private String name;
	
	
	
	// 추상메서드
	// 자식들한테 makeSound()쓰라고 강제한다.
		abstract void makeSound();

		// 추상 클래스에 일반 메서드도 사용가능
		public void sleep() {
			System.out.println(name+"이 잠을 잔다."); 
		}

	
}

class Dog extends Animal{

	// 추상메서드는 반드시 오버라이딩 해야하는 강제성을 띈다.
	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		
	}
	
}


public class Main {
	public static void main(String[] args) {
		
		
		
	}
}
