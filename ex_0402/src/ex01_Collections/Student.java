package ex01_Collections;

public class Student {
	
	private String name;
	private int totalScore;
	private int subjectCount;
	
	public Student(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getTotalScore() {
		return totalScore;
	}


	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public int getSubjectCount() {
		return subjectCount;
	}


	public void setSubjectCount(int subjectCount) {
		this.subjectCount = subjectCount;
	}
	
	
	public void addScore(int score) {
		totalScore += score;
		subjectCount++;
	}
	
	public double getAverage() {
//		return average;
		if(subjectCount == 0) {
			return 0;
		} else {
			return (double)totalScore/ subjectCount;
		}
	}
	
	public String getName1() {
		return name;
	}








	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
