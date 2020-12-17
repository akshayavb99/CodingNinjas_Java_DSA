package stacks;

import linkedlist.Node;

public class StacksUsingLL<T> {
	private Node<T> head;
	private int size;
	
	public StacksUsingLL()
	{
		head=null;
		size=0;
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	
	public void push(T ele)
	{
		Node<T> newNode=new Node<T>(ele);
		newNode.next=head;
		head=newNode;
		size=size+1;
		
	}
	
	public T pop() throws StackEmptyException
	{
		if (head==null)
		{
			throw new StackEmptyException();
		}
		T topEle=head.data;
		head=head.next;
		size=size-1;
		return topEle;
	}
	
	public T top() throws StackEmptyException
	{
		if (head==null)
		{
			throw new StackEmptyException();
		}
		return head.data;
	}

}
