package leetcode.challange;

import java.util.Stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
 

Example:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
 

   Hide Hint #1  
Consider each node in the stack having a minimum value. (Credits to @aakarshmadhavan)
 * @author akshaythakare
 *
 */
public class MinStack_Day10 
{
	
	Stack<Integer> stack;
	Stack<Integer> minStackStore;

	 /** initialize your data structure here. */
    public MinStack_Day10() 
    {
    	stack = new Stack<>();
    	minStackStore = new Stack<>();
    }
    
   /* public static void main(String[] args)
    {
    	MinStack minStack = new MinStack();
    	minStack.push(-2);
    	minStack.push(0);
    	minStack.push(-3);
    	System.out.println(minStack.getMin());   //--> Returns -3.
    	minStack.pop();
    	System.out.println(minStack.top());      //--> Returns 0.
    	System.out.println(minStack.getMin());   //--> Returns -2.
    	
    }*/
    
    public void push(int x) 
    {
    	stack.push(x);
    	if (minStackStore.isEmpty())
    	{
    		minStackStore.push(x);
    	}
    	else
    	{
    		minStackStore.push(Math.min(minStackStore.peek(), x));
    	}
    	
    }
    
    public void pop() 
    {
    	stack.pop();
    	minStackStore.pop();
    }
    
    public int top() 
    {
		return stack.peek();
        
    }
    
    public int getMin() {
		return minStackStore.peek();
        
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */


