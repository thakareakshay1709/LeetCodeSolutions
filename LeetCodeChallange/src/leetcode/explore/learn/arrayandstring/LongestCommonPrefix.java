package leetcode.explore.learn.arrayandstring;

public class LongestCommonPrefix {

	public static void main(String[] args) 
	{
		//String[] strs = {"flower","flow","flight"};
		String[] strs = {"",""};
		String prefix = longestCommonPrefix(strs);
		System.out.println(prefix);
	}

	public static String longestCommonPrefix(String[] strs) {
		String minLen = null;
		StringBuilder out = new StringBuilder();
		if (strs.length == 0)
			return "";
		else if (strs.length == 1)
			return strs[0];
		
		int shortest = strs[0].length();
		for (int i = 0; i < strs.length; i++) {
			shortest = Math.min(shortest, strs[i].length());
			if(strs[i].length() == shortest)
				minLen = strs[i];
		}
		System.out.println("Shortest str = "+minLen+" sh="+shortest);
		
		int counter = 0;
		for (int i = 0; i < strs.length; i++) {
			if (shortest > 0 && minLen.charAt(i) == strs[i].charAt(i))
			{
				out.append(minLen.charAt(i));
				counter++;
			}
			else
				break;
		}
		System.out.println(counter);
		return out.toString();
	}
	
	public static String longestCommonPrefix2(String[] strs) {
	    if(strs==null || strs.length ==0){
	        return "";
	    }
	 
	    if(strs.length == 1){
	        return strs[0];
	    }
	 
	    int i=0;
	    while(true){
	        boolean flag = true;
	        for(int j=1; j<strs.length; j++){
	            if(strs[j].length()<=i || strs[j-1].length() <=i 
	               || strs[j].charAt(i) != strs[j-1].charAt(i)){
	                flag = false;
	                break;
	            }               
	        }
	 
	        if(flag){
	            i++;
	        }else{
	            break;
	        }
	    }
	 
	    return strs[0].substring(0, i);
	}

}
