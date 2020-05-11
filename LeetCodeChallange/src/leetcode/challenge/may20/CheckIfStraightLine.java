package leetcode.challenge.may20;

public class CheckIfStraightLine 
{

	public static void main(String[] args) 
	{
		int[][] coordinates = {
				{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}
		};
		System.out.println(checkStraightLine(coordinates));
	}
	
	public static boolean checkStraightLine(int[][] coordinates) 
	{
		double x1 = coordinates[0][0];
		double y1 = coordinates[0][1];
		
		int totalCoordinates = coordinates.length;
		//System.out.println("X1 = "+x1+" Y1 = "+y1+" total="+totalCoordinates);
		Double firstSlope = null;
		
		for (int i = 1; i < totalCoordinates; i++) 
		{
			double x2 = coordinates[i][0];
			double y2 = coordinates[i][1];
			
			if(x2 - x1 == 0)
			{
				return false;
			}
			
			
			if(firstSlope == null)
			{
				firstSlope = (y2 - y1)/(x2 - x1);
				continue;
			}
			
			double nextSlope = (y2 - y1)/(x2 - x1);
			if(firstSlope != nextSlope)
			{
				return false;
			}
			
		}
        return true;
    }

}
