package Stack.Operations;
import java.util.*;

public class Postfix{
	
	public static int calculater(int op1, char operator,int op2) {
		switch(operator) {
		case'+': return op1+op2;
		case'-': return op1-op2;
		case'*': return op1*op2;
		case'%': return op1%op2;
		case'/': return op1/op2;
		case'$': return (int)(Math.pow(op1,op2));
		
		}
		return 0;
	}
		
		public static int postFixExp(String exp) {
			Stack<Integer> gaurav = new Stack<Integer>();
			for(int i = 0; i<exp.length(); i++) {
				char ele = exp.charAt(i);
				if(Character.isDigit(ele)) {
					gaurav.push(ele - '0');	
				}
					else {
						int op2 = gaurav.pop();
						int op1 = gaurav.pop();
						
						int res = calculater(op1, ele, op2);
						gaurav.push(res);
				}
			}
			return gaurav.pop();

	}
		
		public static int preFixExp(String exp) {
			Stack<Integer> gaurav = new Stack<Integer>();
			for(int i = exp.length()-1; i>=0; i--) {
				char ele = exp.charAt(i);
				if(Character.isDigit(ele)) {
					gaurav.push(ele - '0');	
				}
					else {
						int op1 = gaurav.pop();
						int op2 = gaurav.pop();
						
						int res = calculater(op1, ele, op2);
						gaurav.push(res);
				}
			}
			return gaurav.pop();

	}
		
		

		public static void main(String[] args) {
			String string = "456*3/+9+65$7-88";
			System.out.println(postFixExp(string));
			
			String string1 = "-4-++4/*56397";
			System.out.println(preFixExp(string1));
		}
}



