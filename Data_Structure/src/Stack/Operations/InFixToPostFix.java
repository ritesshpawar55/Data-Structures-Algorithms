package Stack.Operations;

import java.util.*;
public class InFixToPostFix {
	
	public static int Precdence(char oper) {
		switch(oper) {
		case '$' : return 10;
		case '/' : return 9;
		case '*' : return 9;
		case '%' : return 9;
		case '+' : return 8;
		case '-' : return 8;
		}
		return 0;
	}
	
	public static String InfixToPost(String infix) {
		Stack<Character> s1 = new Stack<>();
		StringBuilder postfix = new StringBuilder();
		
		for(int i = 0;i < infix.length(); i++) {
			char ele = infix.charAt(i);
			if(Character.isDigit(ele)) {
				postfix.append(ele);
			}
			else if(ele == '(') {
				s1.push(ele);
			}
			else if(ele == ')') {
				 while(s1.peek() != '(') 
					 postfix.append(s1.pop());
				 s1.pop();
			}
			else {
				while(!s1.isEmpty() && Precdence(s1.peek())>= Precdence(ele))
					postfix.append(s1.pop());
				s1.push(ele);
			}
		}
		while(!s1.isEmpty())
			postfix.append(s1.pop());
		return postfix.toString();
		
	} 
	public static void main(String[] args) {
		String infix = "3+2(1*3-7)+-1";

		System.out.println("Infix : " + infix);
		String postfix = InfixToPost(infix);
		System.out.println("Postfix : " + postfix);
	}

}
