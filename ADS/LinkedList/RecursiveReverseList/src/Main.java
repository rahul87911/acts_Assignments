
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
	
    void revDisplay(Node h)
    {
    	if(h==null)
    		return;
    	
      revDisplay(h.next);
      System.out.println(h.data);
    }
	
	
    public void revDisplayWrap()
    {   System.out.println("List: ");
    	revDisplay(head);
    	System.out.println("");
    }
	
	Node recursiveReverse(Node h)
	{
		if(h.next==null)
		{   head=h;
			return h;
		}
		
		Node t=recursiveReverse(h.next);
		t.next=h;
	    h.next=null;
	    return h;
		
	}
	
	public void recRevWrap() {
		if(head!=null)
		recursiveReverse(head);
	}
	
	int mid()
	{
		Node fast=head;
		Node slow=head;
		
		while(fast != null && fast.next != null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
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

		System.out.println("Before : ");
		list.diaplay();
		
		System.out.println(list.mid());
		
		System.out.println("Reversed Display : ");
        list.revDisplayWrap();		
		
		
		System.out.println("Reversed : ");
		list.recRevWrap();
		list.diaplay();
	}

}
