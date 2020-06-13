package leetcode.explore.learn.arrayandstring;

public class ImplementStrStr {

	public static void main(String[] args) 
	{
		String haystack = "Hello", needle = "ll";
		System.out.println(strStr(haystack, needle));
		

	}
	public static int strStr(String haystack, String needle) {
        int output = -1;
        if(needle.length() == 0 || needle == "")
            return 0;
        output = haystack.indexOf(needle);
        return output;
    }

}
