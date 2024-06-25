import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int[] arr, int left, int right, int key) {
		
		int mid=(left+right)/2;
		int index = 0;
		
		if(right<left)
		{
			return -1;
		}
		
		if(key==arr[mid])
		{
			return mid;
		}
		if(key<arr[mid])
		{
			index=binarySearch(arr,left,mid-1,key);
		}
		if(key>arr[mid])
		{
			index= binarySearch(arr,mid+1,right,key);
		}
		
		return index;
		
	}
	
	
	public static void main(String[] args) {
	
		int[] arr= {11,22,33,44,55,66,77,88,99};
		
		System.out.println("Enter the Number:");
		Scanner sc= new Scanner(System.in);
		
		int a= binarySearch(arr,0,arr.length-1,sc.nextInt());
		
		if(a==-1)
		{
			System.out.println("Not Found");
		}
		else
			System.out.println("Element found at : "+a);

	}
	


}
