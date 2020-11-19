/*
Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
Print the prime numbers in different lines.

Input Format :
Integer N

Output Format :
Prime numbers in different lines

Constraints :
1 <= N <= 100

Sample Input 1:
9
Sample Output 1:
2
3
5
7

Sample Input 2:
20
Sample Output 2:
2
3
5
7
11
13
17
19
*/

import java.util.*;
public class AllPrimeNumbers {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        
        outer:for (int i=2;i<=n;i++)
        {
            int flag=0;
            inner:for (int j=2;j<=i;j++)
            {
                if (i%j==0 && i!=j)
                {
                    flag=1;
                    break inner;
                }
            }
            if (flag==0)
            {
                System.out.println(i);
            }
            else
            {
                flag=0;
            }
        }
        scan.close();

		
	}
}
