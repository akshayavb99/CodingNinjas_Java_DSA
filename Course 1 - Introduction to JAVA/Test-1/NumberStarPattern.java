/*
Print the following pattern for given number of rows.
Input format :
Integer N (Total number of rows)
Output Format :
Pattern in N lines
Sample Input :
5
Sample Output :
5432*
543*1
54*21
5*321
*4321
*/

import java.util.*;
public class NumberStarPattern {

	public static void main(String[] args) {
		// Write your code here
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        for (int i=1;i<=N;i++)
        {
            for (int j=N;j>=1;j--)
            {
                if (j==i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(j);
                }
            }
            System.out.println("");
        }

	}
}
