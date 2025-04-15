package ex02_DB;

import java.util.List;

public class PersonMain {
	public static void main(String[] args) {
		
		PersonMethod.add(3,"박길동", 40);
		
		List<Person> list = PersonMethod.find("홍길동");
		
		for(Person per : list) {
			System.out.println("이름 : "+per.getName()+"나이 : "+per.getAge());
		}
//	
		

		
//		for(Person p : list) {
//			System.out.println(p);
//			System.out.println("이름 : "+p.getName()+"나이 : "+p.getAge());
//		}
	}
}
