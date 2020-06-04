package leetcode.challenge.may20;

public class PossibleBipartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 3;
		int[][] dislikes = {
				{1,2},{1,3},{2,3}
		};
		System.out.println(possibleBipartition(N, dislikes));
	}
	
	public static boolean possibleBipartition(int N, int[][] dislikes) 
	{
        int[][] grp = new int[N][N];
        for (int[] num : dislikes) 
        {
        	grp[num[0] - 1][num[1] - 1] = 1;
        	grp[num[1] - 1][num[0] - 1] = 1;
        }
        int[] collection = new int[N];
        for (int i = 0; i < N; i++) 
        {
            if (collection[i] == 0 && !dfs(grp, collection, i, 1)) 
            {
                return false;
            }
        }
        return true;
    }
    private static boolean dfs(int[][] grp, int[] collection, int flag, int g) 
    {
    	collection[flag] = g;
        for (int i = 0; i < grp.length; i++) 
        {
            if (grp[flag][i] == 1) 
            {
                if (collection[i] == g) 
                {
                    return false;
                }
                if (collection[i] == 0 && !dfs(grp, collection, i, -g)) 
                {
                    return false;
                }
            }
        }
        return true;
    }


}
