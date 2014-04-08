import java.util.*;
import java.io.*;

public class RPN{

    private Scanner scan = new Scanner(System.in);
    private String next;
    private boolean yes = false;
    private static final String operators = "+-*/%^";
    private MyStack stack;
    
    public RPN(){
	stack = new MyStack();
    }
    
    public void calculate(){
	
	while (yes == true){
	    next = scan.next();

	    if(next.equals("off")){
		yes = false;
	    }

	    else if(next.equals("clear")){
		stack = new MyStack();
	    }

	    else if(operators.indexOf(next) == -1){
		stack.push(next);
	    }

	    else{
		System.out.println(operate(next));
	    }

	}
    }
    
    public double operate(String input){
	
	double a = Double.parseDouble(stack.pop());
	double b = Double.parseDouble(stack.pop());
	double r = 0.0;
	if(next.equals("+")){
	    r = b + a; 
	}
	else if(next.equals("-")){
	    r = b - a;
	}
	else if(next.equals("/")){
	    r = b / a;
	}
	else if(next.equals("*")){
	    r = a * b;
	}
	/*else if(next.equals("^")){
	  r = Math.pow(b, a);
	  }*/
	else if(next.equals("%")){
	    r = b % a;
	}
	stack.push(r);
	return r;
    }
    
    public static void main(String[]args){
	RPN rpn = new RPN();
	rpn.calculate();
	System.out.println(rpn.stack);
    }

}
