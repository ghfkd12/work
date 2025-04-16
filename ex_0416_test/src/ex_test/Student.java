package ex_test;


public class Student {
	private String name;
	private int age;
	
	public String getName() {
		return name = "홍길동";
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age = 20;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printInfo(String name, int age) {
		System.out.println("학생");
	}
	
	public static void main(String[] args) {
		
		Student sd = new Student();
		
		System.out.println("이름 : "+ sd.getName()+" , " + "나이 : "+ sd.getAge());
		
		
		
	}
	
}
