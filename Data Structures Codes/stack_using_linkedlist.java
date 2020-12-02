package Stack_Applications;

public class stack_using_linkedlist implements Istack {
	int size;
	class node{
		int data;
		node next;
		public node(int x) {
			data=x;
			next=null;
		}
	}
	node top;
    
	public stack_using_linkedlist() {
		size=0;
		top=null;
	}

	@Override
	public void push(int x) {
		node n=new node(x);
		if(top==null) {
			top=n;
			
		}
		else {
			node temp=top;
			n.next=top;
			top=n;
		}
        size++;
	}

	@Override
	public int pop() {
		if(top==null)return Integer.MIN_VALUE;
		node temp=top;
		top=top.next;
		size--;
		temp.next=null;
		return temp.data;
	}

	@Override
	public int top() {
		if(top==null)return Integer.MIN_VALUE;
		return top.data;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void display() {
		if(top==null) {
			System.out.println("Stack is Empty");
			return;
		}
		for(node temp=top;temp!=null;temp=temp.next)
			System.out.print(temp.data +" ");
	}

	public static void main(String[] args) {
		stack_using_linkedlist st=new stack_using_linkedlist();
		for(int i=1;i<=10;i++)
			st.push(i);
		st.display();
		System.out.println("size:-"+st.size);
		
		System.out.println("Top Value:-"+st.top());
		
		st.pop();
		st.display();
		
		System.out.println("Top Value:-"+st.top());
		
		

	}

}
