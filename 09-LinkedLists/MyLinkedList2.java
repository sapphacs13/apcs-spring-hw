public class MyLinkedList{
    private Node head;
    private int size;
    
    public MyLinkedList(){
	head = new Node("");
	size = 0;
    }
    
    public void add(String s){
	Node temp = new Node(s);
	temp.setNext(head.getNext());//you must do this first
	head.setNext(temp); //you must do this second
	size ++;
    }
     
    public String toString(){
	String s = "";
	Node temp = head.getNext();
	while (temp != null){
	    s = s + temp + " ";
	    temp = temp.getNext();
	}
	return s;
    }

    public void add(int i, String s){
	Node temp = head.getNext();
	Node n = new Node(s);
	for (int index = 0; index < i - 1; index ++){
	    temp = temp.getNext();
	}
	n.setNext(temp.getNext());
	temp.setNext(n);
	size ++;
    }
    
    public String get(int i){
	Node temp = head.getNext();
	for (int index = 0; index < i; index ++){
	    temp = temp.getNext();
	}
	return "" + temp;
    }
    
    public String set(int i, String s){
	Node temp = head.getNext();
	String r = "";
	for (int index = 0; index < i; index ++){
	    temp = temp.getNext();
	}
	r = temp.getData();
	temp.setData(s);
	return r;
    }
    
    public  String remove(int i){
	Node temp = head.getNext();
	Node n;
	String r = "";
	for (int index = 0; index < i - 1; index ++){
	    temp = temp.getNext();
	}
	r = temp.getNext().getData();
	n = temp.getNext().getNext();
	size --;
	return r;
    }
    
    public int find(String s){
	Node temp = head.getNext();
		int r = -1;
		for (int index = 0; index < this.size; index++) {
			if (temp.getData() == s) {
				r = index;
				return r;
			}
			temp = temp.getNext();
		}
		return r;
    }
    
    public int size(){
	return size;
    }
}
