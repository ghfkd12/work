package ex03_Polymorphism;

public class ComputerRoom {
	
//	String name; // -> 참조자료형, 출력시 기본값 null
//	Samsung com1; // 참조자료형
//	Samsung com2;
	
//	LG com1;
//	LG com2;
	
	Computer com1;
	Computer com2;
	
	public void allPowerOn() {
		com1.powerOn();
		com2.powerOn();
	}
	
	public void allPowerOff() {
		com1.poweOff();
		com2.poweOff();
	}
	
}
