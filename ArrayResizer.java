package closedLabBook1;

import java.util.Arrays;

public class ArrayResizer {
    public static void main(String[] args) {
        // Original array
        int[] originalArray = {1, 2, 3, 4, 5};
        
        System.out.println("Original array: " + Arrays.toString(originalArray));
        
        // Resize the array
        int newSize = 7;
        int[] resizedArray = resizeArray(originalArray, newSize);
        
        System.out.println("Resized array: " + Arrays.toString(resizedArray));
    }
    
    public static int[] resizeArray(int[] array, int newSize) {
        int[] resizedArray = new int[newSize];
        
        // Copy elements from the original array to the resized array
        for (int i = 0; i < Math.min(array.length, newSize); i++) {
            resizedArray[i] = array[i];
        }
        
        return resizedArray;
    }
}
