 8. Write a program to perform addition, subtraction, multiplication, division, and modulus operations on two integer numbers and display the results.*/
import java.util.Scanner;
class IntegerOperations {
   public static void main(String[] args)
   {
	   Scanner in = new Scanner(System.in);
	   
	   System.out.println("Enter the first Num: ");
	   int num1 = in.nextInt();
	   
	   System.out.println("Enter the Second Num: ");
	   int num2 = in.nextInt();
	   
	   int addition = num1 + num2;
	   int substraction = num1 - num2;
       int multiplication = num1 * num2;
       float division = num1 / num2;
       double modulus = num1 % num2;	   
	   
	 System.out.println(" Addition is: " + addition );
	 System.out.println(" Substraction is: " + substraction );
	 System.out.println(" Multiplication is: " + multiplication );
	 System.out.println(" Division is: " + division );
	 System.out.println(" Modulus is: " + modulus );
   }
}

