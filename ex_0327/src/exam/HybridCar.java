package exam;

public class HybridCar extends Car {
	double electricGauge;
	
	public HybridCar(double gasGauge, double electricGauge) {
		super(gasGauge);
		this.electricGauge = electricGauge;
	}
	
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("잔여 전기량 "+ electricGauge);
	}
	
}
