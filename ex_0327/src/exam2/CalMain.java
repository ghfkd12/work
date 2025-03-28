package exam2;

public class CalMain {
	public static void main(String[] args) {
		Calc c = new Calc();
		
		int[] a = {1,2,3,4,5};
		
		System.out.println("합 메서드 : "+c.add(10, 5));
		System.out.println("차 메서드 : "+c.substract(10, 5));
		System.out.println("평균 메서드 : "+ c.average(a));
		
	}
}
