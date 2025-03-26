package ex04_overloading;

public class Converter {
	// cm -> m로 변환하는 convert
	
	// m -> cm로 변환하는 convert
	// m,inch -> cm로 변환하는 convert
	// inch -> cm : inch * 2.54
	
	double cm;
	double m;
	double inch;
	
//	public void convert(double cm) {
//		if(cm == 100) {
//			cm = m;
//		} else if(m != 100) {
//			m = cm/100;
//		} else if(inch >0) {
//			inch = cm*2.54;
//		} 
//		System.out.println("변환 값 : "+cm);
//	}
	
	public double convert(double cm) {
		return cm/ 100.0;
	}
	
	public double convert(double value, String unit) {
		if(unit.equals("m")) {
			return value * 100.0;
		} else if(unit.equals("inch")) {
			return value *2.54;
		} else {
			return 0;
		}
	}
	
	
	
	
	
}
