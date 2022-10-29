import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
	   // puwsh element into the Stack
	    s.push(10);
	    s.push(30);
	    s.push(40);
	    s.push(50);
	    s.push(33);
	    s.push(45);
	   System.out.println(s);
	   //remove element from the stack 
	   System.out.println("pop() : " + s.pop());
	   //return head of the stack
	   System.out.println("peek() : "+ s.peek());
	   //check stack is Empty or not
	   System.out.println("isEmpty() : " + s.isEmpty());
	   //returns size of the stack
	   System.out.println("size() : "+ s.size());
	}
}
