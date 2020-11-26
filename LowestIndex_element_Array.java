//problem:Given an sorted array with duplicates and a integer value called target find an efficient algorithm to return the lowest index of the target in the given array 
package Binary_Search_Thinking;

import java.util.Random;

public class LowestIndex_element_Array {
	//Time:Theta(logn) space:O(1)
	public static int lowestIndex(int[] a,int x) {
		int l=0,r=a.length-1;
		while(l<r) {
			int m=(l+r)/2;
			if(x==a[m]) r=m;
			else if(x<a[m])r=m-1;
			else l=m+1;
		}
		if(a[l]==x)return l;
		return -1;
	}
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int a[]=Utils.sortedRandomarraywithduplicates(n); //Utils class is present in data structures folder. it generates an random arraqy with duplicates. 
		int x=new Random().nextInt(10)+1;   //generates an random number between 1 to 10
	    Utils.display(a);
		System.out.println(x);
		System.out.println(lowestIndex(a,x));//print lowest index of an element in array
		

	}

}
