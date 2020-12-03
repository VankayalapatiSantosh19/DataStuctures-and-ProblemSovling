package Stack_Applications;
import java.util.*;
public class postfixevaluation {
	//time:Theta(n) space:Theta(n)
	public static int eval(String[] s) {
		Stack<Integer> st=new Stack<Integer>();
		for(String in:s) {
			switch(in) {
			case "+" : 
				st.push(st.pop()+st.pop());
				break;
			case "-" : 
				st.push(-st.pop()+st.pop());
				break;
			case "*" : 
				st.push(st.pop()*st.pop());
				break;
			case "/" : 
				st.push(1/st.pop()*st.pop());
				break;
			default:
				st.push(Integer.parseInt(in));
			}
		}
		return st.pop();
	}
	public static void main(String[] args) {
		String s1="2 3 * 4 + 5 -";
		String[] s=s1.split(" ");
		System.out.println(Arrays.toString(s));
		System.out.println(eval(s));
	}

}
