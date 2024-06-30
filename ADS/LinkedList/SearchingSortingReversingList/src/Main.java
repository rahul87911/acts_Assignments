import java.util.Scanner;

class SinglyList{

	static class Node{
		private int data;
		private Node next;
		
		public Node(){
			data=0;
			next=null;
		}
		
		public Node(int val) {
			data=val;
			next=null;
		}		
	}
	
	private Node head;
	
	public SinglyList() {
		head=null;
	}
	
	
	
	
	
	
	void diaplay() {
		System.out.println("List: ");
		Node trav=head;
		
		while(trav!=null)
		{
			System.out.println(trav.data);
			trav=trav.next;
		}
		System.out.println("");
	}
	
	
	 
	
	
	void addFirst(int val) {

		Node add =  new Node(val);
		
		add.next=head;
		head=add; 
	 	
	}
	
	
	
	
	
	void addLast(int val) {
        Node add = new Node(val);
		
		if(head==null)
		{
		  head=add;	
		  return;
		}
		
		Node trav=head;
		while(trav.next != null)
		{
			trav=trav.next;
		}
		                                 
		trav.next=add;
	}


	void deleteFirst() {
		if(head==null)
		{
			throw new RuntimeException("List is Empty!!");
		}
		else
		{
			head=head.next;
			System.out.println("deleted");
		}
	}
	
	
	
	int searchElement(int val)
	{
		if(head==null)
		{
			throw new RuntimeException("List is Empty");
		}
		
		
		else {
		Node trav=head;
		int position=1;
		
		while(trav!=null)
		{  if(trav.data==val)
		{
			return position;
		}
			trav=trav.next;
			position++;
		}
		
		return -1;
		}
	}
	
	
	public void ascendingsort() //selection sort
	{
		if(head==null)
		{
			throw new RuntimeException("List is Empty");
		}
		if(head.next==null)
		{
			return;
		}
		
	else {
		Node i , j;
		
		for(i=head;i != null; i=i.next)
		{
			for(j=i.next;j!=null;j=j.next)
			{
				if(i.data>j.data)
				{
				  int temp;
				  temp=j.data;
				  j.data=i.data;
				  i.data=temp;
				}
			}
		}
	}
		
	}
		
		public void descendingSort()  //selection sort
		{
			if(head==null)
			{
				throw new RuntimeException("List is Empty");
			}
			if(head.next==null)
			{
				return;
			}
			
		else {
			Node i , j;
			
			for(i=head;i != null; i=i.next)
			{
				for(j=i.next;j!=null;j=j.next)
				{
					if(i.data<j.data)
					{
					  int temp;
					  temp=j.data;
					  j.data=i.data;
					  i.data=temp;
					}
				}
			}
		}
		
		
	}
	
	
	
	
	public void ascendingBubbleSort()
	{
		if(head==null)
		{
			throw new RuntimeException("List is Empty");
		}
		if(head.next==null)
		{
			return;
		}
		else
		{
			 boolean swapped;
			    Node trav;

			    do {
			        swapped = false;
			        trav = head;

			        while (trav.next != null) {
			            if (trav.data > trav.next.data) {
			                // Swap data
			                int temp = trav.data;
			                trav.data = trav.next.data;
			                trav.next.data = temp;
			                swapped = true;
			            }
			            trav = trav.next; // Move to the next node
			        }
			    } while (swapped);
		}
	
	}
	
	
	public void descendingBubbleSort()
	{
		if(head==null)
		{
			throw new RuntimeException("List is Empty");
		}
		if(head.next==null)
		{
			return;
		}
		else
		{
			 boolean swapped;
			    Node trav;

			    do {
			        swapped = false;
			        trav = head;

			        while (trav.next != null) {
			            if (trav.data < trav.next.data) {
			                // Swap data
			                int temp = trav.data;
			                trav.data = trav.next.data;
			                trav.next.data = temp;
			                swapped = true;
			            }
			            trav = trav.next; // Move to the next node
			        }
			    } while (swapped);
		}
	}
	
	
	
	
	public void reverseList()
	{
		//we said linkedlist as old and pointed oldhead to it
		//consecutively we are maintaining a new list with head
		Node oldHead=head;
		head=null;
	
		while(oldHead != null){
		//deleted the old first ele
		Node temp=oldHead;
		oldHead= oldHead.next;
		
		//added the deleted element pointed by temp to new list
		temp.next=head;
		head=temp;
	}//repeated till oldhead is null or old list is empty	
	}
	
}





public class Main {

	public static void main(String[] args) {
		SinglyList list= new SinglyList();
		
		list.addLast(10);
		list.addLast(30);
		list.addLast(40);
		list.addLast(20);
		list.addLast(60);
		list.addLast(50);
		list.addLast(90);
		list.addLast(80);
		
		Scanner sc=new Scanner(System.in);
        int choice;
		
		do {
			System.out.println("Enter your choice:\n1. Display\n"
					            + "2. Searching Element\n3. Sorting Ascending\n"
					            + "4. Sorting Descending\n"+"5. Reversing\n"+"6. Exit");
            choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:list.diaplay();
				   break;
				   
			case 2:try {
				   System.out.println("Enter the element:");
				   int pos=list.searchElement(sc.nextInt());
				   if(pos==-1)
				   {
					   System.out.println("Element not Found");
				   }
				   else
					   System.out.println("Element Found at "+pos+" position");
			}catch(Exception e)
			{
				e.getMessage();
			}
				   break;
				   
				
			case 3:try {
				   System.out.println("Ascending Order: ");
				   list.ascendingsort();
				   list.diaplay();
			}catch(Exception e)
			{
				e.getMessage();
			}
				   break;
				   
			case 4:try {
				   System.out.println("Descending Order: ");
				   list.descendingSort();
				   list.diaplay();
			}catch(Exception e)
			{
				e.getMessage();
			}
			       break;
			case 5:System.out.println("Reversed List: ");
			       list.reverseList();
			       list.diaplay();
		           break;
			case 6:
				   System.out.println("Exiting...");
				   break;
				   
		    default:
			        System.out.println("Invalid Input");
			        break;
		}

	}while(choice!=6);
        sc.close();

}
}
