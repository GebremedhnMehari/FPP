package prob2A;

public class Student {
	private String name;
	private GradeReport gradeReport;
	
	
	
	public Student(String name, GradeReport gradeReport) {
		super();
		this.name = name;
		this.gradeReport = gradeReport;
	}
	public Student() {
		super();
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", gradeReport=" + gradeReport + "]";
	}


	public static void main(String[] args) {
		Student s1= new Student("Feven",new GradeReport());
		System.out.println(s1);
	}

}
