package stacks;
import java.util.Stack;
public class StackCollectionsUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		int arr[]= {1,2,3,4,5,6,7};
		for (int i:arr)
		{
			stack.push(i);
		}
		
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
	}

}
