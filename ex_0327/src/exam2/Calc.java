package exam2;

public class Calc extends Calculator {
	
	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		int sum = 0;
		for(int x : a) {
			sum += x;
		}
		double avg = (double)sum/a.length;
		return avg;
	}
}

