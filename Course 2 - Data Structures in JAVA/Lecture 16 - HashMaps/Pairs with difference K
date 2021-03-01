/*
You are given with an array of integers and an integer K. You have to find and print the count of all such pairs which have difference K.
Note: Take absolute difference between the elements of the array.

Input Format:
The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol n.
The following line contains n space separated integers, that denote the value of the elements of the array.
The following line contains an integer, that denotes the value of K.

Output format :
The first and only line of output contains count of all such pairs which have an absolute difference of K. 

Constraints :
0 <= n <= 10^4
Time Limit: 1 sec

Sample Input 1 :
4 
5 1 2 4
3
Sample Output 1 :
2

Sample Input 2 :
4
4 4 4 4 
0
Sample Output 2 :
6
*/
import java.util.HashMap;
public class Solution {

	public static int getPairsWithDifferenceK(int arr[], int k) {
		//Write your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int key:arr)
        {	
            if(map.containsKey(key))
        	{
            	map.put(key,map.get(key)+1);
        	}
            else
            {
                map.put(key,1);
            }   
        }
        /*
        for (Integer i: map.keySet())
        {
            System.out.println(i + ": " + map.get(i));
        }
        System.out.println();
        */
        int countPairs=0;
        if (k==0)
        {
            for (Integer i: map.keySet())
        	{
                int val=map.get(i);
            	countPairs=countPairs+(val*(val-1))/2;
        	}
            return countPairs;
        }
        
        for (Integer i: map.keySet())
        {
            //System.out.println("Current element: "+i);
            //System.out.println("Need to find: "+(i-k)+", "+(i+k));
            if (map.containsKey(k+i))
            {
                //System.out.println("Found " + (k+i));
            	countPairs=countPairs+(map.get(i)*map.get(k+i));   
                //System.out.println("Current count of pairs: "+countPairs);
            }
            if (map.containsKey(i-k))
            {
                //System.out.println("Found " + (i-k));
            	countPairs=countPairs+(map.get(i)*map.get(i-k));   
                //System.out.println("Current count of pairs: "+countPairs);
            }
            //System.out.println();
        }
        countPairs=countPairs/2;
        return countPairs;
	}
}
