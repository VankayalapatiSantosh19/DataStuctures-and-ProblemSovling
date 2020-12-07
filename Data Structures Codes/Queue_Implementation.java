//Queue Implementation using Array
package Queue_Applications;
public class Queue_Implementation {
	int[] a;
	int r,f;
	public Queue_Implementation(int n) {
		a=new int[n];
		r=0;
		f=0;
	}
	public void enqueue(int x) {
		if(r==a.length) {
			System.out.println("the queue is full");
			return;
		}
		a[r]=x;
		r++;
	}
	public int dequeue() {
		if(r==0 && f==0) return Integer.MIN_VALUE;
		int x=a[f];
		for(int i=1;i<r;i++)
			a[i-1]=a[i];
		r--;
		return x;
	}
	public void display() {
		if(r==0 && f==0) {
			System.out.println("the queue is empty");
			return;
		}
		for(int i=f;i<r;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		Queue_Implementation q=new Queue_Implementation(10);
		for(int i=0;i<10;i++) {
			q.enqueue(i);
			q.display();
		}
		for(int i=0;i<=10;i++) {
		    System.out.println(q.dequeue());
		    q.display();
		}
		
			
		

	}

}
