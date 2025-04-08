package ex01_thread;

public class ThreadCount implements Runnable {

	@Override
	public void run() {
		for(int i = num; i <= 0; i--) {
			try {
				ThreadCount tc = new ThreadCount();
				System.out.println();
			} catch (Exception e) {

			}
		}
		
	}
}
