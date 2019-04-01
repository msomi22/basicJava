package core.string;

import java.util.Stack;

public class Palidrome {

	public static void main(String[] args) {
		
		String test = "peter";//peter, madam,lol
		String reverse = new StringBuffer(test).reverse().toString();
		if(test.equals(reverse)){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
		
		
		
		int num = 20024;
		int no = num;
		int temp = 0;
		while(num > 0){
			temp = temp * 10 + num % 10;
			System.out.println("temp = " + temp + " (" + num % 10+")");
			num = num / 10;
			System.out.println("num = " + num);
		}
		//1 = true, 0 = false
		System.out.println("num = " + num + ", temp = " + temp);
		if(no == temp){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
		
		
		System.out.println(isPalindrome("madam"));
		String text = "madam";
		Stack stack = new Stack();
		for(int i =0;i<text.length();i++){
			stack.push(text.charAt(i));
		}
		String textRev = "";
		while(!stack.isEmpty()){
			textRev = textRev+stack.pop();
		}
		
		if(text.equals(textRev)){
			System.out.println("--True");
		}else{
			System.out.println("--False");
		}
		
		
		
		String input = "peter";
		reverse(input);
		
		System.out.println("*********************************************"); 
		String[] testArr = {"madam","wow","test","tes","abracadabra","geeksforgeeks"};
		for(String x : testArr){
			//System.out.println("String = " + x); 
			int mid = x.length()/2;
			//System.out.println("mid = " + mid + " mid char = " + x.charAt(mid));  
			String left = x.substring(0, mid);
			String right = x.substring(mid+1, x.length());
			//System.out.println("left = " + left + " , right = " + right); 
			
			if(left.equals(reverse(right))){
				System.out.println("True");
			}else{
				System.out.println("False");
			}
			
			
			
		}
		
		
		

	}

	/**
	 * @param input
	 * @param len
	 */
	private static String reverse(String input) {
		int len = input.length() - 1;
		String rev = "";
		while(len>=0){
			rev = rev + input.charAt(len);
			len--;
		}
		//System.out.println("input = " + input + ", rev = " + rev);
		return rev;
	}
	
	/*
	 * run time O(n)
	 */
	public static boolean isPalindrome(String test){
		if(test == null)
			return false;
		int left = 0;
		int right = test.length() -1;
		while(left < right){
			if(test.charAt(left++) != test.charAt(right--)){
				return false;
			}
		}
		return true;
	}

}
