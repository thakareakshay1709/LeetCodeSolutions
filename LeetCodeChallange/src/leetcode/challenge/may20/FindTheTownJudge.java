package leetcode.challenge.may20;

class FindTheTownJudge
{
    public int findJudge(int N, int[][] trust) 
    {
	int notFound = -1;
        int[] index = new int[N + 1];
        
        for (int[] judge : trust) 
	    {
            index[judge[0]]--;

            index[judge[1]]++;
        }
        
        for (int foundJudge = 1; foundJudge <= N; foundJudge++) 
	    {
            if (index[foundJudge] == N - 1) 
		    {
               	return foundJudge;
            }
        }
        return notFound;
    }
        
}