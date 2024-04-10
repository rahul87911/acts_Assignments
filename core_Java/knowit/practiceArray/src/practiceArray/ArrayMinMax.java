package practiceArray;

public class ArrayMinMax {

	
	public static int arrayDifference(int a[])
	{
		int min=a[0];
		int max=a[0];
		int diff;
		
		for(int i=0;i<a.length;i++)
		{
			if (a[i] < min) {
                min = a[i]; 
            }
            if (a[i] > max) {
                max = a[i];
            }
		}
		
		diff=max-min;
		
		return diff;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println("Array Elements are below : ");
          
          int[] integerArray = {1, 2, 3, 4, 5};
          
          for(int n:integerArray)
          {
        	  System.out.println(n);
          }
          
          System.out.println("Difference between Max and Min : "+arrayDifference(integerArray));
	}

}
