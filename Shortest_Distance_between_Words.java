//Problem Link:- https://leetcode.com/problems/shortest-word-distance/description/
package Adhoc_Thinking;
import java.util.*;
public class Shortest_Distance_between_Words {
    public static int distance(String[] s,String word1,String word2) {
    	int x=0,y=0;
    	for(int i=0;i<s.length;i++) {
    		if(s[i].equals(word1))
    			x=i;
    		else if(s[i].equals(word2))
    			y=i;
    	}
    	return Math.abs(x-y);
    }
	public static void main(String[] args) {
		String[] s= {"practice", "makes", "perfect", "coding", "makes"};
		System.out.println(distance(s,"makes","coding"));

	}

}
