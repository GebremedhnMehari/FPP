package lesson9assignment;

/*public class DrawQueue {

}*/

class LinkedQueue {
	//
	class Node {
		Object data;
		Node next;

		Node(Object item)
		// constructor
		{
			data = item;
		}
	}

	Node front, rear;
	int count;

	public void insert(Object item) {
		Node p = new Node(item);
		if (front == null)
		// queue is empty; insert first item
		{
			front = rear = p;
			front.next = null;
		}
		if (front == rear)
		// queue contains one item; insert second item
		{
			rear = p;
			front.next = p;
			rear.next = null;
		} else
		// queue contains 2 or more items
		{
			rear.next = p;
			// old rear.next refers to p
			rear = p;
			// new rear refers to p
			rear.next = null;
		}
		count++;
		// increment queue size
	}

	public Object remove() {
		if (isEmpty()) {
			System.out.println("Q is empty");
			return null;
		}
		Object item = front.data;
		front = front.next;
		count--;
		// decrement queue size
		return item;
	}

	public boolean isEmpty() {
		return (front == null);
	}

	public Object peek() {
		return front.data;
	}

	public int size() {
		return count;
	}

	public void display() {
		Node p = front;
		System.out.print("Linked Q: ");
		if (p == null)
			System.out.println("empty");
		while (p != null) {
			System.out.print(p.data + " ");
			p = p.next;
		}
		System.out.println();
	}
}

public class DrawQueue {
	public static void main(String[] args) {
		LinkedQueue q = new LinkedQueue();
		System.out.println("Initially"); 
		q.display();
		System.out.println("After Insertion elements"); 
		q.insert("Jonathan");
		q.insert("Dustin");
		q.insert("Robin");
		q.insert("Debbie");
		q.insert("Rich");
		q.display();
		System.out.println("Remove(): " + q.remove());
		System.out.println("Remove(): " + q.remove());
		System.out.println("Remove(): " + q.remove());
		System.out.println("Remove(): " + q.remove());
		System.out.println("Remove(): " + q.remove());
		System.out.println("After Removing all the elements");
	    q.display();
	    
	}

}
