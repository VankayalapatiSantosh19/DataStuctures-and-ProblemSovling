//problem:-Given an integer array and integer k rotate an array to right k times
package Adhoc_Thinking;
import java.util.*;
public class Rotate_Array_Kelements {
	//time:Theta(k*n) 
	public static void solution1(int a[],int k) {
		for(int i=1;i<=k;++i) {
			int last=a[a.length-1];
			for(int j=a.length-2;j>=0;--j)
				a[j+1]=a[j];
			a[0]=last;
		}
		
	}
	//time:Theta(n) space:O(n)
	public static void solution2(int a[],int k) {
		int[] aux=new int[a.length];
		for(int i=0;i<a.length;++i) {
			aux[(i+k)%a.length]=a[i];
		}
		for(int i=0;i<a.length;++i)
		     a[i]=aux[i];
	}
	public static void reverse(int[] a,int l,int r) {
		while(l<r) {
			int temp=a[l];
			a[l]=a[r];
			a[r]=temp;
			l++;
			r--;
		}
	}
	//time:Theta(n) space:O(1)
	public static void solution3(int[] a,int k) {
		reverse(a,0,a.length-1);
		reverse(a,0,k-1);
		reverse(a,k,a.length-1);
		
	}
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int a[]=new int[n];
		Random r=new Random();
		for(int i=0;i<a.length;++i)
			a[i]=r.nextInt(n)+1;     // 1 to n random numbers will be generated and one number will be uniformly assinged.
		System.out.print(Arrays.toString(a));
		int k=r.nextInt(n); // in 0 to n-1 random numbers any one number will be assinged.
		//solution1(a,k);
		//solution2(a,k);
		System.out.println("The number of rotations "+k);
		long start=System.currentTimeMillis();
		solution3(a,k);
		long end=System.currentTimeMillis();
		System.out.println("time taken:-" + (end-start)/1000.0+"secs");
		System.out.println(Arrays.toString(a));
		
		
	}

}
