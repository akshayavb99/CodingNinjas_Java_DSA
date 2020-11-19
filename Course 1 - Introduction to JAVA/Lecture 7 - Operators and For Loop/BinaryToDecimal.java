/*
Given a binary number as an integer N, convert it into decimal and print.

Input format :
An integer N in the Binary Format

Output format :
Corresponding Decimal number (as integer)

Constraints :
0 <= N <= 10^9

Sample Input 1 :
1100
Sample Output 1 :
12

Sample Input 2 :
111
Sample Output 2 :
7
*/

import java.util.*;
import java.lang.*;
public class BinaryToDecimal {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        int ans=0;
        int count=0;
        while(N>0)
        {
            int rem=N%10;
            ans=ans+(int)rem*(int)Math.pow(2,count);            
            count=count+1;
            N=N/10;
            /*System.out.println(ans);
            System.out.println(N);
            System.out.println(" ");*/
        }
        System.out.println(ans);
	}
}
