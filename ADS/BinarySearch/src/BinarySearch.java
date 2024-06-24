import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int[] arr, int key)
	{
	   int l=0;
	   int r= arr.length-1;
	   int m;
	   
	   while(l<=r)
	   {
		   m=(l+r)/2;
		   
		   if(key==arr[m])
		   {
			   return m;
		   }
		   if(key < arr[m])
		   {
			   r=m-1;
		   }
		   else 
			   l=m+1;
	   }
	   
	   return -1;
	}
	
	
	public static void main(String[] args) {
	
		int arr[]= {11,22,33,44,55,66,77,88,99};
		Arrays.sort(arr);
		
		System.out.println("Enter the number:");
		
		Scanner sc= new Scanner(System.in);
		
		int a= binarySearch(arr,sc.nextInt());

		if(a==-1)
		{
			System.out.println("Not Found");
		}
		else
			System.out.println("Element found at : "+a);
 	}

}
