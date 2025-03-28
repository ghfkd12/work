package exam;

public class HybridWaterCar extends HybridCar {
	
	double WaterGauge;
	
	public HybridWaterCar(double gasGauge, double electricGauge, double WaterGauge) {
		super(gasGauge, electricGauge);
		this.WaterGauge = WaterGauge;

	}

	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("잔여 물량 : "+ WaterGauge);
	}
	
	
}
