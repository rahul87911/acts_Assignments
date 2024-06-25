public class ArrayManipulation {

    // Method to delete an element at a specified index from an array
    public static int[] deleteElement(int[] originalArray, int index) {
        // Check if the index is valid
        if (index < 0 || index >= originalArray.length) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }

        // Create a new array of size one less than the original array
        int[] newArray = new int[originalArray.length - 1];

        // Copy elements from the original array to the new array
        for (int i = 0, j = 0; i < originalArray.length; i++) {
            // Skip the element to be deleted
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

        int indexToDelete = 2; // For example, delete the element at index 2 (which is 3)
        int[] newArray = deleteElement(array, indexToDelete);

        System.out.println("Array after deletion: ");
        for (int i : newArray) {
            System.out.print(i + " ");
        }
    }
}
