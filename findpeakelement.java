//problemLink:-https://leetcode.com/problems/find-peak-element/description/
package divideprune_thinking;
import java.util.*;
public class findpeakelement {

	public static int findPeakElement(int[] a) {
		int l=0,r=a.length-1;
		while(l<r) {
			int mid=(l+r)/2;
			if(a[mid]>a[mid+1])
				r=mid;
			else
				l=mid+1;
		}
		return l;//returning index.
	 }

	public static void main(String[] args) {
		int[] a= {1,2,1,3,5,6,4};
		System.out.println(findPeakElement(a));

	}

}
