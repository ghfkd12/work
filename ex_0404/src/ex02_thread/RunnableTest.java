package ex02_thread;

// 스레드를 생성하는 방법
// 2. Runnable인터페이스를 구현한다.
public class RunnableTest implements Runnable {
	
	@Override
	public void run() {
		// 작업할 내용
		for(int i = 0; i <10; i++) {
			System.out.println("thread 진행중"+i);
		}
		
	}
}
