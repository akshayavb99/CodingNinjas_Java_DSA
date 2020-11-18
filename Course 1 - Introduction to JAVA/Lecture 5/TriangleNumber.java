/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
22
333
4444

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
22
333
4444
55555

Sample Input 2:
6
Sample Output 2:
1
22
333
4444
55555
666666
*/

import java.util.*;
public class Solution {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        for (int i=0;i<N;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print(i+1);
            }
            System.out.println(" ");
        }
		    scan.close();
	}

}
