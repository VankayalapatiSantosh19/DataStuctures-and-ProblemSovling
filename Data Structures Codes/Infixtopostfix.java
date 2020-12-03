package Stack_Applications;
import java.util.*;
public class Infixtopostfix {
	
	public static String infixtopostfix(String s) {
		Stack<String> st=new Stack<String>();
		List<String> l= Tokeizer(s);
		String res="";
		for(String token:l) {
			if(isoperator(token)) {
				while(!st.isEmpty() && precedence(st.peek()) >= precedence(token))
					res=res+st.pop();
				st.push(token);
			}
			else res=res+token;
		}
		
		while(!st.isEmpty())
			res=res+st.pop();
		
		return res;	
	}
	
	private static int precedence(String t) {
		if(t.equals("*") || t.equals("/"))
			return -1;
		else if(t.equals("+") || t.equals("-"))
			return -2;
		else
		    return -3;
	}

	private static boolean isoperator(String t) {
		return t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/");  
	}

	private static List<String> Tokeizer(String s) {
		List<String> l=new ArrayList<String>();
		for(int i=0;i<s.length();i++) {
			if(isdigit(s.charAt(i))) {
				int sum=0;
				while(i<s.length() && isdigit(s.charAt(i)) ) {
					sum=sum*10+s.charAt(i)-48;
					i++;
				}
				l.add(sum+"");
				i--;
			}
			else l.add(s.charAt(i)+"");
		}
		return l;
	}
	
	private static boolean isdigit(char c) {
		if(c-48>=0 && c-48<=9)return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(infixtopostfix("1+2-3/4*5+6"));
		

	}

}
