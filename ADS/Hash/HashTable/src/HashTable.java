import java.util.LinkedList;
import java.util.Scanner;

class HashTbl{
	
	
	static class Pair{
		private int key;
		private String value;
		
		public Pair()
		{
			key=0;
			value=" ";
		}
		
		public Pair(int key, String value)
		{
			this.key=key;
		    this.value=value;
		}

		@Override
		public String toString() {
			return "Pair [key=" + key + ", value=" + value + "]";
		}
		
	}
	
	private static final int SLOTS = 10;
	
	private LinkedList<Pair> table[];
	
	public int hash(int key)         //hash func
	{
		return key  % SLOTS;
	}
	
	public HashTbl()
	{
		table= new LinkedList[SLOTS];
		
		for(int i=0;i<SLOTS;i++)
		{
			table[i] =  new LinkedList<>();
		}
		
	}
	
	
	public void put(int key, String value)
	{
		//find slot for given key using hash func
				int slot=hash(key);
			//access the bucket in the slot
				LinkedList<Pair> bucket = table[slot];
				//find the element in the bucket using linear search
				for(Pair pair : bucket)
				{  // in this case, key is duplicated, replace the value
				  if(key == pair.key)
				  {
					  pair.value=value;
					  return ;
				  }
				}
				
				//if key not found , create new key-value pair and add into bucket
				Pair pair = new Pair(key, value);
				bucket.add(pair);
	}
	
	
	public String get(int key)
	{
	  //find slot for given key using hash func
		int slot=hash(key);
	//access the bucket in the slot
		LinkedList<Pair> bucket = table[slot];
		//find the element in the bucket using linear search
		for(Pair pair : bucket)
		{
		  if(key == pair.key)
		  {
			  return pair.value;
		  }
		}
		
		//if key not found return null
		return null;
	}
	
	
}






public class HashTable {
	
public static void main(String[] args)
{
  Scanner sc= new Scanner(System.in);
  
  HashTbl ht= new HashTbl();
  
  ht.put(1,"Saloni");
  ht.put(2,"Rahul");
  ht.put(3,"Aman");
  ht.put(4,"Ayushi");
  ht.put(5,"Sejal");
  ht.put(6,"Shivani");
  ht.put(7,"Himanshu");
  ht.put(8,"Dharmendra");
  ht.put(9,"Harsh");
  ht.put(10,"Anu");
  ht.put(3,"Amruta");
  
  System.out.println("Enter the roll number:");
  int roll=sc.nextInt();
  String name= ht.get(roll);
  System.out.println("Name Found: "+name);
}
}
