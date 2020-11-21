package Binary_Search_Thinking;
import java.util.Arrays;
import java.util.Random;
public class Utils {
	
	public static int[] sortedarray(int n) {
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=i+1;
		return a;
	}
	
	public static int[] sortedRandomarray(int n) {
		int a[]=new int[n];
		Random r=new Random();
		for(int i=0;i<n;i++)
			a[i]=r.nextInt(2*n)+1;
		Arrays.sort(a);
		return a;
	}
	
	public static int[] sortedRandomarraywithduplicates(int n) {
		int a[]=new int[n];
		Random r=new Random();
		for(int i=0;i<n;i++)
			a[i]=r.nextInt(10)+1;  //decreased the range so more duplicates will come.
		Arrays.sort(a);
		return a;
	}
	
	public static void display(int[] a) {
		System.out.println(Arrays.toString(a));
	}

}
