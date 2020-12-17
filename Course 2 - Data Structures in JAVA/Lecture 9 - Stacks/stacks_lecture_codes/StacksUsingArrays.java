package stacks;

public class StacksUsingArrays {
	
	private int data[];
	private int topIndex;
	
	//Create Stack of default size 10
	public StacksUsingArrays()
	{
		data=new int[10];
		topIndex=-1;
	}
	
	//Create Stack of user-defined length (variable len)
	public StacksUsingArrays(int len)
	{
		data=new int[len];
		topIndex=-1;
	}
	
	//Check if stack is empty; Time complexity = O(1)
	public boolean isEmpty()
	{
		return topIndex==-1;
	}
	
	//Return stack size (Number of elements in the stack); Time complexity = O(1)
	public int size()
	{
		return topIndex+1;
	}
	
	/*
	 * push() function throwing StackFullException
	//Push element to top of stack; Time complexity = O(1)
	public void push(int elem) throws StackFullException
	{
		if (topIndex==data.length-1)
		{
			//Throw StackFullException
			//StackFullException e = new StackFullException();
			//throw e;
			throw new StackFullException();
			
		}
		data[++topIndex]=elem;
	}
	*/
	
	//push() function with stack capacity expansion if needed; Avoids StackFullException; Time complexity O(n); Space complexity O(n)
	public void push(int elem)
	{
		if (topIndex==data.length-1)
		{
			doubleCapacity();
			
		}
		data[++topIndex]=elem;
	}
	
	//Return top element of the stack; Time complexity = O(1)
	public int top() throws StackEmptyException
	{
		//Throw exception if stack is empty
		if (topIndex==-1)
		{
			throw new StackEmptyException();
		}
		return data[topIndex];
	}
	
	//Return the topmost element of the stack and remove it from the stack; Time complexity = O(1)
	public int pop() throws StackEmptyException
	{
		//Throw exception if stack is empty
		if (topIndex==-1)
		{
			throw new StackEmptyException();
		}
		int temp=data[topIndex];
		topIndex=topIndex-1;
		return temp;
		
	}
	
	//Print all the elements of the stack; Time complexity = O(n)
	public void printStack() throws StackEmptyException
	{
		//Throw exception if stack is empty
		if (topIndex==-1)
		{
			throw new StackEmptyException();
		}
		for (int i=topIndex;i>=0;i--)
		{
			System.out.println(data[i]);
		}
	}
	
	//Empty a stack; Time complexity = O(1)
	public void makeStackEmpty()
	{
		topIndex=-1;
	}
	
	//Doubling the stack capacity if needed to avoid StackFullException; Time complexity O(n); Space complexity O(n)
	private void doubleCapacity()
	{
		int newSize=data.length*2;
		int temp[]=new int[newSize];
		for (int i=0;i<data.length;i++)
		{
			temp[i]=data[i];
		}
		data=temp;
	}
	
	

}
