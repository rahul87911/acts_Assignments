import java.util.Arrays;

public class Insertion {

	public static void insertion(int[] arr)
	{
		int j;
		int temp=arr[arr.length-1];
		
		for(j=arr.length-2;j>=0&&arr[j]>temp;j--)
		{
			arr[j+1]=arr[j];
		}
		
		arr[j+1]=temp;
	}
	//above logic is applied for sorted insertion 
	//this is valid for only the case when whole array is sorted but the last element is not sorted 
	
	public static void main(String[] args) {
		int[] arr= {2,3,4,5,1};
		System.out.println("Before: "+Arrays.toString(arr));
		insertion(arr);
		System.out.println("After: "+Arrays.toString(arr));

	}

}
