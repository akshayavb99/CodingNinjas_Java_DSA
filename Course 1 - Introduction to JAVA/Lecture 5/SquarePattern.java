/*
Print the following pattern for the given N number of rows.

Pattern for N = 4
4444
4444
4444
4444

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 50

Sample Input 1:
7
Sample Output 1:
7777777
7777777
7777777
7777777
7777777
7777777
7777777

Sample Input 2:
6
Sample Output 2:
666666
666666
666666
666666
666666
666666
*/

import java.util.*;
public class SquarePattern {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(n);
            }
            System.out.println("");
        }
        scan.close();
		
	}

}
