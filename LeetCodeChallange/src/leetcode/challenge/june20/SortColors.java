package leetcode.challenge.june20;

public class SortColors {

	 public void sortColors(int[] nums) {
		    if(nums==null || nums.length < 2)
		    {
		        return;
		    }
		 
		    int[] colorArray = new int[3];
		    for(int i = 0; i < nums.length; i++)
		    {
		        colorArray[nums[i]]++;
		    }
		 
		    int jada = 0, kam = 0;
		    while(jada <= 2)
		    {
		        if(colorArray[jada]!=0)
		        {
		            nums[kam++]=jada;
		            colorArray[jada] = colorArray[jada]-1;
		        }
		        else
		        {
		            jada++;
		        }
		    }
		}
}
