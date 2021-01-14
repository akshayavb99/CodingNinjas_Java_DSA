/*
Given an array of length N, you need to find and return the sum of all elements of the array. Do this recursively.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces

Output Format :
Sum

Constraints :
1 <= N <= 10^3

Sample Input 1 :
3
9 8 9
Sample Output 1 :
26

Sample Input 2 :
3
4 2 1
Sample Output 2 :
7    
*/

public class SumArray {

	public static int sum(int input[]) {
		
        if (input.length==1)
        {
            return input[0];
        }
        
        int[] smallOutput = new int[input.length-1];
        for (int i=0;i<input.length-1;i++)
        {
            smallOutput[i]=input[i];
        }
        
        int output=input[input.length-1]+sum(smallOutput);
        return output;
	}
}
