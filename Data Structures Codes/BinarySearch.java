package Binary_Search_Thinking;
import java.util.*;
public class BinarySearch {
	
	//Time: Theta(n) space:O(1)
	public static boolean Linearsearch(int[] a,int n) {
		for(int i=0;i<a.length;i++)
			if(a[i]==n) return true;
		return false;
	}
	//Time: Theta(logn base 2) space:O(1)
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
	
	//Time: Theta(logn base 3) space:O(1)
		public static boolean TernarySearch(int[] a,int x) {
			int l=0,r=a.length-1;
			while(l<=r) {
				int size=(r-l+1)/3;
				int m1=l+size;
				int m2=r-size;
				if(x==a[m1] || x==a[m2])return true;
				if(x<a[m1])
					r=m1-1;
				else if(x>a[m2])
					l=m1+1;
				else{
					l=m1+1;
					r=m2-1;
				}
			}
			return false;
		}


	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int a[]=Utils.sortedRandomarray(n);
		int x=new Random().nextInt(n)+1;
	    Utils.display(a);
		System.out.println(x);
		System.out.println(TernarySearch(a,x));

	}

}
