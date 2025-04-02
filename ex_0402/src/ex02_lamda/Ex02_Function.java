package ex02_lamda;

public class Ex02_Function {
	public static void main(String[] args) {
		FunctionExam fe = new FunctionExam();
		
//		fe.makeFunction(); // (x,y) -> x-y;와 같은상태
		Iminus im = fe.makeFunction();
		int res = im.sub(3,1);
		System.out.println(res);
	}
}
