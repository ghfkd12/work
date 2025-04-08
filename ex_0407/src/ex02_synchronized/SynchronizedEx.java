package ex02_synchronized;

public class SynchronizedEx implements Runnable {
	
	
	private long money = 10000;
	
	// 클래스에대한 정보를 담을 수 있다.
	
	@Override
	public void run() {
		// SynchronizedEx.class : SynchronizedEx클래스 자체에대한 정보를 의미
		// SynchronizedEx클래스에 락을 걸겠다
		// 하나의 스레드가 이미 점유중이라면 다른 스레드가 사용할 수 없다.
		
		// synchronized블록
		// 필요한 부분만 선택적으로 동기화를 할 수 있어서 조금 더 성능을 최적화 할 수 있다.
		synchronized (SynchronizedEx.class) {
			for(int i = 0; i <10; i++) {
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				if(getMoney()<=0) {
					break;
				}
				outMoney(1000); // 메서드 호출
			}
		}
	}

	public long getMoney() {
		return money;
	}
	
	public void setMoney(long money) {
		this.money = money;
	}
	
	// 출금을 하는 메서드
	public void outMoney(long money) {
		// 현재 접근한 스레드의 이름을 저장(threadName에)
		String threadName = Thread.currentThread().getName();
		// 잔고가 0보다 크면
		if(getMoney()> 0) {
			this.money -= money;
			System.out.println(threadName+" - 잔액 : "+ getMoney()+"원");
			
		} else {
			System.out.println("잔액이 없습니다.");
		}
	}

}
