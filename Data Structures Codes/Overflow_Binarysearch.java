package Binary_Search_Thinking;
import java.util.*;
public class Overflow_Binarysearch {
	
	public static int binarysearch(int[] in,int x) {
		int l=0,r=in.length-1;
		while(l<=r) {
			int m=l+r >>> 1;//l+(r-l)/2;
			if(in[m]==x)return m;
			if(in[m]<x)l=m+1;
			else r=m-1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=i+1;
		int x=n;
		System.out.println(binarysearch(a,x));

	}

}
