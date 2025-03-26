package ex06_inheritance;

public class CarMain {
	public static void main(String[] args) {
		SchoolBus sb = new SchoolBus(10);
		
		sb.takePerson(); // Bus클래스 오버라이딩
		sb.ride(); // Car클래스 오버라이딩
		
		// N차 상속까지 가능하다.
		
		// 상속 
		// 부모클래스
		// ㄴ 상위개념, 일반적인 개념이 들어간다.
		// 자식클래스
		// ㄴ 하위개념, 구체적인 개념이 들어간다.
		
		// 상속단계
		// extends키워드를써야 자식관계가 성립이 된다.
		// 자식클래스 extends 부모클래스{
		//
		// }
		// 상속관계가 성립이 되면 
		// 자식 객체가 만들어 졌을 때 부모의 필드나 메서드를 사용할 수 있다.
		// 자식의 생성자가 호출될 때 부모의 생성자가 먼저 호출되기 때문이다.
		
		// this가 객체 자기 자신을 참조하는 변수라면
		// super는 부모를 참조하는 변수
		
		// Child(){
		// 	super(); -> 부모생성자의 호출
		// }
		
		// 부모 생성자가 매개변수를 가진다면
		// Parent(String name,int age){
		//	this.name;
		// 	this.age;
		// }
		
		// Child(String name,int age){
		// 	super(name,age); -> 부모생성자의 호출(생략이 불가능하다.)
		// }
		
//		오버라이드(override)
//		부모에 정의된 메서드를 자식클래스가 재정의하는것
//		
//		오버라이드 규칙
//		1. 부모클래스의 메서드명, 반환타입, 매개변수가 동일해야 한다.
//		2. 부모클래스의 메서드보다 접근 제한 범위를 줄일 수 있다.
		
		// 자바의 모든 클래스는 object 라는 클래스에 상속됨
		// 부모클래스는 여러 자식클래스를 가질 수 있지만,
		// 자식클래스는 2개이상의 부모클래스를 가질 수 없다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
