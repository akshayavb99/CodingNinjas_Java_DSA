/*
Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135

Input Format :
A single integer: N

Output Format :
Required Pattern

Constraints :
0 <= N <= 50

Sample Input 1 :
3
Sample Output 1 :
135
351
513

Sample Input 2 :
 5
Sample Output 2 :
13579
35791
57913
79135
91357
*/

import java.util.*;
public class OddSquare {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        
        for(int i=0;i<N;i++)
        {
            int val=(2*i)+1;
            for (int j=0;j<N;j++)
            {
                System.out.print(val);
                if (val==(2*N-1))
                {
                    val=1;
                }
                else
                {
                    val=val+2;
                }
            }
            System.out.println(" ");
        }
	}
}
