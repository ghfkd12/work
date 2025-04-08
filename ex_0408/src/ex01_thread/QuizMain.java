package ex01_thread;

public class QuizMain {
	public static void main(String[] args) {
		QuizThread qt = new QuizThread();
//		QuizThread_T qt = new QuizThread_T();
		
		qt.start();
		qt.startGame();
	}
}
