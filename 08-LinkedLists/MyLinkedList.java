public class MyLinkedList{
    private Node head;
    
    public MyLinkedList(){
	head = null;
    }
    
    public void add(String s){
	Node temp = new Node(s);
	temp.setNext(head);//you must do this first
	head = temp; //you must do this second
    }
     
    public String toString(){
	String s = "";
	Node temp = head;
	while (temp != null){
	    s = s + temp + " ";
	    temp = temp.getNext();
	}
	return s;
    }

    public void add(int i, String s){
	//adds s at loc i, exception if i is past the end
	if (i == 0){
	    this.add(s);
	    return;
	}
	Node temp = head;
	Node n = new Node(s);
	for (int index = 0; index < i - 1; index ++){
	    temp = temp.getNext();
	}
	n.setNext(temp.getNext());
	temp.setNext(n);
    }
    
    public String get(int i){
	//return the string at loc i, exception if i is past the end
	Node temp = head;
	for (int index = 0; index < i; index ++){
	    temp = temp.getNext();
	}
	return "" + temp;
    }
    
    public String set(int i, String s){
	//changes the value at loc i to s
	//returns the old value
	//exception if i is off the end
	Node temp = head;
	Node n;
	String r = "";
	for (int index = 0; index < i - 1; index ++){
	    temp = temp.getNext();
	}
	r = temp.getData();
	temp.setData(s);
	return r;
    }
    
    public  String remove(int i){
	//remove and return the String at i, exception if i is past the end
	Node temp = head;
	Node n;
	String r = "";
	for (int index = 0; index < i - 1; index ++){
	    if (temp.getData() == s){
		r = "" + index;
		break;
	    }
	    temp = temp.getNext();
	}
	return r;
    }
    
    public int find(String s){
	//return the location of the first String in the lit with value s
	//exception on error
    }
    
    public int length(){
	//returns the number of elements in the list
	int i = 0;
	Node temp = head;
	while (temp != null){
	    temp = temp.getNext();
	    i ++;
	}
	return i;
    }

}
