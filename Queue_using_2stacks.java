//problemLink:-https://leetcode.com/problems/implement-queue-using-stacks
package Queue_Applications;
import java.util.*;
public class Queue_using_2stacks {
	private Stack<Integer> s1;
	private Stack<Integer> s2;
	public  Queue_using_2stacks() {
		s1=new Stack<Integer>();
		s2=new Stack<Integer>();
	}
 	public void enqueue(int x) {
		s1.push(x);
	}
	
	public int dequeue() {
		if(s1.isEmpty()) return Integer.MIN_VALUE;
		while(!s1.isEmpty())
			s2.push(s1.pop());
		int x=s2.pop();
		while(!s2.isEmpty())
			s1.push(s2.pop());
		return x;
	}
	
	
	public void display() {
		System.out.println(s1);
	}

	public static void main(String[] args) {
		Queue_using_2stacks q=new Queue_using_2stacks();
		Random r=new Random();
		for(int i=0;i<10;i++)
			q.enqueue(r.nextInt(25)+1);
		q.display();
		System.out.println(q.dequeue());
		q.display();

	}

}
