/*
For a given two-dimensional integer array/list of size (N x M), print the array/list in a sine wave order, i.e, print the first column top to bottom, next column bottom to top and so on.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.
Second line onwards, the next 'N' lines or rows represent the ith row values.
Each of the ith row constitutes 'M' column values separated by a single space.

Output format :
For each test case, print the elements of the two-dimensional array/list in the sine wave order in a single line, separated by a single space.
Output for every test case will be printed in a seperate line.

Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1sec

Sample Input 1:
1
3 4 
1  2  3  4 
5  6  7  8 
9 10 11 12
Sample Output 1:
1 5 9 10 6 2 3 7 11 12 8 4

Sample Input 2:
2
5 3 
1 2 3 
4 5 6 
7 8 9 
10 11 12 
13 14 15
3 3
10 20 30 
40 50 60
70 80 90
Sample Output 2:
1 4 7 10 13 14 11 8 5 2 3 6 9 12 15 
10 40 70 80 50 20 30 60 90 
*/


public class PrintWaves {

	public static void wavePrint(int mat[][]){
		//Your code goes here
        if (mat.length == 0)
        {
            System.out.print("");
        }
        else
        {
            for (int i=0;i<mat[0].length;i++)
        	{
            	if (i % 2 == 0)
            	{
                	for (int j=0;j<mat.length;j++)
                	{
                    	System.out.print(mat[j][i] + " ");
                	}
            	}
            	else
            	{
                	for (int j=mat.length-1;j>=0;j--)
                	{
                    	System.out.print(mat[j][i] + " ");
                	}
            	}
        	}
        }   
	}

}
