//problem:-count the number of zeros given an integer array of non zero integer elements followed by zeros
//write an efficient algorithm to find number of zeros  
package divideprune_thinking;
import java.util.*;
public class count_zeros {
	//time: Theta(n) space:O(1)
	public static int countzeros1(int[] a) {
		if(a.length==0) return 0;
		for(int i=a.length-1;i>=0;i--)
			if(a[i]!=0)
				return a.length-i-1;
		return a.length;
	}
	
	//time:Theta(log n) spcae: O(1)
	public static int countzeros2(int[] a) {
		if(a.length==0 || a[a.length-1]!=0)return 0;
		int l=0,r=a.length-1;
		while(l<r) {
			int mid=(l+r)/2;
			if(a[mid]==0)r=mid;
		    else l=mid+1;
		}
		return a.length-l;
		
		
	}

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int[] a=new int[n];
		Random r=new Random();
		int k=r.nextInt(n)+1;
		for(int i=0;i<k;i++) 
			a[i]=r.nextInt(n)+1;
		
		
		System.out.println(Arrays.toString(a));
		System.out.println(countzeros1(a));
		System.out.println(countzeros2(a));
		

	}

}
