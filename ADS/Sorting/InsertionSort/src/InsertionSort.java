import java.util.Arrays;

public class InsertionSort {
	
	public static void insertionsort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
		int j;
		int temp=arr[i];

		for(j=i-1;j>0&&arr[j]>temp;j--)
		{
			arr[j+1]=arr[j];
		}
		arr[j+1]=temp;
	}
	}
	
	
public static void main (String[] args)
{
  int[]arr= {1,34,5,7,8,9};
  
  System.out.println("Before: "+Arrays.toString(arr));
  insertionsort(arr);
  System.out.println("After: "+Arrays.toString(arr));
}
}
