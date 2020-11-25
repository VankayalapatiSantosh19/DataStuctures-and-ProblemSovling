//problem:-given a rotated sorted array of n integers find an efficient algorithm that returns smallest minimum element array
package divideprune_thinking;
import java.util.*;
public class Minimum_in_rotatedsortedarray {
	
	public static void rotate_sorted_array(int a[],int k) {
		int[] aux=new int[a.length];
		for(int i=0;i<a.length;++i) {
			aux[(i+k)%a.length]=a[i];
		}
		for(int i=0;i<a.length;++i)
		     a[i]=aux[i];
	}
	//time:-Theta(logn) space:O(1)
	public static int find_minimum_in_rotated_sorted_array(int[] a) {
		int l=0,r=a.length-1;
		while(l<r) {
			int mid=(l+r)/2;
			if(a[mid]<a[a.length-1])
				r=mid;
			else
				l=mid+1;
		}
		return a[l];
	}

	public static void main(String[] args) {
		/*
		int[] a= {2,3,4,5,6,7,8,9,1};//sorted array which is rotated
		System.out.println(find_minimum_in_rotated_sorted_array(a));
        */
		int n=Integer.parseInt(args[0]);
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=i+1;
		System.out.println("Sorted array:- "+Arrays.toString(a));
		int k=new Random().nextInt(n);
		rotate_sorted_array(a,k);
		System.out.println("Number of rotations:- "+k);
		System.out.println("Rotated array:-"+ Arrays.toString(a));
		
		System.out.println("Minimim element:- "+ find_minimum_in_rotated_sorted_array(a));
	}

}
