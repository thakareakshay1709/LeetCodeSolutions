package leetcode.challenge.april20;

/**
 * Given a string containing only three types of characters: '(', ')' and '*', write a function to check whether this string is valid. We define the validity of a string by these rules:

Any left parenthesis '(' must have a corresponding right parenthesis ')'.
Any right parenthesis ')' must have a corresponding left parenthesis '('.
Left parenthesis '(' must go before the corresponding right parenthesis ')'.
'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
An empty string is also valid.
Example 1:
Input: "()"
Output: True
Example 2:
Input: "(*)"
Output: True
Example 3:
Input: "(*))"
Output: True
Note:
The string size will be in the range [1, 100].
 * @author akshaythakare
 *
 */
public class ValidParenthesisString_Day16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "";
		//System.out.println(checkValidString2(input));
		
		System.out.println(checkValidString(input));

	}
	
	  private static boolean checkValidString(String input) 
	  {
		  if(input.length() == 0 || input == null)
		  {
			  return true;
		  }
		  
		  int rightPara = 0, leftPara = 0;
		  
		  for (int i = 0; i < input.length(); i++) 
		  {
			  char c = input.charAt(i);
			  if(c == '(')
			  {
				  leftPara++;
				  rightPara++;
			  }
			  
			  
			  System.out.println(c);
		  }
		
		return false;
	  }

	public static boolean checkValidString2(String input) 
	{
	        if (input == null || input.length() == 0) 
	        {
	            return true;
	        }
	 
	        int l_par = 0;
	        
	        int r_par = 0;
	        
	        for (int i = 0; i < input.length(); i++) 
	        {
	            char c = input.charAt(i);
	 
	            if (c == '(') 
	            {
	            	l_par++;
	            	r_par++;
	            } 
	            else if (c == ')') 
	            {
	                if (l_par > 0) 
	                {
	                	l_par--;
	                }
	                r_par--;
	            } 
	            else 
	            {
	                if (l_par > 0) 
	                {
	                	l_par--;
	                }
	                r_par++;
	            }
	 
	            if (r_par < 0) 
	            {
	                return false;
	            }
	        }
	 
	        return l_par == 0;
	    }

}
