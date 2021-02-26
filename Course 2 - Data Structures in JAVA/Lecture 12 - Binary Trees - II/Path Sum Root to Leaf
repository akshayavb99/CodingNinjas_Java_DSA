/*
For a given Binary Tree of type integer and a number K, print out all root-to-leaf paths where the sum of all the node data along the path is equal to K.

Input Format:
The first line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.
The second line of input contains an integer value K.

Output Format:
Lines equal to the total number of paths will be printed. All the node data in every path will be printed in a linear fashion taken in the order they appear from top to down bottom in the tree. A single space will separate them all.

Constriants:
1 <= N <= 10^5
0 <= K <= 10^8
Where N is the total number of nodes in the binary tree.
Time Limit: 1 second

Sample Input 1:
2 3 9 4 8 -1 2 4 -1 -1 -1 6 -1 -1 -1 -1 -1
13
Sample Output 1:
2 3 4 4 
2 3 8

Sample Input 2:
5 6 7 2 3 -1 1 -1 -1 -1 9 -1 -1 -1 -1
13
Sample Output 2:
5 6 2
5 7 1
*/

import java.util.*;
/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class Solution {

	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		//Your code goes here
        String arr="";
        rootToLeafPathsSumToK(root,k,arr);
	}
    
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k,String arr)
    {
        if (root==null)
        {
            return;
        }
        
        int rootData=root.data;
        //System.out.println("Root data: "+rootData);
        //System.out.println("k: "+k);
        //System.out.println("Old Arraylist: "+arr);
        arr=arr+rootData+" ";
        if(k==rootData && root.left==null && root.right==null)
        {
            //System.out.print("Path found: ");
            //for (int i=0;i<arr.length();i++)
               //System.out.print(arr.charAt(i)+" ");
            //System.out.println();
            System.out.println(arr);
            return;
        }
        //System.out.println();
        
        rootToLeafPathsSumToK(root.left,k-rootData,arr);
        rootToLeafPathsSumToK(root.right,k-rootData,arr);
    }

}
