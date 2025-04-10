package ex05_enum;

public class TransportMain {
	public static void main(String[] args) {
		// 각 운송수단별 100을 갔을 때 금액
		// name : xxx, 100km - fare : yyy;
		
		Transportation[] trans = Transportation.values();
		
		for(Transportation tran : trans) {
			System.out.printf("name : %s, 100km - fare : %d\n",tran.name(),tran.totalFare(100));
		}
		
		
	}
}
