/*
Given a binary search tree, you have to replace each node's data with the sum of all nodes which are greater or equal than it. You need to include the current node's data also.
That is, if in given BST there is a node with data 5, you need to replace it with sum of its data (i.e. 5) and all nodes whose data is greater than or equal to 5.
Note: You don't need to return or print, just change the data of each node.

Input format:
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.

Output format:
In the output, data of the nodes of the tree are printed in level order form. Each level of the tree is printed on a separate line.

Constraints:
Time Limit: 1 second

Sample Input 1 :
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
Sample Output 1 :
18 
36 10 
38 31 
25 
*/
import java.util.*;
import java.lang.*;
public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		// Write your code here
        replaceWithLargerNodesSum(root,0);
	}
    
    public static int replaceWithLargerNodesSum(BinaryTreeNode<Integer> root, int sum)
    {
        //Base Case
        if(root == null)
			return sum;
        
		//Recursive Case
		sum = replaceWithLargerNodesSum(root.right,sum);
		sum += root.data;
		root.data = sum;
		return replaceWithLargerNodesSum(root.left,sum);
    }
}
