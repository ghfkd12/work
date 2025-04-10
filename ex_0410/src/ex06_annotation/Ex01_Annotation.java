package ex06_annotation;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface testInter{
	void method1();
}

class testImpl implements testInter{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}	
}

@SuppressWarnings({"unused","unchecked","deprecation","removal"})
// unused : 사용하지 않는 변수에 대한 경고 억제
// unchecked : 제네릭 타입 미지정에 발생하는 경고 억제
public class Ex01_Annotation {
	public static void main(String[] args) {
		int x = 10;
		
		List list = new ArrayList();
		
		Integer y = new Integer(10);
		
		addUser("철수");
	}
	@Deprecated
	public static void addUser(String name) {
		System.out.println("사용자 추가 : "+name+"(이방식은 더이상 사용하지 않습니다.)");
	}
}
