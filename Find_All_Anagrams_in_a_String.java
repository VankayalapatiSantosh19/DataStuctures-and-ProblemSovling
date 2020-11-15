//Problem Link:- https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
package Adhoc_Thinking;
import java.util.*;
public class Find_All_Anagrams_in_a_String {
	public static boolean isAnagram(String s,String p) {
		int[] a=new int[26];
		for(int i=0;i<p.length();i++)
			a[p.charAt(i)-'a']++;
		for(int i=0;i<s.length();i++) {
			if(a[s.charAt(i)-'a']<=0)return false;
			a[s.charAt(i)-'a']--;
		}
		return true;
	}
	public static List<Integer> findAnagrams(String s, String p) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<=s.length()-p.length();i++) {
			boolean f=isAnagram(s.substring(i,i+p.length()),p);
			if(f)
				a.add(i);
		}
		return a;
	}
	public static void main(String[] args) {
		System.out.println(findAnagrams("abab","ab"));

	}

}
