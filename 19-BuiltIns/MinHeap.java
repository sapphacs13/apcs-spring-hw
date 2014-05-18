import java.util.*;
import java.io.*;

public class MaxHeap {

    //   private Node head;
    private int[] nums = new int[20];
	private int size = 0;

    
    public void grow() {
	int[] temp = new int[nums.length + nums.length/2];
	for (int i = 0; i<nums.length; i++)
	    temp[i] = nums[i];
	nums = temp;
    }

    public int next() {
	int i = 1;
	while (i < nums.length && nums[i] != 0)
	    i++;
	return i;
    }

    public void add(int x) {
	int n  = next();
	if (n == nums.length)
		grow();
	int temp;
	nums[n] = x;
	while (nums[n] > nums[n/2] && n > 1) {
	    temp = nums[n/2];
	    nums[n/2] = nums[n];
	    nums[n] = temp;
	    n = n/2;
	}
	size++;
    }

    

    public int remove(){
	int temp = nums[1];
	nums[1] = 0;
	int n = next() - 1;
	nums[1] = nums[n];
	nums[n] = 0;
	descend(1);
	size--;
	return temp;
   }


	public void descend(int n) {
		if (nums[n] < nums[n*2] || nums[n] < nums[n*2+1]) {
			if (nums[n*2] > nums[n*2+1]) {
				int temp = nums[n];
				nums[n] = nums[n*2];
				nums[n*2] = temp;
				descend(n*2);
			}
			else {
				int temp = nums[n];
				nums[n] = nums[n*2+1];
				nums[n*2+1] = temp;
				descend(n*2+1);
			}
		}		
	}

	public String toString() {
		String result = "";
		for (int i = 1; i<nums.length && nums[i] != 0; i++) {
			result = result + nums[i] + " ";
		}
		return result;
	}

	public int[] sort() {
		int[] result = new int[nums.length];
		for (int i = 0; nums[1] != 0; i++)
			result[i] = remove();
		for (int i = 0; i < result.length; i++)
			add(result[i]);
		return result;
	}

	public int getSize() {
		return size;
	}

	public int getTop() {
		return nums[1];
	}

}
