public class BST{
    private Node root;
    
    public BST(){
	root = null;
    }

    public void insert(Node n){
	
	if (root == null){
	    // Empty tree
	    root = n; 
	    return;
	}
	
	Node pointer = root;
	Node piggyback = null;
	int d = n.getData();
	
	while (pointer != null){
	    if (d < pointer.getData()){
		piggyback = pointer;
		pointer = pointer.getLeft();
	    }
	    else{//(d > pointer.getData())
		piggyback = pointer;
		pointer = pointer.getRight();
	    }
	}
	if (d < piggyback.getData())
	    piggyback.setLeft(n);
	else
	    piggyback.setRight(n);
    }
    
    public Node search(int x){
	Node temp = root;
	
	while (temp != null && temp.getData() != x){
	    if (x < temp.getData()){
		temp = temp.getLeft();
	    }
	    else{
		temp = temp.getRight();
	    }
	}
	
	return temp;
    }

    public Node search2(Node c, int x){
	if (c.getData() == 0)
	    return null;
	else if (c.getData() == x)
	    return c;
	else if(c.getData() < x)
	    c = c.getLeft();
	else
	    c = c.getRight();
       	return search2(c, x);
	
    }
    
    public void delete(Node c){
	Node pointer = root;
	Node piggyback = null;
	int d = n.getData();
	
	while (pointer != d){
	    if (d < pointer.getData()){
		piggyback = pointer;
		pointer = pointer.getLeft();
	    }
	    else{//(d > pointer.getData())
		piggyback = pointer;
		pointer = pointer.getRight();
	    }
	}//pointer now equals d (i.e.  Node c)

	Node l = pointer.getLeft();
	Node r = pointer.getRight();
	//cases a and b
	if (l == null){
	    if (piggyback.getData() < r.getData())
		piggyback.setRight(r);
	    else{
		piggyback.setLeft(r);
	    }
	}
	else if (r == null){
	    if (piggyback.getData() < l.getData())
		piggyback.setRight(l);
	    else{
		piggyback.setLeft(l);
	    }
	}
	//case c
	else{//there are two children
	    //put test in bag
	    Node big = piggyback;
	    Node front = piggyback.getLeft();
	    while (front != null){
		big = front;
		front = front.getRight();
	    }
	    int value = big.getData();
	    delete(big);
	    //copy value into slot
		
	}
	    
    }
    
}
