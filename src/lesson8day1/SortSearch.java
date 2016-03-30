package lesson8day1;

public class SortSearch {

}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

class packet implements Comparable
{
	public String n_message;
	public int n_id;
	packet(String  n_message, int n_id)
	{
		this.n_message = n_message;
		this.n_id = n_id;
	}
	public int compareTo(Object obj)
	{
		packet AObj = (packet)obj;
		
		if (this.n_id> AObj.n_id) 
		return 1;
		else 
			if (this.n_id< AObj.n_id) 
				return -1;
			else 
				return 0;
	}
	public String toString() {
		
		return "Id="+n_id+"Message="+n_message;
	}
}

public class M {
	
	public static void main(String[] args) {
		ArrayList <packet> list = new ArrayList<packet>();
		//LinkedList<packet> list = new LinkedList<packet>();
		list.add(new packet("you",3));
		list.add(new packet("Where", 1));
		list.add(new packet("are", 2));
	
		System.out.println("Message Before Assembeled");
		for(packet obj : list)
			System.out.print(obj.n_message+" ");
		Collections.sort(list);
		System.out.println("\nMessage After assembled");
		for(packet obj : list)
			System.out.print(obj.n_message+" ");
	}

}
