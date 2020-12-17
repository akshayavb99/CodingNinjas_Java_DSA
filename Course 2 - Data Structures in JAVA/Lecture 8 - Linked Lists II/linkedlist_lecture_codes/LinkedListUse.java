package linkedlist;

import java.util.Scanner;

//DoubleNode class to reverse a linked list with O(n) time complexity
class DoubleNode<T>
{
	Node<T> head;
	Node<T> tail;
	DoubleNode()
	{
		
	}
	
	DoubleNode(Node<T> head, Node<T> tail)
	{
		this.head=head;
		this.tail=tail;
	}
}

//Class to perform different operation using linked lists
public class LinkedListUse {
	
	//Creating a linked list with hard coded inputs -> output is always 10->20->30->40
	public static Node<Integer> createLinkedList()
	{
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		
		//Linking the nodes in the order n1->n2->n3->n4
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		
		//Return head node of LinkedList
		return n1;
		
	}
	
	//Function to print the linked list when passed the head of the linked list as argument
	public static void printLinkedList(Node<Integer> head)
	{
		Node<Integer> n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		//System.out.println(n.data);
		System.out.println();
		
		/*while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println();*/		
	}
	
	//Incrementing the data of a linked list by 1
	public static void incrementData(Node<Integer> head)
	{
		Node<Integer> n = head;
		while(n!=null)
		{
			n.data+=1;
			n=n.next;
		}
	}
	
	//Taking user inputs for data and creating a linked list. Enter -1 if you don't want to enter more data
	public static Node<Integer> inputLL()
	{
		//The end of the linked list is signified by entering -1 as the data to be stored.
		Scanner scan = new Scanner(System.in);
		Node<Integer> head=null;
		System.out.print("Enter the element: ");
		int data=scan.nextInt();
		while(data!=-1)
		{
			Node<Integer> currentNode=new Node<Integer>(data);
			//Check if the currentNode is first node of linked list
			if(head==null)
			{
				head=currentNode;
			}
			else
			{
				Node<Integer> tail=head;
				while(tail.next!=null)
				{
					tail=tail.next;
				}
				//Now tail refers to the last node; now connect current node after last node
				tail.next=currentNode;
			}
			System.out.print("Enter the element: ");
			data=scan.nextInt();
		}
		return head;
		
	}
	
	//Optimizing the creation of a linked list by tracking the linked list with head and tail
	public static Node<Integer> inputLLOptimize()
	{
		//The end of the linked list is signified by entering -1 as the data to be stored.
		Scanner scan = new Scanner(System.in);
		Node<Integer> head=null,tail=null;
		System.out.print("Enter the element: ");
		int data=scan.nextInt();
		while(data!=-1)
		{
			Node<Integer> currentNode=new Node<Integer>(data);
			//Check if the currentNode is first node of linked list
			if(head==null)
			{
				head=currentNode;
				tail=currentNode;
			}
			else
			{
				//Connect tail's reference to the current node
				tail.next=currentNode;
				
				//Update the tail as the current node
				tail=currentNode;
			}
			System.out.print("Enter the element: ");
			data=scan.nextInt();
		}
		return head;
		
	}
	
	//Recursively print a linked list - O(n^2) time complexity
	public static void printRecursive(Node<Integer> head)
	{
		if (head == null)
		{
			return;
		}
		System.out.print(head.data+" ");
		printRecursive(head.next);
		
		//To print the Linked List in reverse order, we need to simply switch the order of the recursive function call and print statement
	}
	
	public static Node<Integer> reverseR(Node<Integer> head)
	{
		//Reverse linked list in O(n^2) due to the while loop to find tail. 
		//Better method is to use the DoubleNode class object and pass the head and tail of the smaller linked list in every recursive function call.
		if (head==null || head.next==null)
		{
			return head;
		}
		Node<Integer> smallHead=reverseR(head.next);
		Node<Integer> node=smallHead;
		while(node.next!=null)
		{
			node=node.next;
		}
		node.next=head;
		head.next=null;
		return smallHead;
	}
	
	//Reversing linked list with O(n) time complexity and using DoubleNode class
	public static DoubleNode<Integer> reverseRBetter(Node<Integer> head)
	{
		DoubleNode<Integer> ans = new DoubleNode<>();
		if (head == null || head.next==null)
		{
			ans.head=head;
			ans.tail=head;
			return ans;
		}
		DoubleNode<Integer> smallAns=reverseRBetter(head.next);
		smallAns.tail.next=head;
		head.next=null;
		ans.head=smallAns.head;
		ans.tail=head;
		return ans;
	}
	
	//Hide the working of double nodes inside this function and use this to call the function reverseRBetter 
	public static Node<Integer> reverseRBetterHide(Node<Integer> head)
	{
		DoubleNode<Integer> ans = reverseRBetter(head);
		return ans.head;
	}
	
	//Best way to reverse linked list - O(n) time complexity
	public static Node<Integer> reverseRBest(Node<Integer> head)
	{
		//Reverse linked list in O(n^2) due to the while loop to find tail. 
		//Better method is to use the DoubleNode class object and pass the head and tail of the smaller linked list in every recursive function call.
		if (head==null || head.next==null)
		{
			return head;
		}
		Node<Integer> smallHead=reverseR(head.next);
		Node<Integer> tail=head.next;
		
		tail.next=head;
		head.next=null;
		return smallHead;
	}
	
	public static Node<Integer> midpointLL(Node<Integer> head)
	{
		if (head==null || head.next==null) //Handling cases where linked list is empty or linked list contains only one node
		{
			return head;
		}
		Node<Integer> slow=head,fast=head;
		while(fast.next!=null && fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> n1=createLinkedList();
		//System.out.println(n1.data);
		//System.out.println((n1.next).data);
		//printLinkedList(n1);
		//printLinkedList(n1.next);
		
		//incrementData(n1);
		//printLinkedList(n1);
		
		//inputLL();
		
		//DoubleNode<Integer> dnObj= reverseRBetter(n1);
		//printLinkedList(dnObj.head);
		
		printLinkedList(reverseRBetterHide(n1));
		
		
	}

}
