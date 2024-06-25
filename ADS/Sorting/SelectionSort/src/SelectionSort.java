import java.util.Arrays;

public class SelectionSort {

	public static void selectionSort(int[]arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp;
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
	   int[] arr= {6,4,2,8,3,1};
	   
	   System.out.println("before :"+Arrays.toString(arr));
	   selectionSort(arr);
	   System.out.println("after :"+Arrays.toString(arr));

	}

}
