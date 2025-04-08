package ex01_ThreadMethod;

public class YieldMain {
	public static void main(String[] args) { // main도 스레드이다.
		Runnable task = () -> { // Runnable로 만든것은 독자적으로 실행이 불가능하다.
			String name =Thread.currentThread().getName();
			for(int i = 0; i <=5; i++) {
				System.out.println(name+" : "+i);
				Thread.yield(); // 양보요청
			}
		};
		
		YieldExample ye = new YieldExample();
		ye.start();
		
		Thread t1 = new Thread(task,"스레드 2");
		t1.start();
		
	}
}
