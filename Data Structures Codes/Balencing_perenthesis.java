package Stack_Applications;
import java.util.*;
public class Balencing_perenthesis {
	
	public static boolean checkbalenced(String s) {
		Stack st=new Stack();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='[' || s.charAt(i)=='(' || s.charAt(i)=='{') 
				st.push(s.charAt(i));
			else if((s.charAt(i)==']' || s.charAt(i)==')' || s.charAt(i)=='}') && st.empty()) 
				st.push(s.charAt(i));
			else if(s.charAt(i)==']' || s.charAt(i)==')' || s.charAt(i)=='}') {
				if( ((char)st.peek()=='[' && s.charAt(i)==']') || ((char)st.peek()=='(' && s.charAt(i)==')') || ((char)st.peek()=='{' && s.charAt(i)=='}')) 
					st.pop();
				else 
					return false;
		    }
			else 
				st.push(s.charAt(i));
		}
		if(st.empty())
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		System.out.println(checkbalenced("]["));

	}

}
