package ex04_overloading;

public class RectangleCalculrator {
	// 다양한 방식으로 사각형의 넓이 구하기
	// 메서드 명 : area
	// 1. 정사각형의 한 변의 길이를 받아 넓이 반환하기
	// 2. 가로 세로 길이를 받아 직사각형의 넓이 반환하
	// 3. 실수형 가로, 세로를 받아 실수 결과 반환하기
	
	public int Area(int x) {
		System.out.println("정사각형의 넓이 :"+(x*x));
		return x*x;
	}
	
	public int Area(int x,int y) {
		System.out.println("직사각형의 넓이 :"+(x*y));
		return x*y;
	}
	
	public double Area(double x, double y) {
		System.out.println("직사각형의 넓이 :"+(x*y));
		return x*y;
	}
	
	
	
	
}
