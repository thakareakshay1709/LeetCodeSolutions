package leetcode.challenge.may20;

import java.util.LinkedList;

public class CourseSchedule {

	public static void main(String[] args) 
	{
		int numCourses = 2;
		int[][] prerequisites = {{1,0}};
		System.out.println(canFinish(numCourses, prerequisites));
	}
	
	public static boolean canFinish(int numCourses, int[][] prerequisites) 
	{
	    if(prerequisites == null){throw new IllegalArgumentException("Invalid prerequisites");}
	    int prereq_len = prerequisites.length;
	    if(numCourses == 0 || prereq_len == 0){return true;}
	 
	    // counter for number of prerequisites
	    int[] preq_counter = new int[numCourses];
	    for(int count = 0; count < prereq_len; count++)
	    {
	    	preq_counter[prerequisites[count][0]]++;
	    }
	 
	    //store courses that have no prerequisites
	    LinkedList<Integer> noprereq_store = new LinkedList<Integer>();
	    
	    for(int i = 0; i < numCourses; i++)
	    {
	        if(preq_counter[i] == 0)
	        {
	        	noprereq_store.add(i);
	        }
	    }
	 
	    // number of courses that have no prerequisites
	    int noprereq_counter = noprereq_store.size();
	 
	    while(!noprereq_store.isEmpty())
	    {
	        int top = noprereq_store.remove();
	        
	        for(int i=0; i<prereq_len; i++)
	        {
	            // if a course's prerequisite can be satisfied by a course in queue
	            if(prerequisites[i][1]==top)
	            {
	            	preq_counter[prerequisites[i][0]]--;
	                if(preq_counter[prerequisites[i][0]]==0)
	                {
	                	noprereq_counter++;
	                    noprereq_store.add(prerequisites[i][0]);
	                }
	            }
	        }
	    }
	 
	    return noprereq_counter == numCourses;
	}

}
