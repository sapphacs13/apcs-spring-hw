//doesn't sort properly, but I'm working on it

import java.io.*;
import java.util.*;

public class QuickSort2{//classwork

    private Random rnd = new Random();
    
    public int partition(int[] a, int l, int r){
	int tmp;
	int pivotIndex = l + rnd.nextInt(r - l);
	int pivot = a[pivotIndex];
	tmp = a[r];
	a[r] = a[pivotIndex];
	a[pivotIndex] = tmp;
	int wall = l;
	for (int i = l; i < r; i ++) {
	    if (a[i] < pivot) {
		tmp = a[i];
		a[i] = a[wall];
		a[wall] = tmp;
		wall ++;
	    }
	}
	tmp = a[wall];
	a[wall] = a[r];
	a[r] = tmp;
	return wall;
    }
    
    public int[] qsort(int[] a, int l, int r){
	if (r - l <= 1){
	    return a;
	}
	else{
	    int pi = partition(a, l, r);
	    if ((pi - 1) > l)
		return qsort(a, l, pi - 1);
	    else{//((pi + 1) < r)
		return qsort(a, pi, r);
	    }
	}
    }

    public void qsort(int[] a) {
	qsort(a, 0, (a.length - 1));
    }
	
    public static void main(String[] args) {
	int n = 100;
	Random rnd = new Random();
	int[] a = new int[n];
	for (int i = 0; i < n; i ++)
	    a[i] = rnd.nextInt(100);
	QuickSort2 q = new QuickSort2();
	q.qsort(a);
	System.out.println(Arrays.toString(a));
    }

}
