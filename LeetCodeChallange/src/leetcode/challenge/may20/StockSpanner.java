package leetcode.challenge.may20;

import java.util.Stack;

public class StockSpanner {

private Stack<int[]> spanstack;

public StockSpanner() 
{
	spanstack = new Stack<>();
}

public int next(int price) 
{
	int evaluatespan = 1;
	while (!spanstack.isEmpty() && price >= spanstack.peek()[0]) 
	{
		evaluatespan += spanstack.pop()[1];
	}
	spanstack.push(new int[]{price, evaluatespan});
	return evaluatespan;
}
	
}


   
