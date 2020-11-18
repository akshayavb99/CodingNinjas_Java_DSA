/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints :
0 <= N <= 50

Sample Input 1:
5
Sample Output 1:
55555 
4444
333
22
1

Sample Input 2:
6
Sample Output 2:
666666
55555 
4444
333
22
1
*/

import java.util.*;

public class InvertedTriangleNum {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    int N=scan.nextInt();
    for (int i=0;i<N;i++)
    {
        int val=1;
        for (int j=0;j<(N-i-1);j++)
        {
            System.out.print(" ");
        }
        
        for (int j=0;j<=i;j++)
        {
            System.out.print(val);
            val++;
        }
        System.out.println(" ");
    }
    scan.close();
		
	}

}
