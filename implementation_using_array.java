class MyStack
{
    int arr[];
	int cap;
	int top;

    MyStack(int c)
	{
		top = -1;
		cap = c;
		arr = new int [cap];
	}
	
	//Function to push an integer into the stack.
    void push(int a)
	{
	    top++;
	    arr[top]=a;
	    
	} 
	
    //Function to remove an item from top of the stack.
	int pop()
	{
        if(top==-1)
       {
           return -1;
       }
       int ans = arr[top];
       top--;
       return ans;
	}
	boolean isEmpty(){
	    return (top ==-1);
	}
	int size(){
	    return top+1;
	}
}
class Main {
    public static void main(String [] args )
    {
        MyStack s = new MyStack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        
        System.out.print(s.pop()+" ");
        System.out.print(s.pop()+" ");
        System.out.print(s.pop()+" ");
       
        System.out.println( );
        s.push(40);
        System.out.println(s.pop()+" ");
        System.out.println(s.isEmpty());
        System.out.println(s.size()); 
    }
}
