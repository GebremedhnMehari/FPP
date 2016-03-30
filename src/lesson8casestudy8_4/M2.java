package lesson8casestudy8_4;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;

class packet2 implements Comparable
{
	public String n_message;
	public int n_id;
	packet2(String  n_message, int n_id)
	{
		this.n_message = n_message;
		this.n_id = n_id;
	}
	public int compareTo(Object obj)
	{
		packet2 AObj = (packet2)obj;
		
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

public class M2 {
	
	public static void main(String[] args) {
		//ArrayList <packet2> list = new ArrayList<packet2>();
		LinkedList<packet2> list = new LinkedList<packet2>();
		list.add(new packet2("doing?",4));
		list.add(new packet2("are", 2));
		list.add(new packet2("How", 1));
		list.add(new packet2("you", 3));
	
		System.out.println("Message Before Assembeled");
		for(packet2 obj : list)
			System.out.print(obj.n_message+" ");
		Collections.sort(list);
		System.out.println("\nMessage After assembled");
		for(packet2 obj : list)
			System.out.print(obj.n_message+" ");
	}

}
