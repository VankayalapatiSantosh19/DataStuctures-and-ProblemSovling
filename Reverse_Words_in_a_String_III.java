//Problem Link:- https://leetcode.com/problems/reverse-words-in-a-string-iii/
package Adhoc_Thinking;
import java.util.*;
public class Reverse_Words_in_a_String_III {
    public static String reverseWords(String s) {
    	StringTokenizer s1=new StringTokenizer(s);
    	StringBuffer result=new StringBuffer("");
    	while(s1.hasMoreTokens()) {
    		result=result.append(new StringBuffer(s1.nextToken()).reverse()+" ");
    	}
    	return result.toString().trim();
    }
	public static void main(String[] args) {
		System.out.println(reverseWords("algorithmica is your best guru"));
	}

}
