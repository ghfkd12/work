package ex02_thread;

public class ThreadMain {
	public static void main(String[] args) {
		
		ThreadTest t1 = new ThreadTest();
		t1.start();
		
		
		RunnableTest t2 = new RunnableTest();
		Thread t = new Thread(t2);
		t.start();
		
		for(int i = 0; i <10; i++) {
			System.out.println("메인함수 진행중"+i);
		}
		
		
	}
}
