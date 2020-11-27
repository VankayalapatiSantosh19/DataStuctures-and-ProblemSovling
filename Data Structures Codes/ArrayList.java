package LinearList_Applications;
import java.util.Arrays;
interface IList {
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
public class ArrayList implements IList {
	int[] a;
	int size;
	public ArrayList() {
		a=new int[10];
		size=0;
	}

	@Override
	public void addFirst(int x) {
		if(isFull()) 
			resize();
	    shiftRight(0);
	    a[0]=x;
		size++;	
	    
	}

	@Override
	public void addLast(int x) {
		if(isFull())
			resize();
		a[size++]=x;
	}

	@Override
	public void add(int i, int x) {
		if(i>=size || i<0) return;
		if(isFull()) 
			resize();
	    shiftRight(i);
	    a[i]=x;
		size++;	
	}

	@Override
	public int get(int i) {
		if(isEmpty()) return Integer.MIN_VALUE;
		return a[i];
		
	}

	@Override
	public int removeFirst() {
		if(isEmpty()) return Integer.MIN_VALUE;
		int first=a[0];
		size--;
	    shiftleft(0);
		return first;
	}

    @Override
	public int removeLast() {
		if(isEmpty()) return Integer.MIN_VALUE;
		return a[size--];
	}

	@Override
	public int remove(int i) {
		if(i==0 || i>=size || i<0) return Integer.MIN_VALUE;
		int res=a[i];
		shiftleft(i);
		size--;
		return res;
	}

	@Override
	public void display() {
		for(int i=0;i<size;i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void sort() {
		Arrays.sort(a);
	}

	@Override
	public boolean contains(int x) {
		for(int i=0;i<size;i++)
			if(a[i]==x)
				return true;
		return false;
	}
	
	private boolean isEmpty() {
		return size==0;
	}
	
	private boolean isFull() {
		if(size==a.length)
			return true;
		return false;
	}
	
	private void resize() {
		int[] aux=new int[a.length*2];
		for(int i=0;i<a.length;i++)
			aux[i]=a[i];
		a=aux;
	}
	
	private void shiftRight(int p) {
		for(int i=size-1;i>=p;i--)
			a[i+1]=a[i];
	}
	
	private void shiftleft(int p) {
		for(int i=p;i<size;i++)
			a[i]=a[i+1];
		
	}
	
	public static void main(String[] args) {
		IList l=new ArrayList();
		for(int i=0;i<5;i++) {
			l.addLast(i+1);
			l.display();
		}
		for(int i=6;i<=20;i++) {
			l.addFirst(i);
			l.display();
		}
		for(int i=0;i<5;i++) {
			l.removeFirst();
			l.display();
		}
		for(int i=0;i<5;i++) {
			l.removeLast();
			l.display();
		}
	}

}
