package ex01_ThreadMethod;

public class JoinMain {
	public static void main(String[] args) {
		JoinExample je = new JoinExample();
		je.start();
		
		try {
			je.join(); // main스레드는 je스레드가 끝날때까지 기다린다.
			// join()메서드를 호출한 스레드가 종료할 때까지 다른스레드들은 대기
		} catch (Exception e) {
			
		}
		
		System.out.println("main 스레드 종료");
	}
}
