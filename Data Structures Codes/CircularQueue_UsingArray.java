//circular queue implementation using array
package Queue_Applications;

import java.util.Arrays;

public class CircularQueue_UsingArray {
	int[] a;
	int f,r,size;

	public CircularQueue_UsingArray(int n) {
		a = new int[n];
		r=0;f=0;size=0;
	}
	public boolean isFull() {
		return (f==0 && r==a.length) || (f>0 && f-r==0) ;
	}
	public boolean isEmpty() {
		return f == 0 && r == 0;
	}
	public void enqueue(int x) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		else if(r==a.length && f>0)
			r=0;
		a[r++]=x;
		size++;
	}
	public int dequeue() {
		size--;
		return a[f++];
	}
	

	public static void main(String[] args) {
		CircularQueue_UsingArray c=new CircularQueue_UsingArray(10);
		for(int i=0;i<10;i++) {
			c.enqueue(i);
			System.out.println(Arrays.toString(c.a));	
		}
		c.enqueue(11);
				
		System.out.println("dequeued element :- "+c.dequeue());
		c.enqueue(11);
		System.out.println("queue:-"+Arrays.toString(c.a));
		
		c.enqueue(12);
		
		System.out.println("dequeued element :- "+c.dequeue());
		System.out.println("dequeued element :- "+c.dequeue());
		c.enqueue(13);
		c.enqueue(14);
		System.out.println("queue:-"+Arrays.toString(c.a));
		
		c.enqueue(15);
		System.out.println("dequeued element :- "+c.dequeue());
		c.enqueue(15);
		System.out.println("queue:-"+Arrays.toString(c.a));


		
		
	}

}
