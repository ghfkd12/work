package ex01_thread;

class AddStackThread extends Thread{
	private Storage storage;
	
	public AddStackThread(Storage storage) {
		this.storage = storage;
	}
	
	@Override // 스레드를 돌리면서 하고싶은일은 run()메서드를 오버라이딩 해야한다.
	public void run() {
		// 짐을 10개씩 쌓을예정
		try {
			while(true) {
				Thread.sleep(1000);
				if(this.storage.getStackCount() == 0) {
					System.out.println("짐 10개 추가");
					this.storage.addStack(10); // 짐 10개 추가
				}
			}
		} catch (Exception e) {

		}
	}
} // AddStackThread

class PopStackThread extends Thread{
	private Storage storage;
	
	public PopStackThread(Storage storage) {
		this.storage = storage;
	}
	
	@Override
	public void run() {
		// 짐을 5개씩 나를 예정
		try {
			while(true) {
				Thread.sleep(1000);
				System.out.println("짐 5개 나르기");
				this.storage.popStack(5);
			}
		} catch (Exception e) {

		}
	}
}




public class ThreadWaitExample {
	public static void main(String[] args) {
		Storage s = new Storage();
		AddStackThread add = new AddStackThread(s);
		PopStackThread pop = new PopStackThread(s);
		
		add.start();
		pop.start();
		
	}
}






























