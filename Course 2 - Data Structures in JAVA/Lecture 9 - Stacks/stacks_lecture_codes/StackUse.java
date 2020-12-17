package stacks;

public class StackUse {

	public static void main(String[] args) throws StackFullException,StackEmptyException //Not a very good method as the exception will be thrown
	// on the console, but for now it is OK.
	{
		// TODO Auto-generated method stub
		/*StacksUsingArrays stack=new StacksUsingArrays();
		stack.push(10);
		System.out.println(stack.size());
		stack.push(20);
		stack.push(30);
		System.out.println(stack.pop());
		System.out.println(stack.top());
		System.out.println(stack.isEmpty());
		stack.printStack();
		
		int arr[]= {1,2,3,4,5,6,7};
		for (int i=0;i<arr.length;i++)
		{
			stack.push(arr[i]);
		}
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(stack.pop());
		}*/
		
		StacksUsingLL<Integer> stack=new StacksUsingLL<Integer>();
		stack.push(10);
		System.out.println(stack.size());
		stack.push(20);
		stack.push(30);
		System.out.println(stack.pop());
		System.out.println(stack.top());
		System.out.println(stack.isEmpty());
		
		int arr[]= {1,2,3,4,5,6,7};
		for (int i=0;i<arr.length;i++)
		{
			stack.push(arr[i]);
		}
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(stack.pop());
		}
		

	}

}
