package leetcode.explore.learn.arrays;

public class ReverseString {

	public static void main(String[] args) {
		
		char[] s = {'h','e','l','l','o'};
		reverseString(s);
		

	}
	public static void reverseString(char[] s)
	{
		int last = s.length-1, first = 0;
		while(first < last)
		{
			s = swap(s,first,last);
			
			first++;
			last--;
		}
		System.out.println(first+" "+last);
		for (char c : s)
		{
			System.out.print(c+" ");
		}
	}
	public static char[] swap(char[] s, int first, int last) {
		
		char temp = s[first];
		s[first] = s[last];
		s[last] = temp;
		
		return s;
	}
}
