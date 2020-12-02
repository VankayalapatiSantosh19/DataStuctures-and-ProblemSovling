package Stack_Applications;
public class stack_using_arraylist implements Istack {
	int[] a;
	int size,top;
	stack_using_arraylist(int x){
		a=new int[x];
		size=0;
		top=-1;
	}
	@Override
	public void push(int x) {
		if(size==a.length) {
			int[] aux=new int[2*a.length];
			for(int i=0;i<a.length;i++)
				aux[i]=a[i];
			a=aux;
		}
		
		a[++top]=x;
		size++;
	}
	@Override
	public int pop() {
		if(top==-1) System.out.println("Stack is Empty");
		size--;
		return a[top--];
	}
	@Override
	public int top() {
		return a[top];
	}
	@Override
	public int size() {
		return size;
	}
	@Override
	public void display() {
		for(int i=top;i>=0;i--)
			System.out.print(a[i]+" ");
	}
	
    public static void main(String[] args) {
    	stack_using_arraylist st=new stack_using_arraylist(10);
    	for(int i=1;i<=10;i++)
    		st.push(i);
    	st.display();
    	System.out.println("size:-"+st.size());
    
    	st.pop();
    	st.display();
    	System.out.println("size:-"+st.size());
    	for(int i=11;i<=20;i++)
    		st.push(i);
    	st.display();
    	System.out.println("size:-"+st.size());
    	System.out.println(st.a.length);
    	System.out.println(st.top());
	}

}
