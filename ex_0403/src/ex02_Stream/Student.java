package ex02_Stream;

public class Student implements Comparable<Student>{
	
	String name;
	int ban;
	int totalScore;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	
	public Student(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
		
		// compareTo()
		// 객체를 서로 비교할 때 사용하는 메서드
		// 주로 정렬이나 비교연산에 사용된다.
		
		// int result = a.compareTo(b)
		
		// 반환값이 0이면 두 객체가 같다.
		// 반환값이 0보다 작으면 a가 b보다 작다.
		// 반환값이 0보다 크면 a가 b보다 크다.
		
 	}
	
	@Override
	public String toString() {
		return String.format("[%s,%d,%d]",name,ban,totalScore).toString();
	}
	
	@Override
	public int compareTo(Student s) {
		return s.totalScore - this.ban;
	}
}
