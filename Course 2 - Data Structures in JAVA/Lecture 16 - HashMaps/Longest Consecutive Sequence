/*
You are given an array of unique integers that contain numbers in random order. You have to find the longest possible sequence of consecutive numbers using the numbers from given array.
You need to return the output array which contains starting and ending element. If the length of the longest possible sequence is one, then the output array must contain only single element.
Note:
1. Best solution takes O(n) time.
2. If two sequences are of equal length, then return the sequence starting with the number whose occurrence is earlier in the array.

Input format:
The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol n.
The following line contains n space separated integers, that denote the value of the elements of the array.

Output format:
The first and only line of output contains starting and ending element of the longest consecutive sequence. If the length of longest consecutive sequence, then just print the starting element.

Constraints :
0 <= n <= 10^6
Time Limit: 1 sec

Sample Input 1 :
13
2 12 9 16 10 5 3 20 25 11 1 8 6 
Sample Output 1 :
8 12 

Sample Input 2 :
7
3 7 2 1 9 8 41
Sample Output 2 :
7 9
Explanation: Sequence should be of consecutive numbers. Here we have 2 sequences with same length i.e. [1, 2, 3] and [7, 8, 9], but we should select [7, 8, 9] because the starting point of [7, 8, 9] comes first in input array and therefore, the output will be 7 9, as we have to print starting and ending element of the longest consecutive sequence.

Sample Input 3 :
7
15 24 23 12 19 11 16
Sample Output 3 :
15 16
*/
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();
        HashMap<Integer, Integer> lenMap = new HashMap<>();
        for (int i=0;i<arr.length;i++)
        {
            map.put(arr[i],true);
        }
        int maxStart=-1,maxLen=0;
        boolean startCheck=true;
        
        for (int i: arr)
        {
            if (map.get(i))
            {
                int currStart=i,currLen=1;
                //System.out.println("Current start of sequence: "+currStart);
                //System.out.println("Current length of sequence: "+currLen);
                boolean flag=true;
                map.put(i,false);
                
                int ahead=i+1;
                //System.out.println("Checking for values ahead");
                //System.out.println();
                while(flag)
                {
                    if(map.containsKey(ahead))
                    {
                        //System.out.println(ahead+" is included in sequence and status updates to false");
                        currLen=currLen+1;
                        map.put(ahead,false);
                        ahead=ahead+1;
                        //System.out.println("Current length of sequence: "+currLen);
                    }
                    else
                    {
                     	flag=false;   
                    }
                }
               flag=true; 
               int before=i-1;
               //System.out.println();
               //System.out.println("Checking for values before");
                while(flag)
                {
                    if(map.containsKey(before))
                    {
                        //System.out.println(before+" is included in sequence and status updates to false");
                        currLen=currLen+1;
                        currStart=before;
                        map.put(before,false);
                        before=before-1;
                        //System.out.println("Current length of sequence: "+currLen);
                    }
                    else
                    {
                     	flag=false;   
                    }
                }
               
               System.out.println();
               if (currLen>=maxLen)
               {
                   maxLen=currLen;
                   maxStart=currStart;   
                   lenMap.put(maxStart,maxLen); 
               }
            }
            /*
            else
            {
                System.out.println("Element already considered in previous sequence");
            }
            System.out.println();
            */
        }
        
        //System.out.println("Current start point and length: "+ maxStart+", "+maxLen);
        /*
        for (Integer i: lenMap.keySet())
        {
            System.out.println(i+": "+lenMap.get(i));
        }
        System.out.println();
        */
        
        
        for (int i=0;i<arr.length;i++)
        {
            if (lenMap.containsKey(arr[i]) && lenMap.get(arr[i])>=maxLen)
            {
                maxStart=arr[i];
                maxLen=lenMap.get(arr[i]);
                break;
            }
        }
        output.add(maxStart);
        output.add(maxStart+maxLen-1);
        return output;
    }
}
