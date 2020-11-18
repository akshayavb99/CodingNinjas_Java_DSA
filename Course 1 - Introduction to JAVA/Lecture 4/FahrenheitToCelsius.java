/*
Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
Input Format :
3 integers - S, E and W respectively 

Output Format :
Fahrenheit to Celsius conversion table. One line for every Fahrenheit and corresponding Celsius value. On Fahrenheit value and its corresponding Celsius value should be separate by tab ("\t")

Constraints :
0 <= S <= 80
S <= E <=  900
0 <= W <= 40 

Sample Input 1:
0 
100 
20
Sample Output 1:
0   -17
20  -6
40  4
60  15
80  26
100 37

Sample Input 2:
20
119
13
Sample Output 2:
20  -6
33  0 
46  7
59  15
72  22
85  29
98  36
111 43

Explanation For Input 2:
We need need to start calculating the Celsius values for each of the Fahrenheit Value which starts from 20. 
So starting from 20 which is the given Fahrenheit start value, we need to compute its corresponding Celsius value which computes to -6. 
We print this information as <Fahrenheit Value> a tab space"\t" <Celsius Value> on each line for each step of 13 we take to get the next value of Fahrenheit and extend this idea till we reach the end that is till 119 in this case.
You may or may not exactly land on the end value depending on the steps you are taking.
*/

import java.util.*;
public class FahrenheitToCelsius {


	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
        int e = scan.nextInt();
        int w = scan.nextInt();
        while (s <= e)
        {
            int c = (s-32)*5/9;
            System.out.println (s+"\t"+c);
            s=s+w;
        }
        scan.close();
	}

}
