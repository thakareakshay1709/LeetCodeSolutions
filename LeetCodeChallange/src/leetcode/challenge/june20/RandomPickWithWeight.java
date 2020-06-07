package leetcode.challenge.june20;

import java.util.Random;

public class RandomPickWithWeight 
{
	Random rnd;
    int[] weightedAdd;

    public void Solution(int[] w) 
    {
        this.rnd = new Random();
        
        for(int i=1; i<w.length; ++i)
        {
            w[i] += w[i-1];
        }
            
        this.weightedAdd = w;
    }
    
    
    public int pickIndex() 
    {
        int length = weightedAdd.length;
        int index = rnd.nextInt(weightedAdd[length-1]) + 1;
        int lt_w = 0;
        int rt_w = length - 1;
         
        while(lt_w < rt_w)
        {
            int middle = lt_w + (rt_w-lt_w) / 2;
            
            if(weightedAdd[middle] == index)
            {
                return middle;
            }
                
            else if(weightedAdd[middle] < index)
            {
                lt_w = middle + 1;
            }
                
            else
            {
                rt_w = middle;
            }
                
        }
        return lt_w;
    
    }
}
