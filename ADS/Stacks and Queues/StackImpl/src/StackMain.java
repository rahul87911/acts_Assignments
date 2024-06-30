import java.util.Scanner;

class Stack{
	private int [] arr;
	private int top; 
	
	public Stack(int size) {
		arr=new int[size];
		top=-1;
	}
	
	public void push(int val)
	{
		if(isFull())
			throw new RuntimeException("Stack is full");
		top++;
		arr[top]=val;
	}
	
	public void pop()
	{  if(isEmpty())
		throw new RuntimeException("Stack is Empty");
		top--;
		System.out.println("Popped");
	}
	
	public int peek()
	{
		 if(isEmpty())
				throw new RuntimeException("Stack is Empty");
		
		return arr[top];
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public boolean isFull()
	{
		return top ==  arr.length-1;
	}
}








public class StackMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Stack s= new Stack(6);
        
		int choice;
		
		boolean flag=false;
		
		while(flag==false)
		{
			System.out.println("Enter the choice : \n1. Push\n2. Pop\n3. Peek\n0. Exit");
			
			choice=sc.nextInt();
			
			switch (choice) {
			
			case 1:
				try {
				s.push(sc.nextInt());}
			   catch(Exception e)
			    {
				 System.out.println(  e.getMessage());
			    }
				break;
				
            case 2:
            	try {
            	s.pop();}
                catch(Exception e)
			    {
				 System.out.println(  e.getMessage());
			    }
				break;

            case 3:
            	try {
				System.out.println(s.peek());}
                catch(Exception e)
			    {
				   System.out.println(  e.getMessage());
			    }
				break;
				
            case 0:
            	flag=true;
            	System.out.println("Exiting...");
	            break;
	            
			default:
				System.out.println("Invalid Input");
				break;
			}
			
		}
		
		
	}

}
