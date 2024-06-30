import java.util.Scanner;



class DoublyList{
	
	static class Node{
		private int data;
		private Node next;
		private Node prev;
	
		public Node(){
			data=0;
			next=null;
			prev=null;
		}
		
		public Node(int val) {
			data=val;
			next=null;
		}		
	}
	
	private Node head;

	
	public DoublyList() {
		head=null;
		
	}
	
	
	
	public void displayForward() {
		System.out.println("List: ");
		//sp case if list is emp
		if(head==null)
		return;
		
		Node trav=head;
		while(trav!=null)
		{
			System.out.println(trav.data);
			trav=trav.next;
		}
	}
	
	public void displayReverse() {
		System.out.println("List: ");
		Node trav=head;
		while(trav.next!=null)
		{
			System.out.println(trav.data);
			trav=trav.next;
		}
		
		while(trav !=null)
		{
			System.out.println(trav.data);
			trav=trav.prev;
		}
	}
	
	public void addLast(int val) {
	  Node add= new Node(val);	
	  if(head==null)
	  {
		  head=add;
	  }
	  else {
	  Node trav=head;
	  
	  while(trav.next!=null)
	  {
		  trav=trav.next;
	  }
	  
	  trav.next=add;
	  add.prev=trav;
	}
	}
	
	
	public void addFirst(int val)
	{
		Node add = new Node(val);
		if(head==null) 
		{
			head=add;
		}
		else
		{
			add.next=head;
			head.prev=add;
			head=add;
		}
	}

	
	public void addAtPos(int val, int pos)
	{
		 Node add= new Node(val);
	
		 if(head==null || pos<=1)
			 addFirst(val);
		 
		 
		 else {
		 Node trav= head;
		 Node temp=null;
		 for(int i=1;i<pos-1;i++)
		 {
			 if(trav.next==null)//sp case 3
			 {
				 break;
			 }
		  trav=trav.next;	 
		 }
		 temp=trav.next;
		 add.next=temp.next;
		 add.prev=trav.prev;
		 trav.prev=add;
		 if(temp!=null)//this is line is for sp case 3
		 temp.prev=add;
		 }
	}

	
	public void deleteFirst() {
		if(head==null)
		{
			throw new RuntimeException("List is Empty");
		}
		
		if(head.next==null)
		{
			head=null;
		}
		
		head=head.next;
		head.prev=null;
	}
	
	
	public void deleteLast() {
	Node trav=head;
	while(trav.next==null)
	{
	 trav=trav.next;
	}
	trav.prev.next=null;
	trav.prev=null;
	}
	
	
	public void deleteAtPos(int pos) {
		if(pos==1)
		{
			deleteFirst();
		}
		if(head==null|| pos<1)
		{
			throw new RuntimeException("List is Empty");
		}
		else {
			Node trav=head;
			
			for(int i=1;i<pos;i++)
			{
				if(trav==null)
				{
					throw new RuntimeException("Invalid Position");
				}
				trav=trav.next;
			}
			trav.prev.next=trav.next;
			if(trav.next!=null)
			trav.next.prev=trav.prev;
		}
	}
	
	
	public void deleteAll() {
		head=null;
	}
}












public class DoublyLinearLinkedList {

	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 DoublyList list = new DoublyList();
		
		int choice;
		
		do {
			System.out.println("Enter your choice:\n1. Display\n"
					            + "2. Add First\n3. Add Last\n"
					            + "4. Add at Pos\n5. Delete First\n"
					            + "6. Delete Last\n7. Delete at Pos\n"
					            + "8. Delete All\n0. Exit ");
			
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:list.displayForward();
			       list.displayReverse();
				   break;
				   
			case 2:System.out.println("Enter the element:");
				   list.addFirst(sc.nextInt());
				   break;
				   
				
			case 3:System.out.println("Enter the element:");
				   list.addLast(sc.nextInt());
				   break;
				   
			case 4:System.out.println("Enter the element and the position:");
				   list.addAtPos(sc.nextInt(), sc.nextInt());
			       break;
				   
			case 5:try {
				   list.deleteFirst();
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
				   break;
				   
			case 6:list.deleteLast();
				   break;
				   
			case 7:System.out.println("Enter the position of the element:");
				   list.deleteAtPos(sc.nextInt());
				   break;
				   
			case 8:list.deleteAll();
				   break;
				   
			case 0:
				   System.out.println("Exiting...");
				   break;
				   
		    default:
			        System.out.println("Invalid Input");
			        break;
			}
		}while(choice!=0);
       sc.close();

	}

}
