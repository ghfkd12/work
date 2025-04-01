package exam;

public class PersonMain {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		ArrayList<Person> insert = new ArrayList<>();
//		
//		boolean st = true;
//		while(true) {
//			System.out.println("1. 정보추가");
//			System.out.println("2. 정보삭제");
//			System.out.println("3. 전체정보");
//			System.out.println("4. 종료");
//			
//			System.out.println("항목 선택 : ");
//			int sel = sc.nextInt();
//			
//			switch(sel) {
//			case 1:
//				System.out.println("정보가 저장되었습니다.");
//			case 2:
//			case 3:
//			case 4:
//				System.out.println("종료");
//				st = false;
//				break;
//			}
//		}
		
		PersonFunction pf = new PersonFunction();
		
		pf.personFunc();
	}

}
