package Binary_Search_Thinking;
import java.util.*;
public class BinarySearch {
	
	//Time: Theta(n) space:O(1)
	public static boolean Linearsearch(int[] a,int n) {
		for(int i=0;i<a.length;i++)
			if(a[i]==n) return true;
		return false;
	}
	//Time: Theta(logn) space:O(1)
	public static boolean binarySearch(int[] a,int x) {
		int l=0,r=a.length-1;
		while(l<=r) {
			int m=(l+r)/2;
			if(x==a[m]) return true;
			if(x<a[m])r=m-1;
			else l=m+1;
		}
		return false;
	}

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		Random r=new Random();
		int a[]=Utils.sortedarray(n);
		System.out.println(Arrays.toString(a));
		int k=r.nextInt(n+1);
		System.out.println(k);
		System.out.println(binarySearch(a,k));

	}

}
