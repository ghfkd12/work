package ex01_ThreadMethod;

public class SleepThread extends Thread{
	@Override
	public void run() {
		// 5에서 0까지 카운트다운
		System.out.println("카운트다운 5초");
		
		for(int i = 5; i >=0; i--) {
			try { // 예외처리가 반드시 필요하다.
				Thread.sleep(1000);
				System.out.println(i);
				// InterruptedException
				// 스레드가 해야할 일을 처리하지 못할 때
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("시스템 종료");
	}
}
