import java.util.*;
import java.io.*;

public class Heap {

	private MaxHeap max = new MaxHeap();
	private MinHeap min = new MinHeap();
	//maxNext became unused after revisions
	private boolean maxNext = true;

	public void add(int n) {
		max.add(n);
		if (!maxNext)
			min.add(max.remove());
		maxNext = !maxNext;
	}

	public int findMedian() {
		int x = max.getSize();
		int y = min.getSize();
		if (x>y)
			return max.getTop();
		else if (y>x)
			return min.getTop();
		else
			return (min.getTop() + max.getTop()) / 2;
	}

	public int removeMedian() {
		int x = findMedian();
		if (x == max.getTop()) {
			maxNext = true;
			return max.remove();
		}
		else if (x == min.getTop()) {
			maxNext = false;
			return min.remove();
		}
		else
			return x;
	}

}
