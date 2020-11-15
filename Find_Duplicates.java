//Given an array of 1 to n-1 integers find that duplicate if more than one duplicate is there print any one of the duplicate
package Adhoc_Thinking;
import java.util.*;
public class Find_Duplicates {
	//time:Thete(n^2) space:O(1)
	public static int solution1(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
					return a[i];
			}
		}
		return Integer.MIN_VALUE;
	}
	//time:Thete(n*logn) space:O(1)
	public static int solution2(int[] a) {
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++)
			if(a[i]==a[i+1])return a[i];
		return Integer.MIN_VALUE;
	}
	//time:Theta(n) space:O(n)
	public static int solution3(int[] a) {
	    boolean b[]=new boolean[a.length];
	    for(int i=0;i<b.length;i++) {
	    	if(b[a[i]]==false)
	    		b[a[i]]=true;
	    	else
	    		return a[i];
	    }
	    return Integer.MIN_VALUE;
	}
	
	public static int solution4(int[] a) {
		for(int i=0;i<a.length;i++) {
			if(a[Math.abs(a[i])]<=0)
				return Math.abs(a[i]);
			a[Math.abs(a[i])]*=-1;
		}
		return Integer.MIN_VALUE;
	}
	
	
	
	
	//to generate the worst case kind of array
	private static void testcaseGenerator1(int[] a) {//test case for solution1
		int i;
		for(i=0;i<a.length-1;i++) 
			a[i]=i+1;
		a[i]=a.length-1;
	}
	private static void testcaseGenerator2(int[] a) {//test case for solution2
		int i;
		for(i=0;i<a.length-1;i++) 
			a[i]=a.length-i-1;
		a[i]=a.length-1;
	}
	
	
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int[] a=new int[n];
		//testcaseGenerator1(a);
		//testcaseGenerator2(a);// filling the data in array
		// we can also generate test case using Random class also.
		Random r=new Random();
		for(int i=0;i<a.length;i++) 
			a[i]=r.nextInt(n);		
		
		System.out.println(Arrays.toString(a));
		System.out.println(solution4(a));

	}

}
