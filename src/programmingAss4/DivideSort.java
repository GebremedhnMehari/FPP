package programmingAss4;

public class DivideSort {
	public String divideSort(String s){
		int m=s.length()/2;
		if(s.length()==0||s.length()==1)
			return s;
		else
			
			divideSort(s.substring(0, m));
			divideSort(s.substring(m, s.length()));
	}
	public static void main(String args[]) {
		DivideSort input = new DivideSort();

}
}
