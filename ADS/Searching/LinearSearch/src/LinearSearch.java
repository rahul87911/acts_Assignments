import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int arr[],int key)
	{
		for (int i=0;i<arr.length;i++)
		{
		 if(arr[i]==key)
		 {
			 return i;
		 }
		}
		return -1;
	}
	
	public static void main(String[] args) {
	  int arr[]= {11,44,66,10,6,8,9,4};
	  
	  System.out.println("Enter the number:");
	  Scanner sc=new Scanner(System.in);
      
	  int a=linearSearch(arr,sc.nextInt());
	  
	  if(a==-1)
	  {
		  System.out.println("Not Found");
	  }
	  else
		  System.out.println("Found at index "+a);
	}

}
