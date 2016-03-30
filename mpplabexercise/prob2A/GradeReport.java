package prob2A;

public class GradeReport {
private Student student;


public GradeReport() {
	super();
}



@Override
public String toString() {
	return "GradeReport [student=" + student + "]";
}



public static void main(String[] args) {
	GradeReport g1= new GradeReport();
	System.out.println(g1);
}

   
}
