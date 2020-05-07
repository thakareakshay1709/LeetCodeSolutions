package leetcode.explore.learn.arrays;

import java.util.Arrays;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
   Hide Hint #1  
You can easily solve this problem if you simply think about two elements at a time rather than two arrays. We know that each of the individual arrays is sorted. What we don't know is how they will intertwine. Can we take a local decision and arrive at an optimal solution?
   Hide Hint #2  
If you simply consider one element each at a time from the two arrays and make a decision and proceed accordingly, you will arrive at the optimal solution.
 * @author akshaythakare
 *
 */
public class MergeSortedArray {

	public static void main(String[] args) 
	{	
		int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
		int m = 3,n = 3;
		merge(nums1, m, nums2, n);
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) 
	{
        for (int i = m,j=0; i < m + n && j < n; i++,j++) 
        {
        	nums1[i] = nums2[j];
		}
        
        Arrays.sort(nums1);
        for (int i = 0; i < nums1.length; i++) 
        {
			System.out.print(nums1[i]+" ");
		}
    }

}
