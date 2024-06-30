public class ArrayManipulation {
//JDK16 used
 
    public static int[] deleteElement(int[] originalArray, int index) {
      
        if (index < 0 || index >= originalArray.length) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }

       
        int[] newArray = new int[originalArray.length - 1];

        
        for (int i = 0, j = 0; i < originalArray.length; i++) {
         
            if (i == index) {
                continue;
            }
            newArray[j++] = originalArray[i];
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        int indexToDelete = 2; 
        int[] newArray = deleteElement(array, indexToDelete);

        System.out.println("Array after deletion: ");
        for (int i : newArray) {
            System.out.print(i + " ");
        }
    }
}
