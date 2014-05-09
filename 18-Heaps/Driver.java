public class Driver{

    public static void main(String[] args){
	Heap h = new Heap(8);
	h.insert(8);
	h.insert(3);
	h.insert(12);
	h.insert(6);
	h.insert(20);
	h.insert(15);
	h.insert(9);
	for (int x = 1; x < h.getSize() + 1; x ++){
	    System.out.print(h.getHeap()[x]);
	    System.out.print(", ");
	}
    }
    
}
