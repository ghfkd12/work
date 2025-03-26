package ex04_exam;

import java.util.Arrays;
import java.util.Random;

public class Graph {
	public static void main(String[] args) {
		Random r = new Random();
//		int ran = r.nextInt(9 - 0);
//		
//		for(int i = 0; i <= 100; i++ ) {
//			
//		}
		
		int rnum = r.nextInt();
		
		int[] num = new int[100]; // 난수를 담을 배열
		
		int[] count = new int[10]; // 생성된 난수의 개수를 담을 배열
		
		// 100개의 공간에 난수를 할당
		for(int i = 0; i <num.length; i++) {
			num[i] = r.nextInt(10);
		}
		
		for(int i = 0; i < num.length; i++) {
			count[num[i]]++;
		}
		
		PrintGraph pg = new PrintGraph();
		for(int i = 0; i <count.length; i++) {
			System.out.printf("%d의 개수 : %s %d\n",i,pg.print('#', count[i]),count[i]);
		}
		
		System.out.println(Arrays.toString(count));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
