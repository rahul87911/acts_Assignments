import java.util.Arrays;

public class RecursiveBubbleSort {

	public static void bubbleSort(int[] arr, int n)
	{
		if(n==1)  //base condition
		{
			return;
		}
		
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		bubbleSort(arr, n-1);
	}
	
	
	public static void main(String[] args) {
	int[] arr= {6,1,2,9,4,3};
		
		System.out.println("Before: "+Arrays.toString(arr));
		bubbleSort(arr,arr.length);
		System.out.println("After: "+Arrays.toString(arr));

	}

}
