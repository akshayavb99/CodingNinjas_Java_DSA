/*
Sort an array A using Merge Sort. Change in the input array itself. So no need to return or print anything.

Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)

Output format :
Array elements in increasing order (separated by space)

Constraints :
1 <= n <= 10^3

Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8

Sample Input 2 :
5
2 1 5 2 3
Sample Output 2 :
1 2 2 3 5 
*/

public class solution {

	public static void mergeSort(int[] input){
		// Write your code here
        
        if (input.length<=1)
        {
            return;
        }
        int[] b = new int[input.length/2];
        int[] c = new int[input.length-b.length];
        
        for (int i=0;i<input.length/2;i++)
        {
            b[i]=input[i];
        }
        for (int i=input.length/2;i<input.length;i++)
        {
            c[i-(input.length/2)]=input[i];
        }
        
        mergeSort(b);
        mergeSort(c);
        merge(b,c,input);
		
	}
    
    public static void merge(int[] b, int[] c, int[] a)
    {
        int i=0,j=0,k=0;
        while (i<b.length && j<c.length)
        {
            if (b[i]<=c[j])
            {
                a[k]=b[i];
                i++;
            }
            else
            {
                a[k]=c[j];
                j++;
            }
            k++;
        }
        
        while (i<b.length)
        {
            a[k]=b[i];
            i++;
            k++;
        }
        while(j<c.length)
        {
            a[k]=c[j];
            j++;
            k++;
        }
        
    }
}
