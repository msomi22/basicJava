/**
 * 
 */
package core.string.rmduplicate;

import java.util.LinkedHashSet;

/**
 * @author peter
 *
 */
public class StringDup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String test = "geeksforgeeks";
		LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
		for(int i=0;i<test.length();i++){
			linkedHashSet.add(test.charAt(i));
		}
		
		for(Character cha : linkedHashSet) System.out.print(cha); 
		
		//--------------------------------------------
		String str = new String();
		for(int i=0;i<test.length();i++){
			if(str.indexOf(test.charAt(i)) < 0) str += test.charAt(i);
		}
		System.out.println("\n--------------------------------------------");
		System.out.println(str);
	

	}

}
