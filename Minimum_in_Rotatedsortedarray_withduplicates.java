//problem:-https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
package divideprune_thinking;
import java.util.*;
public class Minimum_in_Rotatedsortedarray_withduplicates {
	
	
	
	public static int min_rotetedsortedarray_withduplicates(int[] a) {
		 int l=0,r=a.length-1;
		while(l<r) {
			int mid=(l+r)/2;
			if(a[mid]==a[r])
	              r=r-1;
	        else if(a[mid]<a[r])
	              r=mid;
	        else
	              l=mid+1;
			}
	        return a[l];

		
	}

	public static void main(String[] args) {
		int[] a= {4,5,6,7,0,1,2,2};
		System.out.println(min_rotetedsortedarray_withduplicates(a));
		

	}

}
