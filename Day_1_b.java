
//Program Read and Print an Integer value in Java

import java.util.Scanner;
public class Day_1_b {
    public static void main(String[] args) {
        
    {
        // Declare the variables
        int num;

        // Input the integer
        System.out.println("Enter the integer: ");

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Read the next integer from the screen
        num = sc.nextInt();

        // Display the integer
        System.out.println("Entered integer is: " + num);

        // Close the Scanner object
        sc.close(); // Important to prevent resource leaks
    }
}
    }
