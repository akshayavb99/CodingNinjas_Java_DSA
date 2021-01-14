/*
Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false. Do this recursively.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x

Output Format :
'true' or 'false'

Constraints :
1 <= N <= 10^3

Sample Input 1 :
3
9 8 10
8
Sample Output 1 :
true

Sample Input 2 :
3
9 8 10
2
Sample Output 2 :
false
*/

public class CheckNumArray {
	
	public static boolean checkNumber(int input[], int x) {
        if (input.length==1)
        {
            if (input[0]==x)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if (input[input.length-1]==x)
        {
            return true;
        }
        int[] smallCheck = new int[input.length-1];
        for (int i=0;i<input.length-1;i++)
        {
            smallCheck[i]=input[i];
        }
        boolean output=checkNumber(smallCheck,x);
        return output;
	}
}
