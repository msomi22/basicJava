package core.string;

import java.util.Arrays;
import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		
		String[] testArr = {"()","((()()()(())))","(()()()())",
				"(({)})","","([{)}]","((())","([{}])(){}[]", "({[]})"};

		
		
		Arrays.asList(testArr).stream().forEach(str -> {
			System.out.print(str); 
			StringBuilder response = new StringBuilder();
			Stack<Character> stack = new Stack<Character>(); 
			
			if(str.isEmpty())
				response.append("Balanced");
				
			
			for(int i=0;i<str.length();i++){
				char cur = str.charAt(i);
				if(cur == '{' || cur == '(' || cur == '['){
					stack.push(cur);
				}
				
				if(cur == '}' || cur == ')' || cur == ']'){
					if(stack.isEmpty())
						response.setLength(0); 
						response.append("Not Balanced");
					char last = stack.peek();
					if(cur =='}' && last == '{' || cur == ')' && last == '(' || cur == ']' && last == '[')
						stack.pop();
					else
						response.setLength(0); 
						response.append("Not Balanced");
						
				}
				
				String result = stack.isEmpty() ? "Balanced" : "Not Balanced";
				response.setLength(0); 
				response.append(result);
				
			}
			System.out.println(" " + response); 
			
		});
		
		
		
		
		
		
	}

}
