import java.util.Arrays;

public class RecursiveSelectionSort {

	public static void recursiveSelectionSort(int[] arr, int n)
	{
	 if(n==1) //base
	 {
		 return;
	 }
	 
	 int max=0;
	 for(int i=1;i<n;i++)
	 {
		 if(arr[i]>arr[max])
		 {
			 max=i;
		 }
	 }
	 
	
	 int temp=arr[max];
	 arr[max]=arr[n-1];
	 arr[n-1]=temp;
	 
	 recursiveSelectionSort(arr, n-1);
	}
	
	public static void main(String[] args) {
		 int[] arr= {6,4,2,8,3,1};
		   
		 System.out.println("before :"+Arrays.toString(arr));
		 
		 recursiveSelectionSort(arr, arr.length);
		 
		 System.out.println("after :"+Arrays.toString(arr));

	}

}
