import java.util.Arrays;

public class RecursiveInsertionSort {

	public static void insertionsort(int[] arr, int n)
	{
		
		if(n<=1)
		{
			return;
		}
		insertionsort(arr, n-1);		
		int j;
		int temp=arr[n-1];
		
		for(j=n-2;j>=0&&arr[j]>temp;j--)
		{
			arr[j+1]=arr[j];
		}
		
		arr[j+1]=temp;
		
		
	}
	
	
	public static void main(String[] args) {
		 int[]arr= {1,34,5,7,8,9};
		  
		  System.out.println("Before: "+Arrays.toString(arr));
		  insertionsort(arr,arr.length);
		  System.out.println("After: "+Arrays.toString(arr));
	}

}
