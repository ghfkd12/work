package ex05_Generic;

public class DataListExample {
	public static void main(String[] args) {
		// 객체가 만들어 지면서 배열을 같이 생성
		// 제네릭의 탑 녀수는 기본자료형을 인식하지 않는다.
		// 따라서 int, doible 등의 기본자룡열을 제네릭 타이브로 이용하고...
		DataList list = new DataList();
		
		// Object타입의 배열이기 때문에 정수, 문자열, 실수가 들어와도 넣을 수 있다
//		list.add(10);
//		
//		list.add("문자열");
//		
//		list.add(10.33);
		
//		for(int i = 0; i <list.size(); i++) {
//			Object data = list.get(i);
//			
//			// 그냥 출력해도 되지만 저장된 데이터 타입이 어떤 타입인지 검사
//			if(data instanceof Integer) {
//				System.out.println("정수 :" + (int)data);
//			} else if(data instanceof Double) {
//				System.out.println("실수 :"+(double)data);
//			} else if (data instanceof String){
//				System.out.println("문자열 :"+(String)data);
//			}
//		}
		
		int sum = 0;
		for(int i = 0; i<list.size(); i++) {
			sum += list.get(i);
			
		}
		System.out.println(sum);
		
		DataList<String> list2 = new DataList();
	}
}
