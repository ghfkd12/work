package ex_test;

public class TestMain {
	public static void main(String[] args) {
//		Test test = new Test();
//		
//		System.out.println(test.str().toUpperCase());
		
//		Test test = new Test() {
//			
//			@Override
//			public String str() {
//				return "hello";
//			}
//		};
//		
//		System.out.println(test.str().toUpperCase());
		
		Test_Inter ti = s -> s.toUpperCase();
//		String result = ti.str("hello");
		System.out.println(ti.str("hello"));
		
	}
}
