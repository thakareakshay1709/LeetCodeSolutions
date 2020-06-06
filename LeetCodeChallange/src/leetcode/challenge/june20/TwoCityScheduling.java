package leetcode.challenge.june20;

import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling 
{
	public int twoCitySchedCost(int[][] costs) 
	{
        Comparator<int[]> compar = (city1, city2) -> Math.abs(city2[0] - city2[1]) - Math.abs(city1[0] - city1[1]);
        
        Arrays.sort(costs, compar);
        int halfway = costs.length / 2, i = 0;
        int cost1 = 0;
        int cost2 = 0; 
        int res = 0;
                
        while (i < 2 * halfway) 
        {
            if ((costs[i][0] <= costs[i][1] && cost1 < halfway) || cost2 == halfway) 
            {
            	res += costs[i++][0];
                cost1++;
            } 
            else 
            {
            	res += costs[i++][1];
                cost2++;
            }
        }
        return res;
    }
}
