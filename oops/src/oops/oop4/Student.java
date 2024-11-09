package oops.oop4;

public class Student {
	
	private int studentId;
	private String studentName;
	private String studentMail;
	private long studentMobile;
	
	//Getters and Setters.
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

	public String getStudentMail() {
		return studentMail;
	}

	public void setStudentMail(String studentMail) {
		this.studentMail = studentMail;
	}

	public long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}
	
	//constructor
	public Student() {
		super();
	}

	public Student(int studentId, String studentName, String studentMail, long studentMobile) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMail = studentMail;
		this.studentMobile = studentMobile;
	}
	
	
	
}
