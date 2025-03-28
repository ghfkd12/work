package ex03_Polymorphism;

public class ComMain {
	public static void main(String[] args) {
		ComputerRoom cr = new ComputerRoom();
		
//		cr.com1 // = Samsung com1 = new Samsung();
		
		// Computer com1 = new Samsung
		cr.com1 = new Samsung();
		// Computer com2 = new LG
//		cr.com2 = new LG();
		cr.com2 = new Apple();
		
		cr.allPowerOn();
		cr.allPowerOff();
	}
}
