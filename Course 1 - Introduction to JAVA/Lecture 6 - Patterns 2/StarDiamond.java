/*
Print the following pattern for the given number of rows.
Note: N is always odd.

Input format :
N (Total no. of rows and can only be odd)

Output format :
Pattern in N lines

Constraints :
1 <= N <= 49

Sample Input 1:
5
Sample Output 1:
  *
 ***
*****
 ***
  *

Sample Input 2:
3
Sample Output 2:
  *
 ***
  *
*/

import java.util.*;
public class StarDiamond {
    public static void main(String[] args) {
        // Write your code here
       
       Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        int spaces=N/2;
        int val=N-2;
        for(int i=0;i<N;i++)
        {
            
            if (i<=(N/2))
            {
                for (int j=0;j<spaces;j++)
            	{
                	System.out.print(" ");
            	}
                spaces--;
                
                for (int j=0;j<(2*i)+1;j++)
            	{
                	System.out.print("*");
            	}
            }
            else
            {
            	spaces++;
                
                for (int j=0;j<=spaces;j++)
            	{
                	System.out.print(" ");
            	}               
                for (int j=0;j<val;j++)
            	{
                	System.out.print("*");
            	}
                val=val-2;
            }
            System.out.println(" ");
        }
        scan.close();
    }
}
