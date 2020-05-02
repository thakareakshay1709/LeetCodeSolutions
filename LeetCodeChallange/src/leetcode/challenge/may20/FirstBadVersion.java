package leetcode.challenge.may20;

/**
 * Problem Statement
 * 
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

*Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

*You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

*Example:

*Given n = 5, and version = 4 is the first bad version.

*call isBadVersion(3) -> false
*call isBadVersion(5) -> true
*call isBadVersion(4) -> true

*Then 4 is the first bad version. 

 * @author akshaythakare
 *
 */
public class FirstBadVersion {
	
	public static void main(String[] arg)
	{
		System.out.println("Hello");
	}

	public int firstBadVersion(int n) 
	{
		int startVersion = 1, endVersion = n;
		
		while(startVersion < endVersion)
		{
			int midVersion = startVersion + (endVersion - startVersion)/2;
			if(isBadVersion(midVersion) == false)
			{
				startVersion = midVersion + 1;
			}
			else
			{
				endVersion = midVersion;
			}
		}
		
		return startVersion;
		
	}
		
	  

	private boolean isBadVersion(int i) {
		// This method was the part of API provided in leetcode
		/* The isBadVersion API is defined in the parent class VersionControl.
	      boolean isBadVersion(int version); */
		return false;
	}


}
