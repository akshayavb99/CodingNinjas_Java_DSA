/*
Print the following pattern for the given number of rows.

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints :
0 <= N <= 50

Sample Input 1:
5
Sample Output 1:
    1
   232
  34543
 4567654
567898765

Sample Input 2:
4
Sample Output 2:
   1
  232
 34543
4567654
*/

import java.util.Scanner;

public class TriangleOfNumbers {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        
        for (int i=0;i<N;i++)
        {
            int val=i+1;
            for (int j=0;j<(N-i-1);j++)
            {
                System.out.print(" ");
            }
            
            for (int j=0;j<=i;j++)
            {
                System.out.print(val);
                val++;
            }
            val--;
            
            for (int j=0;j<i;j++)
            {
                --val;
                System.out.print(val);
            }
            System.out.println(" ");
        }
        scan.close();
	}
}
