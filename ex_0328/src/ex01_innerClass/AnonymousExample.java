package ex01_innerClass;

// 인터페이스를 생성
interface buttonClickListner{
	// 추상메서드 생성
	public void click();
}

public class AnonymousExample {
	
	// 내부클래스
	public class Button{
		// buttonClickListener 타입의 변수를 가진다
		// 인터페이스의 구현체는 다 들어올 수 있다.
		private buttonClickListner listner;
		
		// 멤버변수(필드)는 보통 private로 지정하는 일이 많기 때문에 직접 접근하는것이 불가능하다.
		// public으로 된 메서드를 통해서 접근을 하는일이 많다.
		// setter & getter 
		
		public void setListner(buttonClickListner listner) {
			this.listner = listner;
		}
		
		public void click() {
			if(listner != null) {
				this.listner.click();
			}
		}
	}
	// ctrl +shift+ p 
	// 반대편 중괄호로 이동
	
	
	
	public static void main(String[] args) {
		// 외부 클래스의 객체
		AnonymousExample exam = new AnonymousExample();
		
		// 내부클래스의 객체(외부 클래스의 객체로부터 생성)
		AnonymousExample.Button button = exam.new Button();
		
		button.setListner(new buttonClickListner() {
			
			public void click() {
				System.out.println("버튼 클릭됨");
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
