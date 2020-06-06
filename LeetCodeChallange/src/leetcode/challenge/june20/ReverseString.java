package leetcode.challenge.june20;

public class ReverseString {

	public static void main(String[] args) 
	{
		char[] s = {'h','e','l','l','o'};
		reverseString(s);

	}
	public static void reverseString(char[] s) {
        int first_pointer = 0;
        int next_pointer = s.length -1;
        
        while(first_pointer <= next_pointer)
        {
            char t = s[first_pointer];
            s[first_pointer] = s[next_pointer];
            s[next_pointer] = t;
            
            first_pointer++;
            next_pointer--;
        }
        
        
    }

}
