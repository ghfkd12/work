package ex04_overloading;

public class RectangleCalculratorMain {
	public static void main(String[] args) {
		
		RectangleCalculrator rc = new RectangleCalculrator();
		
		rc.Area(3);
		rc.Area(3, 4);
		rc.Area(3.0, 4.0);
		
		
		
	}
}
