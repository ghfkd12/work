package ex05_enum;

public class OperationMain {
	public static void main(String[] args) {
		Operation[] ot = Operation.values();
		
		int x = 10;
		int y = 5;
		
		for(Operation res : ot) {
			System.out.println(res+" : "+ res.apply(x, y));
		}
	}
}
