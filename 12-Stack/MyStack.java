import java.util.*;
import java.io.*;

public class MyStack{
    private int[] list;
    private int top;

    public MyStack(){
	top = 0;
	list = new int[10];
    }

    public void push(int s){
	if(top == list.length){
	    int[] tmp = new int[list.length * 2];
	    for(int i = 0; i < list.length; i++){
		tmp[i] = list[i];
	    }
	    list = tmp;
	}
	list[top] = s;
	top++;
    }

    public int pop(){
	int s = list[top - 1];
	list[top - 1] = 0;
	top--; 
	return s;
    }

    public int peek(){
	return list[top - 1];
    }

    public boolean isEmpty(){
	return list[0] == 0;
    }

    public String toString(){
	String s = "";
	for(int i = 0; i < top; i++){
	    s += list[i] + ", ";
	}
	return s;
    }

}
