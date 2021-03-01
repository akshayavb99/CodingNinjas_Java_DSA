/*
Given a binary search tree and an integer S, find pair of nodes in the BST which sum to S. You can use extra space of the order of O(log n).
Note:
1. Assume BST contains all unique elements.
2. In a pair, print the smaller element first.

Input Format :
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.   
The following line of input contains an integer, that denotes the value of S.

Output format:
You have to print each pair in a different line (pair elements separated by space). The order of different pairs, to be printed, does not matter.

Constraints:
Time Limit: 1 second   

Sample Input 1:
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
12
Sample Output 1:
2 10
5 7
*/
import java.util.*;
public class Solution {
	/*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	
	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		// Write your code here
        if (root==null)
            return;
        else
        {
            ArrayList<Integer> arr = convertToArray(root);
        	Collections.sort(arr);
            //for (int i=0;i<arr.size();i++)
            //{
            //    System.out.print (arr.get(i)+" ");
            //}
            //System.out.println();
        	printPairSum(arr,s);
        }
        
	}
    
    private static ArrayList<Integer> convertToArray(BinaryTreeNode<Integer> root)
    {
        if (root==null)
        {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            return arr;
        }
        
        
        ArrayList<Integer> currArr = new ArrayList<Integer>();
        ArrayList<Integer> leftArr = convertToArray(root.left);
        if (!leftArr.isEmpty())
        {
            currArr.addAll(leftArr);
        }
        
        currArr.add(root.data);
        
        ArrayList<Integer> rightArr = convertToArray(root.right);
        if (!rightArr.isEmpty())
        {
            currArr.addAll(rightArr);
        }
        return currArr;
    }
    
    private static void printPairSum(ArrayList<Integer> arr, int s)
    {
        int i=0,j=arr.size()-1;
        while(i<j)
        {
            int val1=arr.get(i);
            int val2=arr.get(j);
            if (val1+val2>s)
            {
                j=j-1;
            }
            else if(val1+val2<s)
            {
                i=i+1;
            }
            else
            {
                System.out.println(val1+" "+val2);
                i=i+1;
                j=j-1;
            }
                
        }
    }

}
