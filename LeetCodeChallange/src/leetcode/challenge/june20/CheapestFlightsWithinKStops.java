package leetcode.challenge.june20;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class CheapestFlightsWithinKStops {
	public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) 
    {
       Map<Integer, Map<Integer, Integer>> rates = new HashMap<>();
        
       for (int[] fly : flights) 
       {
           if (!rates.containsKey(fly[0])) rates.put(fly[0], new HashMap<>());
           rates.get(fly[0]).put(fly[1], fly[2]);
       }
        
       Queue<int[]> priQ = new PriorityQueue<>((a, b) -> (Integer.compare(a[0], b[0])));
       priQ.add(new int[] {0, src, k + 1});
       while (!priQ.isEmpty()) {
           int[] top = priQ.remove();
           int price = top[0];
           int city = top[1];
           int stops = top[2];
           if (city == dst) 
               return price;
           if (stops > 0) 
           {
               Map<Integer, Integer> adj = rates.getOrDefault(city, new HashMap<>());
               for (int a : adj.keySet()) 
               {
                   priQ.add(new int[] {price + adj.get(a), a, stops - 1});
               }
           }
       }
       return -1;
   }

}
