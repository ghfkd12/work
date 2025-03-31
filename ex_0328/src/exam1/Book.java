package exam1;

import java.util.Scanner;

public class Book extends Exception {
	String title;
	String writer;
	
	public Book (String title, String writer) {
		this.title = title;
		this.writer = writer;
	}
	
	@Override
	public String toString() {
		
		return "책 제목: "+this.title+"저자 :"+this.writer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Book b = new Book("자바의 정석","남궁성");
		
		System.out.println(b);
		
		
		
	}
}
