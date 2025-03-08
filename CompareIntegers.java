9. Write a program to compare two integers using all relational operators (==, !=, >, <, >=, <=) and display the results.*/

import java.util.Scanner;

public class CompareIntegers {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for two integer inputs
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Perform relational comparisons
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2));
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 < num2: " + (num1 < num2));
        System.out.println("num1 >= num2: " + (num1 >= num2));
        System.out.println("num1 <= num2: " + (num1 <= num2));
	}
}
        

