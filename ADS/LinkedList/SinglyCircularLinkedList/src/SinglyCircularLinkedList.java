import java.util.Scanner;



class SinglyCircularList{
	
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

	
	public SinglyCircularList() {
		head=null;

	}
	
	
	
	public void displayList() {
		if(head==null)
		{
			return;
		}
		
		Node trav=head;
		do {
			System.out.println("List "+trav.data);
			trav=trav.next;
		}while(trav!=head);
	}
	
	
	public void addLast(int val) {
		
		Node add=new Node(val);
		
		if(head==null)
		{
			head=add;
			head.next=head;
		}
		else
		{
		
		Node trav=head;
		while(trav.next!=head)
		{
			trav=trav.next;
		}
		trav.next=add;
		add.next=head;
		}
	}
	
	public void addFirst(int val)
	{
		Node add=new Node(val);
		
		if(head==null)
		{
			head=add;
			head.next=head;
		}
		else
		{
		  Node trav=head;
		  while(trav.next!=head)
		  {
			  trav=trav.next;
		  }
		  
			trav.next=add;
			add.next=head;
			head=add;
		}
	}
	
	
	
	public void addAtPos(int val, int pos)
	{
		Node add= new Node(val);
		if(head==null||pos<=1)
		{
			addFirst(val);
		}
		else
		{
		Node trav=head;
		for(int i=1;i<pos-1;i++)
		{
			if(trav.next==head)
				break;
			trav=trav.next;
		}
		add.next=trav.next;
		trav.next=add;
	}
	}
	
	public void deleteFirst()
	{
		Node trav=head;
		if(head==null)
		{
			throw new RuntimeException("List is Empty");
		}
		if(head.next==head)
		{
			head=null;
		}
		
		
		else
		{
		while(trav.next!=head)
		{
			trav=trav.next;
		}
		head=head.next;
		trav.next=head;
	}
	}
	
	
	
	
	public void deleteLast() {
	
		if(head==null)
		{
		  throw new RuntimeException("List is empty");	
		}
		if(head==head.next)
		{
			deleteFirst();
		}
		
	else {	
		Node temp=null;
		Node trav=head;
		while(trav.next!=head)
		{
			temp=trav;
			trav=trav.next;
		}
		temp.next=head;
	}
	}
	
	
	
	
	public void deleteAtPos(int pos) {
		if(pos==1)
		{
			deleteFirst();
		}
		
	if(head==null || pos<1)
	{
		throw new RuntimeException("List is Empty");
	}
		
	else {
		Node trav,temp;
		temp=null;
		trav=head;
		
		for(int i=1;i<pos;i++)
		{   if(trav.next==head)
		{
			throw new RuntimeException("Invalid Position");
		}
			temp=trav;
			trav=trav.next;
		}
		temp.next=trav.next;
	}
	}
	
	
	public void deleteAll()
	{
		//only head = null will work but it depends on gc how smart it is
		//so we converted the circular linked list to singly linear linked list then deleted the head
		
	 head.next=null;
	 head=null;
	}
}





public class SinglyCircularLinkedList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 SinglyCircularList list = new SinglyCircularList();
		
		int choice;
		
		do {
			System.out.println("Enter your choice:\n1. Display\n"
					            + "2. Add First\n3. Add Last\n"
					            + "4. Add at Pos\n5. Delete First\n"
					            + "6. Delete Last\n7. Delete at Pos\n"
					            + "8. Delete All\n0. Exit ");
			
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:list.displayList();
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
