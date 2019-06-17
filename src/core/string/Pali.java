package core.string;

public class Pali {

	public Pali() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		String testStr = "madam";
		boolean isPalindrome = isPalindrome(testStr);
		System.out.println("isPalindrome: " + isPalindrome); 
		boolean isParindromeNum = isParindromeNum(2002442002);//2002442002
		System.out.println("isParindromeNum: " + isParindromeNum); 

	}

	private static boolean isParindromeNum(int num) {
		int backup = num;
		int temp = 0;
		
		while(num > 0) {
			temp = temp * 10 + num % 10;
			num = num / 10;
		}
		
		if(temp == backup) {
			return true;
		}
		return false;
	}

	private static boolean isPalindrome(String testStr) {
		if(testStr.isEmpty())
			return false;
		int startIndex = 0;
		int lastIndex = testStr.length() - 1;
		if(startIndex > lastIndex)
			return false;
		while(startIndex < lastIndex) {
			if(testStr.charAt(startIndex++) != testStr.charAt(lastIndex--)) 
				return false;	
		}
		return true;
	}
	
	

}
