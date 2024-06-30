class LinearQueueCls{
	private int[] arr;
	private int rear,front;
	
	public LinearQueueCls(int size)
	{
		arr=new int[size];
		rear=-1;
		front=-1;
	}
	
	public boolean isFull()
	{
		return rear==arr.length-1;
	}
	
	public boolean isEmpty()
	{
		return rear==front;
	}
	
	
	public void push(int val)
	{
		if(isFull())
		{
			throw new RuntimeException("Queue is Full");
		}
		if(front==-1)
		{
			front++;
		}
		rear++;
		arr[rear]=val;
	}
	
	public void pop()
	{
		if(isEmpty())
		{
			throw new RuntimeException("Queue is Empty");
		}
		front++;
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			throw new RuntimeException();
		}
		return arr[front+1];
	}
	
	public void display()
	{
		for(int s: arr)
		{
	      System.out.println(s);
		}
	}
}








public class LinearQueue {

	public static void main(String[] args) {
		LinearQueueCls ls= new LinearQueueCls(3);
		
		ls.push(1);
		ls.push(2);
		ls.push(3);
		ls.display();

	}

}
