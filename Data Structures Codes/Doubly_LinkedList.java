package LinearList_Applications;
interface List {
	void addFirst(int x);
	void addLast(int x);
	void add(int i,int x);
	int get(int i);
	int removeFirst();
	int removeLast();
	int remove(int i);
	void display();
	int size();
	void sort();
	boolean contains(int x);
}
public class Doubly_LinkedList implements List {
	class DListNode{
		int data;
		DListNode next;
		DListNode prev;
		DListNode(int x){
			data=x;
			next=null;
			prev=null;
		}
	}
	DListNode first,last;
	int size;
	Doubly_LinkedList(){
		first=last=null;
		size=0;
	}

	@Override
	public void addFirst(int x) {
		DListNode n=new DListNode(x);
		DListNode temp=first;
		n.next=temp;
		temp.prev=n;
		first=n;
		size++;
	}

	@Override
	public void addLast(int x) {
		DListNode n=new DListNode(x);
		if(isEmpty()) {
			first=n;
			last=n;
		}
		else {
			last.next=n;
			n.prev=last;
			last=n;
		}
		size++;
	}

	@Override
	public void add(int i, int x) {
		if(i>size || i<=1) {
			System.out.println("The element cannot be added");
		    return;
		}
		DListNode n=new DListNode(x);
		DListNode temp=first,temp1;
		int j=1; 
		while(j<i-1) {
			j++;
			temp=temp.next;
		}
		temp1=temp.next;
		temp.next=n;
		n.prev=temp;
		n.next=temp1;
		temp1.prev=n;
		size++;
	}

	@Override
	public int get(int i) {
		if(isEmpty())return Integer.MIN_VALUE;
		DListNode temp=first;
		int count=1;
		while(count<i) {
			count++;
			temp=temp.next;
		}
		return temp.data;   
	}

	@Override
	public int removeFirst() {
		if(isEmpty())return Integer.MIN_VALUE;
		DListNode temp=first.next,temp1=first;
		first=temp;
		size--;
		return temp1.data;
		
	}

	@Override
	public int removeLast() {
		if(isEmpty())return Integer.MIN_VALUE;
		DListNode temp=last.prev,temp1=last;
		temp.next=null;
		temp1.prev=null;
		last=temp;
		return temp1.data;
	}

	@Override
	public int remove(int i) {
		if(isEmpty())return Integer.MIN_VALUE;
		if(i>=size-1) {
			System.out.println("The element cannot be removed");
		    return -1;
		}
		DListNode temp=first,temp1;
		int j=1; 
		while(j<i-1) {
			j++;
			temp=temp.next;
		}
		temp1=temp.next.next;
		temp.next=temp1;
		temp1.prev=temp;
		return temp.next.data;
	}

	@Override
	public void display() {
		DListNode temp=first;
		while(temp!=null) {
			System.out.print(temp.data + "<=>");
			temp=temp.next;
		}
		System.out.println("null");
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void sort() {
		
		
	}

	@Override
	public boolean contains(int x) {
		for(DListNode temp=first;temp!=null;temp=temp.next)
			if(temp.data==x)
				return true;
		return false;
	}
	
	private boolean isEmpty() {
		return first==null && last==null;
	}
	
	public static void main(String[] args) {
		Doubly_LinkedList l=new Doubly_LinkedList();
		for(int i=0;i<5;i++)
			l.addLast(i);
		for(int i=5;i<10;i++)
			l.addFirst(i);
		System.out.println("All Elements in Linked List");
		l.display();
		System.out.println("-----------------------------------------------");
		System.out.println("Adding the element at middle");
		l.add(10, 25);
		l.display();
		System.out.println("-----------------------------------------------");
		System.out.println("Removing First element");
		l.removeFirst();
		l.display();
		System.out.println("-----------------------------------------------");
		System.out.println("Removing Last element");
		l.removeLast();
		l.display();
		System.out.println("-----------------------------------------------");
		System.out.println("Removing Middle element");
		l.remove(8);
		l.display();
		
	}

}
