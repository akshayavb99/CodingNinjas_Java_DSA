/*
A child runs up a staircase with 'n' steps and can hop either 1 step, 2 steps or 3 steps at a time. 
Implement a method to count and return all possible ways in which the child can run-up to the stairs.

Input format :
The first and the only line of input contains an integer value, 'n', denoting the total number of steps.

Output format :
Print the total possible number of ways.

Constraints :
0 <= n <= 10 ^ 4
Time Limit: 1 sec

Sample Input 1:
4
Sample Output 1:
7

Sample Input 2:
10
Sample Output 2:
274
*/
public class Solution {

	public static long staircase(int n) {
		//Your code goes here
        /*
        //If we reach n=0, we have found a path
        if (n==0)
            return 1;
        
        //If n<0, the steps we took till then don't work
        else if(n<0)
            return 0;
        
        return staircase(n-1)+staircase(n-2)+staircase(n-3);        
		*/
               
        if(n<=1)
            return 1;
        if(n==2)
            return 2;
        
        long dpCount[] = new long[n+1];
        dpCount[0]=1;
        dpCount[1]=1;
        dpCount[2]=2;

        
        for (int i=3;i<=n;i++)
        {
            dpCount[i]=dpCount[i-1]+dpCount[i-2]+dpCount[i-3];
                
        }
        return dpCount[n];
	}

}
