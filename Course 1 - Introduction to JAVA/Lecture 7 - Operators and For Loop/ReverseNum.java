/*
Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.

Input format :
Integer N

Output format :
Corresponding reverse number

Constraints:
0 <= N < 10^8

Sample Input 1 :
1234
Sample Output 1 :
4321

Sample Input 2 :
1980
Sample Output 2 :
891
*/

import java.util.*;
public class ReverseNum {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        int rev=0;
        while(N>0)
        {
            int rem=N%10;
            //System.out.println(rem);
            rev=rev+rem;
            N=N/10;
            if (N>0)
            {
            	rev=rev*10;
            }
            /*System.out.println(rev);
            System.out.println(N);
            System.out.println(" ");*/
        }
        System.out.println(rev);
	}
}
