package closedLabBook1;

import java.util.Scanner;

public class ArrayElementLocator {
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
        
        System.out.print("Enter the element to locate: ");
        int element = scanner.nextInt();
        
        // Find the location (index) of the element in the array
        int location = findElementLocation(numbers, element);
        
        if (location != -1) {
            System.out.println("The element " + element + " is located at index " + location + ".");
        } else {
            System.out.println("The element " + element + " is not found in the array.");
        }
        
        // Close the Scanner
        scanner.close();
    }
    
    public static int findElementLocation(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        
        // Element not found, return -1
        return -1;
    }
}