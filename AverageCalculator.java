package closedLabBook1;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        // Create an array to store the numbers
        double[] numbers = new double[n];
        
        // Read the numbers from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }
        
        // Calculate the average using the separate function
        double average = calculateAverage(numbers);
        
        System.out.println("The average is: " + average);
        
        // Close the Scanner
        scanner.close();
    }
    
    public static double calculateAverage(double[] numbers) {
        double sum = 0;
        
        // Calculate the sum of the numbers
        for (double number : numbers) {
            sum += number;
        }
        
        // Calculate the average
        double average = sum / numbers.length;
        
        return average;
    }
}
