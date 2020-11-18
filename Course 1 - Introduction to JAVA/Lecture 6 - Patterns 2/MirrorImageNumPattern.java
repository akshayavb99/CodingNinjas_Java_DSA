/*
Print the following pattern for the given N number of rows.

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 50

Sample Input 1:
3
Sample Output 1:
  1 
 12
123

Sample Input 2:
4
Sample Output 2:
   1 
  12
 123
1234
*/

import java.util.*;

public class MirrorImageNumPattern {
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
