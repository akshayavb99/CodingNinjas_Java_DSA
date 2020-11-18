/*
Write a program to print triangle of user defined integers sum.

Input Format :
A single integer, N

Output Format :
Required Pattern

Constraints :
0 <= N <= 50

Sample Input 1 :
3
Sample Output 1 :
1=1
1+2=3
1+2+3=6

Sample Input 2 :
 5
Sample Output 2 :
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15
*/

import java.util.*;
import java.lang.*;
public class SumPattern {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        
        outer_loop:for(int i=1;i<=N;i++)
        {
            int sum=1;
            if (i==1)
            {
                System.out.println("1=1");
                continue outer_loop;
            }
            else
            {
                System.out.print("1+");
            }
            
            inner:for (int j=2;j<=i;j++)
            {
                sum=sum+(j);
                System.out.print(j);
                if (j<i)
                {
                    System.out.print("+");
                }
                else
                {
                    System.out.println("="+sum);
                    break inner;
                }
            }
        }
	}
}
