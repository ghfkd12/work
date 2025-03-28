package ex01_innerClass;

interface buttonClickListner{
	public void click();
}

public class AnonymousExample {
	
	public class Button{
		private buttonClickListner listner;
		
		
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
		AnonymousExample exam = new AnonymousExample();
		
		AnonymousExample.Button button = exam.new Button();
		
		button.setListner(new buttonClickListner() {
			
			public void click() {
				System.out.println("버튼 클릭됨");
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
