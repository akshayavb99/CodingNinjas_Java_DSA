/*
Write a program to print multiplication table of n

Input Format :
A single integer, n

Output Format :
First 10 multiples of n each printed in new line

Constraints :
0 <= n <= 10,000

Sample Input 1 :
2
Sample Output 1 :
2
4
6
8
10
12
14
16
18
20

Sample Input 2 :
5
Sample Output 2 :
5
10
15
20
25
30
35
40
45
50
*/

import java.util.*;
public class MultiplicationTable {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        for (int i=1;i<=10;i++)
        {
            System.out.println(i*n);
        }
        scan.close();
	}
}
