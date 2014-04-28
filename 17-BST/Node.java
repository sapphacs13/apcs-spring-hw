

public class Node{
    private int data;
    private Node left, right;
    
    //write all necessary constructors and set/get methods
    
    public Node(){
	data = 0;
	left = null;
	right = null;
    }
    
    public Node(int d){
	data = d;
	left = null;
	right = null;
    }
    
    public void setData(int x){
	data = x;
    }
    
    public int getData(){
	return data;
    }
    
    public void setRight(Node n){
	right = n;
    }

    public Node getRight(){
	return right;
    }
    
    public void setLeft(Node n){
	left = n;
    }

    public Node getLeft(){
	return left;
    }

}
