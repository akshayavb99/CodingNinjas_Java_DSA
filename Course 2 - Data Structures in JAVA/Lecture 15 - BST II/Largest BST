/*
Given a Binary tree, find the largest BST subtree. That is, you need to find the BST with maximum height in the given binary tree. You have to return the height of largest BST.

Input format :
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.

Output format:
The first and only line of output contains the height of the largest BST.

Constraints:
Time Limit: 1 second

Sample Input 1:
5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output 1:
2
*/
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
	
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here
        if (root==null)
            return 0;
        
        if (isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE))
            return findHeight(root);
        else
        {
        	return Math.max(largestBSTSubtree(root.left),largestBSTSubtree(root.right));
        }
            
	}
    
    private static int findHeight(BinaryTreeNode<Integer> root)
    {
        if (root==null)
            return 0;
        
        if (root.left==null && root.right==null)
            return 1;
        
        return Math.max(findHeight(root.left),findHeight(root.right))+1;
    }
    
    private static boolean isBST(BinaryTreeNode<Integer> root, int min, int max)
    {
        if(root == null)
			return true;
		
        if(root.data < min || root.data > max)
			return false;
		else
			return isBST(root.left,min,root.data -1) && isBST(root.right,root.data +1,max);
    }

}
