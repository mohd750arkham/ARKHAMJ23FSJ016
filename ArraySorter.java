package closedLabBook1;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySorter {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        // Create an array to store the numbers
        int[] numbers = new int[n];
        
        // Read the numbers from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the sort order (asc/desc): ");
        String sortOrder = scanner.next();
        
        // Sort the array based on the given sort order
        if (sortOrder.equalsIgnoreCase("asc")) {
            Arrays.sort(numbers);
        } else if (sortOrder.equalsIgnoreCase("desc")) {
            Arrays.sort(numbers);
            reverseArray(numbers);
        } else {
            System.out.println("Invalid sort order.");
            // Close the Scanner
            scanner.close();
            return;
        }
        
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        
        // Close the Scanner
        scanner.close();
    }
    
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            
            left++;
            right--;
        }
    }
}
