package Binary_Search_Thinking;
import java.util.Arrays;
public class Utils {
	
	public static int[] sortedarray(int n) {
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=i+1;
		return a;
	}
	
	public static void display(int[] a) {
		System.out.println(Arrays.toString(a));
	}

}
