/*
Implement the function RemoveMin for the min priority queue class.
For a minimum priority queue, write the function for removing the minimum element present. Remove and return the minimum element.
Note : main function is given for your reference which we are using internally to test the code.
*/

import java.util.ArrayList;

public class PQ {

	private ArrayList<Integer> heap;

	public PQ() {
		heap = new ArrayList<Integer>();
	}

	boolean isEmpty() {
		return heap.size() == 0;
	}

	int size() {
		return heap.size();
	}

	int getMin() throws PriorityQueueException {
		if (isEmpty()) {
			// Throw an exception
			throw new PriorityQueueException();
		}
		return heap.get(0);
	}

	void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {
			if (heap.get(childIndex) < heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}
	}

	int removeMin() throws PriorityQueueException {
		// Complete this function
		// Throw the exception PriorityQueueException if queue is empty
		if (isEmpty()) {
			// Throw an exception
			throw new PriorityQueueException();
		}
        
        int minEle=getMin();
        
        //Set the last priority element as the new root
        heap.set(0,heap.get(heap.size()-1));
        
        //Remove the last priority element
        heap.remove(heap.size()-1);
        
        //Traverse from root to leaf, and swap values if needed to maintain min. heap order property
        int parentIndex=0;
        int leftChildIndex=2*parentIndex+1,rightChildIndex=2*parentIndex+2;
        while(leftChildIndex < heap.size())
        {
            int minIndex=parentIndex;
            
            if(heap.get(minIndex) > heap.get(leftChildIndex))
            {
                minIndex=leftChildIndex;
            }
            
            if(rightChildIndex < heap.size())
            {
                if(heap.get(minIndex) > heap.get(rightChildIndex))
            	{
                	minIndex=rightChildIndex;
            	}
            }
            
            if(minIndex == parentIndex)
            {
                return minEle;
            }
            
            int temp=heap.get(parentIndex);
            heap.set(parentIndex,heap.get(minIndex));
            heap.set(minIndex,temp);
            
            parentIndex=minIndex;
            leftChildIndex=2*parentIndex+1;
            rightChildIndex=2*parentIndex+2;
        }
        return minEle;
    }
}

class PriorityQueueException extends Exception {

}
