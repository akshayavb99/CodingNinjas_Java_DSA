/*
Given a decimal number (integer N), convert it into binary and print.
The binary number should be in the form of an integer.
Note : The given input number could be large, so the corresponding binary number can exceed the integer range. So you may want to take the answer as long for CPP and Java.

Input format :
Integer N

Output format :
Corresponding Binary number (long)

Constraints :
0 <= N <= 10^5

Sample Input 1 :
12
Sample Output 1 :
1100

Sample Input 2 :
7
Sample Output 2 :
111
*/

import java.util.*;
import java.lang.*;
public class DecimalToBinary {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        System.out.println(Integer.toString(N, 2));        

	}
}
