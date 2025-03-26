package ex04_overloading;

import java.util.Scanner;

public class BreadMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Bread b = new Bread();
		
		
		b.makeBread();
		b.makeBread(6);
		b.makeBread("크림빵", 1);
		
		


	}
}
