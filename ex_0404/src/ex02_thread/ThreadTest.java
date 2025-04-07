package ex02_thread;


// 스레드를 생성하는 방법
// 1. thread클래스를 상속받는다

public class ThreadTest extends Thread {
	
	@Override
	public void run() {
		// 작업할 내용
		for(int i = 0; i <10; i++) {
			System.out.println("Runnable 진행중"+i);
		}
		
	}
	
}
