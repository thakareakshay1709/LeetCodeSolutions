package leetcode.explore.learn.arrays;

public class ReplaceElementsOnRightSide {

	public static void main(String[] args) 
	{
		int[] arr = {17,18,5,4,6,1};
		arr = replaceElements(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	 public static int[] replaceElements(int[] arr) 
	 {
		 if(arr.length == 1)
		 {
			 arr[0] = -1;
			 return arr;
		 }
		int maxSoFar = -1;
		 
		 for (int i = arr.length -1; i >= 0; i--) 
		 {
			//System.out.print(arr[i]+" ");17,18,5,4,6,1
			 if(i >= 0)
			 {
				 int t = arr[i];
				 arr[i] = maxSoFar;
				 maxSoFar = Math.max(maxSoFar, t);
			 }
		 }
		 //System.out.println();
		 return arr;
		 
		
		/*
		 * int maxSoFar = arr[arr.length - 1]; arr[arr.length - 1] = -1; for (int i =
		 * arr.length -2; i >= 0; i--) { //System.out.print(arr[i]+" ");17,18,5,4,6,1
		 * maxSoFar = Math.max(maxSoFar, arr[i]); arr[i] = maxSoFar; }
		 * System.out.println(); return arr;
		 */
	 }

}
