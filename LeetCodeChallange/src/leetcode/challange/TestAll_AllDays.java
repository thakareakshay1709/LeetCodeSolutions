package leetcode.challange;


/**
 * This class is created to test functionalites of codes
 * @author akshaythakare
 *
 */
public class TestAll_AllDays {

	public static void main(String[] args) 
	{
		int[] arr = {2,7,4,1,8,1};
		LastStoneWeight_Day12 test = new LastStoneWeight_Day12();
		//System.out.println(test.lastStoneWeight(arr));
		
		
		LRUCache_Day24 cache = new LRUCache_Day24( 2 /* capacity */ );

		cache.put(1, 1);
		cache.put(2, 2);
		System.out.println(cache.get(1));       // returns 1
		cache.put(3, 3);    // evicts key 2
		System.out.println(cache.get(2));       // returns -1 (not found)
		cache.put(4, 4);    // evicts key 1
		System.out.println(cache.get(1));       // returns -1 (not found)
		System.out.println(cache.get(3));       // returns 3
		System.out.println(cache.get(4));       // returns 4
	}

}
