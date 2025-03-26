package ex01_setter_getter;

public class PersonMain {
	public static void main(String[] args) {
		Person p = new Person();
		// 필드를 private로 선언하면 외부에서 직접 사용할 수 없다.
//		p.age = -30; // 코드상 문제가 없다.
		
		// setter메서드를 통해서 필드에 값을 세팅해야한다.
		p.setAge(30);
		
		System.out.println(p.getAge());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
