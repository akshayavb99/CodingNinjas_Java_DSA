/*
Given a string S (that can contain multiple words), you need to find the word which has minimum length.
Note : If multiple words are of same length, then answer will be first minimum length word in the string.
Words are seperated by single space only.

Input Format :
String S

Output Format :
Minimum length word

Constraints :
1 <= Length of String S <= 10^5

Sample Input 1 :
this is test string
Sample Output 1 :
is

Sample Input 2 :
abc de ghihjk a uvw h j
Sample Output 2 :
a
*/


public class MinLengthWord {
	
	public static String minLengthWord(String input){
		
		// Write your code here
        String minWord="";
        int prevSpace=0;
        input = " " + input + " ";
        for (int i=1;i<input.length();i++)
        {
            if (input.charAt(i) == ' ')
            {
                String word = input.substring(prevSpace+1,i);
                if (word.length() < minWord.length() || minWord.length() == 0)
                {
                    minWord=word;
                }
                prevSpace=i;
            }
        }
        return minWord;
	}
}
