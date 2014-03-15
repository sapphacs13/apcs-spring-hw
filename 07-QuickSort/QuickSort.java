import java.util.*;
import java.io.*;

public class QuickSort{
    
    private Random r = new Random();
    
    public Integer[] qsort(Integer[] L) {
	if (L.length <= 1)
	    return L;
	int pindex = r.nextInt(L.length);
	Integer p = L[pindex];
	int pc = 1;
	ArrayList<Integer> lower = new ArrayList<Integer>();
	ArrayList<Integer> upper = new ArrayList<Integer>();
	ArrayList<Integer> plist = new ArrayList<Integer>();
	for (int i = 0; i < L.length; i ++) {
	    if (L[i] < p)
		lower.add(L[i]);
	    else if (L[i] > p)
		upper.add(L[i]);
	    else
		plist.add(p);
	}
	Integer[] ua = upper.toArray(new Integer[]{});
	Integer[] la = lower.toArray(new Integer[]{});
	la = qsort(la);
	ua = qsort(ua);
	int i = 0;
	for (int j : la) {
	    L[i] = j;
	    i ++;
	}
	for (int j : plist) {
	    L[i] = j;
	    i++;
	}
	for (int j : ua) {
	    L[i] = j;
	    i ++;
	}
	return L;



    }

    public static void main(String[] args) {
	Random rnd = new Random();
	int n = 100;
	Integer[] a = new Integer[n];
	for (int i = 0; i < n; i ++)
	    a[i] = new Integer(rnd.nextInt(100));
	//System.out.println(Arrays.toString(a));
	QuickSort q = new QuickSort();
	a = q.qsort(a);
	System.out.println(Arrays.toString(a));
	
    }
    
}    
