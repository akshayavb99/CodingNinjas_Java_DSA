/*
Print the following pattern

Input Format :
N (Total no. of rows)

Output Format :
Pattern in N lines

Constraints :
0 <= N <= 50

Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
Sample Input 2 :
4
Sample Output 2 :
    *
   *** 
  *****
 *******
*/

import java.util.*;

public class StarPattern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        
        for (int i=0;i<N;i++)
        {
            for (int j=0;j<(N-i-1);j++)
            {
                System.out.print(" ");
            }
            
            for (int j=1;j<=((2*i)+1);j++)
        	{
                System.out.print("*");   
            }
            System.out.println(" ");
        }
        scan.close();
	}

}
