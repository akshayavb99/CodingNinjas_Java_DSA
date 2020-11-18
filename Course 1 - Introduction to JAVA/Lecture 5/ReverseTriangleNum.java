/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
4321

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 50

Sample Input 1:
5
Sample Output 1:
1
21
321
4321
54321

Sample Input 2:
6
Sample Output 2:
1
21
321
4321
54321
654321
*/

import java.util.*;
public class ReverseTriangleNum {


	public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        for(int i=0;i<N;i++)
        {
            int val=i+1;
            for (int j=0;j<=i;j++)
            {
                System.out.print(val);
                val--;
            }
            System.out.println(" ");
        }
		
	}

}
