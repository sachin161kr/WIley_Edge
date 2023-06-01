package com.wiley.springcore;

public class Student2 {

private int studentId;
	
	private String studentName;
	
	private String studentAddress;
	
	private Student1 obj;
	
	

	public Student1 getObj() {
		return obj;
	}

	public void setObj(Student1 obj) {
		this.obj = obj;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	
	
	public Student2(int studentId, String studentName, String studentAddress, Student1 obj) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.obj = obj;
	}

	public Student2()
	{
		
	}

	@Override
	public String toString() {
		return "Student2 [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress="
				+ studentAddress + ", obj=" + obj + "]";
	}

	
	
	
	
	
}
