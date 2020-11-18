/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
CDE
DEFG

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 13

Sample Input 1:
5
Sample Output 1:
A
BC
CDE
DEFG
EFGHI

Sample Input 2:
6
Sample Output 2:
A
BC
CDE
DEFG
EFGHI
FGHIJK
*/

import java.util.*;

public class CharacterPattern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        for (int i=0;i<N;i++)
        {
            int ch=65+i;
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)ch);
                ch++;
            }
            System.out.println(" ");
        }
		
	}

}
