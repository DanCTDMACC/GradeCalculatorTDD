package model;

public class Grade {
	
	private String studentName;
	private String className;
	private char gradeLetter;
	private int gradePoint;
	
	public Grade(String studentName, String className) {
		this.setStudentName(studentName);
		this.setClassName(className);
		this.setGradeLetter('F');
	}

	
	public Grade(String studentName, String className, int gradePoint) {
		this.setStudentName(studentName);
		this.setClassName(className);
		this.setGradePoint(gradePoint);
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		if (studentName == null) {
			throw new RuntimeException("Student name is not provided");
		} else if (studentName.length() == 0) {
			throw new RuntimeException("Student name must not be empty");
		} else if (studentName.length() > 50) {
			this.studentName = studentName.substring(0, 50);
		} else {
			this.studentName = studentName;
		}
		
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		if (className == null) {
			throw new RuntimeException("Student name is not provided");
		} else if (className.length() == 0) {
			throw new RuntimeException("Class name must not be empty");
		} else if (className.length() > 30) {
			this.className = className.substring(0, 30);
		} else {
			this.className = className;
		}
	}

	public char getGradeLetter() {
		return gradeLetter;
	}

	private void setGradeLetter(char gradeLetter) {
		this.gradeLetter = gradeLetter;
	}

	public int getGradePoint() {
		return gradePoint;
	}

	public void setGradePoint(int gradePoint) {
		if (gradePoint < 0) {
			throw new RuntimeException("Grade point must be greater than 0");
		} else if (gradePoint > 100) {
			throw new RuntimeException("Grade point must be less than 100");
		} else if (gradePoint >=90) {
			this.setGradeLetter('A');
		} else if (gradePoint >=80) {
			this.setGradeLetter('B');
		} else if (gradePoint >=70) {
			this.setGradeLetter('C');
		} else if (gradePoint >=60) {
			this.setGradeLetter('D');
		} else {
			this.setGradeLetter('F');
		}
		this.gradePoint = gradePoint;
	}

}
