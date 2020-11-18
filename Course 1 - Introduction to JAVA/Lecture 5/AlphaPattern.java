/*
Print the following pattern for the given N number of rows.
Pattern for N = 3
A
BB
CCC

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 26

Sample Input 1:
7
Sample Output 1:
A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG

Sample Input 2:
6
Sample Output 2:
A
BB
CCC
DDDD
EEEEE
FFFFFF
*/

import java.util.*;
public class AlphaPattern {

	public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        int ch=65;
        for (int i=0;i<N;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print((char)ch);
            }
            ch++;
            System.out.println(" ");
        }
        scan.close();
		
	}

}
