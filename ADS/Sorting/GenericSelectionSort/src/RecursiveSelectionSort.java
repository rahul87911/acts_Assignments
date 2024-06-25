
public class RecursiveSelectionSort {
  
	public static <T extends Comparable<T>> void recursiveSelectionSort(T[] arr, int n)
	{
		if(n==1)
		{
			return;
		}
		
		
		int max=0;
		
		for(int i=1;i<n;i++)
		{
			if(arr[i].compareTo(arr[max])>0)
			{
				max=i;
			}
		}
		
		T temp=arr[max];
		arr[max]=arr[n-1];
		arr[n-1]=temp;
		
		recursiveSelectionSort(arr, n-1);
		
	}
	
	
	
	public static void main(String[] args) {
		Person[] people = {
	            new Person(1, "Alice", 30),
	            new Person(2, "Bob", 25),
	            new Person(3, "Charlie", 35),
	            new Person(4, "Diana", 20)
	        };

	        System.out.println("Before sorting:");
	        for (Person person : people) {
	            System.out.println(person);
	        }

	        recursiveSelectionSort(people, people.length);

	        System.out.println("After sorting by age:");
	        for (Person person : people) {
	            System.out.println(person);
	        }
	}

}
