package exam;

public class Car {
	double gasGauge;
	
	public Car(double gasGauge) {
		this.gasGauge = gasGauge;
	}
	
	public void showCurrentGauge() {
		System.out.println("가스잔여량 " + gasGauge );
	}
}
