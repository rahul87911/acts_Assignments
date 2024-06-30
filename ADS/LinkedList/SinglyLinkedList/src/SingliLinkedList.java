import java.util.Scanner;

//singly linked list using head only
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
	
	
	
	
	void addAtPos(int val, int pos) {
	
		//if list is empty
		
		//if pos<=1, add at start
		if(head==null || pos<=1)
		{
		 Node add=new Node(val);
		 add.next=head;
		 head=add;
		 return;
		}
		
		else 
		
		{
		Node add= new Node(val);
		Node trav=head;
		
		for(int i=1; i<pos-1;i++)
		{
			if(trav.next==null) //pos is beyond size of the linked list
			{
				break;
			}
			trav=trav.next;
		}
		add.next=trav.next;
		trav.next=add;
		}
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
	
	
	
	
	void deleteLast() {
		
		if(head==null)
		{
			throw new RuntimeException("List is Empty");
		}
		
		if(head.next==null)
		{
			head=null;
		}
		Node trav= head;
		Node temp=null;
		while(trav.next!=null)
		{
		 temp=trav;
		 trav=trav.next;
		}
		temp.next=null;
	}
	
	void deleteAtPos(int pos) {
		if(pos==1)
		{
		deleteFirst();	
		}
		if(head==null || pos<1)
		{
			throw new RuntimeException("List is Empty or Invalid Position");
			
		}
		
		Node temp,trav;
		temp=null;
		trav=head;
		
		for(int i=1;i<pos;i++) {
			if(trav==null)
			{
				throw new RuntimeException("Invalid Position");
			}
			temp=trav;
			trav=trav.next;
		}
		temp.next=trav.next;
		
		
	}
	
	void deleteAll() {
		head=null;
	}
}





public class SingliLinkedList {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 SinglyList list= new SinglyList();
		
		int choice;
		
		do {
			System.out.println("Enter your choice:\n1. Display\n"
					            + "2. Add First\n3. Add Last\n"
					            + "4. Add at Pos\n5. Delete First\n"
					            + "6. Delete Last\n7. Delete at Pos\n"
					            + "8. Delete All\n0. Exit ");
			
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:list.diaplay();
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
