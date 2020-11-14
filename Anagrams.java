//Given tow strings s1 ans s2 print true if they are anagrams otherwise print false
package Adhoc_Thinking;
import java.util.*;
public class Anagrams {
	//time:Theta(n^2) space:O(1)
	public static boolean anagramcheck1(String s1,String s2) {
		return false;//brute force solution
	}
	//time:Theta(n*logn) space:O(n)
	public static boolean anagramcheck2(String s1,String s2) {
		char[] temp1=s1.toCharArray();
		char[] temp2=s2.toCharArray();
		Arrays.sort(temp1);
		Arrays.sort(temp2);
		for(int i=0;i<temp1.length;i++) {
			if(temp1[i]!=temp2[i])return false;
		}
		return true;
	}
	//time:Theta(n) space:O(1)
	public static boolean anagramcheck3(String s1,String s2) {
		int arr[]=new int[26];
		for(int i=0;i<s1.length();i++)
			arr[s1.charAt(i)-'a']++;
		for(int i=0;i<s2.length();i++) {
			if(arr[s2.charAt(i)-'a']<=0)return false;
			arr[s2.charAt(i)-'a']--;
		}
		return true;
	}
	//this method generates a random string of length n in lower case
	private static String RandomString(int n) {
		String res="";
		Random r=new Random();
		for(int i=0;i<n;i++)
			res=res+(char)('a'+r.nextInt(26));
		return res;
	}

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		String s1=RandomString(n);
		String s2=RandomString(n);
		System.out.println("String s1 "+s1 + " " +"String s2 "+ s2);
		System.out.println(anagramcheck2(s1,s2));
		System.out.println(anagramcheck3(s1,s2));

	}

}
