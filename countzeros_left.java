//problem:-given an array consisting of zeros l=followed by non-zero integers find an efficient algorithm to count the number of zeros in array 
package divideprune_thinking;

import java.util.Arrays;
import java.util.Random;

public class countzeros_left {
	
	//time: Theta(n) space:O(1)
	public static int countzeros1(int[] a) {
		if(a.length==0 || a[0]!=0) return 0;
		for(int i=0;i<a.length;i++)
			if(a[i]!=0)
				return i;
		return a.length;
	}
		
	//time:Theta(log n) spcae: O(1)
	public static int countzeros2(int[] a) {
		if(a.length==0 || a[0]!=0)return 0;
		int l=0,r=a.length-1;
		while(l<r) {
			int mid=(int)Math.ceil((l+r)/2.0);
			if(a[mid]==0)l=mid;
			else r=mid-1;
		}
		return l+1;
	}

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int[] a= new int[n];
		Random r=new Random();
		int k=r.nextInt(n)+1;
		for(int i=k;i<n;i++) 
			a[i]=r.nextInt(n)+1;
		System.out.println(Arrays.toString(a));
		System.out.println(countzeros1(a));
		System.out.println(countzeros2(a));

	}

}
