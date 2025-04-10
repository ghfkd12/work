package ex05_enum;

public class WeekdayMain {
	public static void main(String[] args) {
		Weekday[] days = Weekday.values();
		
		
		for(int i = 0; i < 7; i++) {
			if(days[i].name().equals("Sun")) {
				System.out.println(days[i]+" 쉬는날입니다");
			} else {
				System.out.println(days[i]+" 출근하는 날입니다.");
			}
		}
		
//		Weekday today = Weekday.Sun;
//		
//		if(today == Weekday.Sun) {
//			System.out.println("쉬는날 입니다");
//		} else {
//			System.out.println("출근하는날 입니다");
//		}
	}
}
