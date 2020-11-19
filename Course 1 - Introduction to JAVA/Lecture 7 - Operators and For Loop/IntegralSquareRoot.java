/*
Given a number N, find its square root. You need to find and print only the integral part of square root of N.
For eg. if number given is 18, answer is 4.

Input format :
Integer N

Output Format :
Square root of N (integer part only)

Constraints :
0 <= N <= 10^8

Sample Input 1 :
10
Sample Output 1 :
3

Sample Input 2 :
4
Sample Output 2 :
2
*/

import java.util.*;
public class IntegralSquareRoot {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        if (N==0)
        {
         	System.out.println("0");   
        }
        else
        {
            double num;
			double half = (double)N/2;
			do {
				num = half;
				half = (num+(N / num)) / 2;
				} while ((num - half) != 0);
		
        	System.out.println((int)half);
        }
        

	}
}
