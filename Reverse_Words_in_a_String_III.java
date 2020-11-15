//Problem Link:- https://leetcode.com/problems/reverse-words-in-a-string-iii/
package Adhoc_Thinking;
import java.util.*;
public class Reverse_Words_in_a_String_III {
    public static String reverseWords(String s) {
    	String[] s1=s.split(" ");
    	StringBuffer result=new StringBuffer("");
    	for(int i=0;i<s1.length;i++) {
    		result=result.append(new StringBuffer(s1[i]).reverse()+" ");
    	}
    	return result.toString().trim();
    }
	public static void main(String[] args) {
		System.out.println(reverseWords("algorithmica is your best guru"));
	}

}
