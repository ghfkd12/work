package ex01_thread;

public class ThreadCount_T extends Thread {
	private int count;
	
	// 1. 생성자를 통해 전달한다
	public ThreadCount_T (int count) {
		this.count = count;
	}
	
//	// 2. setter를 통해 받는다
//	public void setCount(int count) {
//		this.count = count;
//	}
//	
//	// 값을 반환받고 싶으면 getter를 만든다
//	public int getCount() {
//		return count;
//	}
	
	@Override
	public void run() {
		try {
			for(int i = count; i >= 0; i-- ) {
				System.out.println(i);
			}
		} catch (Exception e) {
			
		}
		
	}
	
	public void run1() {
	
	}
	
}