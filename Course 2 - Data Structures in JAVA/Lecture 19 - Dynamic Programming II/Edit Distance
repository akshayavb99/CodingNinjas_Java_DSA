/*
You are given two strings S and T of lengths M and N, respectively. Find the 'Edit Distance' between the strings.
Edit Distance of two strings is the minimum number of steps required to make one string equal to the other. In order to do so, you can perform the following three operations:
1. Delete a character
2. Replace a character with another one
3. Insert a character
Note : Strings don't contain spaces in between.

Input format :
The first line of input contains the string S of length M.
The second line of the input contains the String T of length N.

Output format :
Print the minimum 'Edit Distance' between the strings.

Constraints :
0 <= M <= 10 ^ 3
0 <= N <= 10 ^ 3
Time Limit: 1 sec

Sample Input 1 :
abc
dc
Sample Output 1 :
2
Explanation to the Sample Input 1 :
In 2 operations we can make string T to look like string S.
First, insert character 'a' to string T, which makes it "adc".
And secondly, replace the character 'd' of string T with 'b' from the string S. This would make string T as "abc" which is also string S. 
Hence, the minimum distance.

Sample Input 2 :
whgtdwhgtdg
aswcfg
Sample Output 2 :
9
*/
	
public class Solution {

	public static int editDistance(String s, String t) {
		//Your code goes here
        //Find the lengths of both strings
        int m=s.length();
        int n=t.length();
        
        int[][] dp = new int[m+1][n+1];
        //Initializing dp for iterative approach
        for (int i=n;i>=0;i--)
            dp[m][i]=n-i;
        
        for (int i=m;i>=0;i--)
            dp[i][n]=m-i;
        
        for (int i=m-1;i>=0;i--)
        {
            for (int j=n-1;j>=0;j--)
            {
                if (s.charAt(i)==t.charAt(j))
                {
                    dp[i][j]=dp[i+1][j+1];
                }
                else
                {
                    int ans1=1+dp[i+1][j+1];
                    int ans2=1+dp[i][j+1];
                    int ans3=1+dp[i+1][j];
                    
                    dp[i][j]=Math.min(ans1,Math.min(ans2,ans3));
                }
            }
        }
        return dp[0][0];
    }

}
