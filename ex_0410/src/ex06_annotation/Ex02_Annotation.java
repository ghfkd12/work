package ex06_annotation;

import java.lang.annotation.Annotation;

@TestInfo(name = "홍길동", skills={"Java","Spring"})
public class Ex02_Annotation {
	public static void main(String[] args) {
		Annotation[] annotations = Ex02_Annotation.class.getAnnotations();
		
		for(Annotation anno : annotations) {
			System.out.println(anno);
		}
		
		TestInfo testInfo = (TestInfo)Ex02_Annotation.class.getAnnotation(TestInfo.class);
		System.out.println(testInfo.name());
		
//		jdbc(java database connectivity)를 사용해서 연결을 했고
		// oracle <-> DBeaver
		
		// 드라이버 <-> 두개를 연결해주는 다리
		// oracle <-> java
	}
}
