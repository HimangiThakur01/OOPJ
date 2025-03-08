
/*1. Create a program that declares and initializes all primitive data types in Java and prints their default and assigned values.*/

/*public class PrimitiveDataType{
   
    byte defaultByte;
	short defaultShort;
	int defaultInt;
	long  defaultLong;
	float  defaultFloat;
	double defaultDouble;
	char   defaultChar;
	boolean defaultBoolean;
	
    public static void main(String[] args) {
    byte myByte = 10;
	short myShort = 100;
	int myInt = 1000;
	long myLong = 1000000;
	float myFloat = 12.5f;
	double myDouble = 99.99;
	char myChar  = 'A';
	boolean myBoolean = true;
	
	System.out.println("Assigned Value:");
	System.out.println("byte: " + myByte);
	System.out.println("short: " + myShort);
	System.out.println("int: " + myInt);
	System.out.println("long: " + myLong);
	System.out.println("float: " + myFloat);
	System.out.println("double: " + myDouble);
	System.out.println("char: " + myChar);
	System.out.println("boolean: " + myBoolean);
	
	
	PrimitiveDataType obj = new PrimitiveDataType();
	System.out.println("byte: " + obj.defaultByte);
	System.out.println("short: " + obj.defaultShort);
	System.out.println("int: " + obj.defaultInt);
	System.out.println("long: " + obj.defaultLong);
	System.out.println("float: " + obj.defaultFloat);
	System.out.println("double: " + obj.defaultDouble);
	System.out.println("char: " + obj.defaultChar);
	System.out.println("boolean: " + obj.defaultBoolean);
	
	}
}*/
	

/*2. Write a program to convert an int value to double automatically and display both values.
    class TypeConversion {
		public static void main(String[] args) {
			int myValue = 10;
			double doubleValue = myValue;
			
			System.out.println("Integer Value: " + myValue);
			System.out.println("Converted Double Value: " + doubleValue);
		}
	}	
   OUTPUT:
E:\OOPJ\MY QUESTIONS>javac TypeConversion.java
E:\OOPJ\MY QUESTIONS>java TypeConversion
Integer Value: 10
Converted Double Value: 10.0

   
3. Write a program to convert a double value to int using typecasting and explain the data loss.

   class TypeCasting {
	   public static void main(String[] args) {
		   double myValue = 10.05;
		   int intValue = (int) myValue;
		   
		System.out.println("Original Double Value: " + myValue);
		System.out.println("Converted Double Value: " + intValue);
	   }
   }
  OUTPUT:
OOPJ\MY QUESTIONS>javac TypeCasting.java
E:\OOPJ\MY QUESTIONS>java TypeCasting
Original Double Value: 10.05
Converted Double Value: 10


4. Write a program to calculate the average of three int numbers using typecasting to display the result in double.
                                                      // my capitalizing each word of class is pascalclassing
  class AverageOFThree {                               
	  public static void main(String[] args) {
		  int FirstValue = 20;
		  int SecondValue = 48;
		  int ThirdValue = 96;
		  double average = ((double) (FirstValue + SecondValue +ThirdValue)) / 3;
		  System.out.println("Average: " + average);
	  }
  }
  output:
\OOPJ\MY QUESTIONS>javac AverageOFThree.java
E:\OOPJ\MY QUESTIONS>java AverageOFThree
Average: 54.666666666666664      \\double always gives value till 14,15 decimal.


5. Write a program to demonstrate binary, octal, hexadecimal, and floating-point literals in Java.
    class LiteralsInJava {
		public static void main(String[] args) {
			// Binary literal (prefix: 0b or 0B)
			int binaryNum = 0b1010;
			
			//Octal literal (prefix: 0)
			int octalNum = 012;
			
			//Hexadecimal literal (prefix: 0x or 0X)
			int hexadecimalNum = 0xAB9;
			
			//Floating point literal
			float floatNum = 3.14678f; // ('f' or 'F' is required)
			
			double doubleNum = 1.6678996654; 
			
			double sciNum = 2.84e3; // 2.84 * 10^3 = 2840.00
			System.out.println("Binary: " + binaryNum);
			System.out.println("Octal: " + octalNum);
			System.out.println("Hexadecimal: " + hexadecimalNum);
			System.out.println("Float: " + floatNum);
			System.out.println("Double: " + doubleNum);
			System.out.println("SciDouble: " + sciNum);
			
		}
	}
	OUTPUT:
E:\OOPJ\MY QUESTIONS>javac LiteralsInJava.java
E:\OOPJ\MY QUESTIONS>java LiteralsInJava
Binary: 10
Octal: 10
Hexadecimal: 2745
Float: 3.14678
Double: 1.6678996654
SciDouble: 2840.0	

6. Write a program to display character and string literals along with their ASCII values.*/
class AssiiV {
	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = '@';
		char ch3 = '4';
		
		System.out.println(ch1 + "->" + (int) ch1);
		System.out.println(ch2 + "->" + (int) ch2);
	    System.out.println(ch3 + "->" + (int) ch3);
		
		String str = "Hello";
		 for(int i = 0; i < str.length(); i++) {
		System.out.println(str.charAt(i) + "->" + (int) str.charAt(i));
	}
		
  }
}
OUTPUT:
E:\OOPJ\MY QUESTIONS>java AssiiV
A->65
@->64
4->52
H->72
e->101
l->108
l->108
o->111


/*7. Write a program that uses boolean literals to control program flow in an if-else statement.
   import java.util.Scanner;
   class XYZ {
	   public static void main(String[] args) {
		   Scanner in = new Scanner(System.in);
		   
		   System.out.println("Enter the boolean: ");
		   boolean isRaining = in.nextBoolean();
		   
		   if (isRaining) {
		      System.out.println("Take an umbrella! ");}
		   else {
			   System.out.println("NO need to take an umbrella! ");
			   }
	   }
   }*/
/*8. Write a program to perform addition, subtraction, multiplication, division, and modulus operations on two integer numbers and display the results.
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
    OUTPUT:
E:\OOPJ\MY QUESTIONS>java IntegerOperations
Enter the first Num:
87
Enter the Second Num:
46
 Addition is: 133
 Substraction is: 41
 Multiplication is: 4002
 Division is: 1.0
 Modulus is: 41.0
 
 
 
 

9. Write a program to compare two integers using all relational operators (==, !=, >, <, >=, <=) and display the results.*/

/*import java.util.Scanner;

  class CompareIntegers {
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
        
10. Write a program to check if a number is positive and even using logical operators (&&, ||, !).

import java.util.Scanner;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Check if the number is positive and even using logical operators
        if (num > 0 && num % 2 == 0) {
            System.out.println("The number is positive and even.");
        } else if (num > 0 && num % 2 != 0) {
            System.out.println("The number is positive but not even.");
        } else if (num <= 0) {
            System.out.println("The number is not positive.");
        }
        
        // Demonstrate the use of '||' and '!' operators
        if (num < 0 || num % 2 != 0) {
            System.out.println("The number is either negative or odd.");
        }
        
        if (!(num > 0)) {
            System.out.println("The number is not positive (using ! operator). ");
        }
    }
}

11. Write a program to demonstrate the use of assignment operators (=, +=, -=, *=, /=, %=) on two integers.*/
/*import java.util.Scanner;
  class AssignmentOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number1: ");
        int Num1 = sc.nextInt();		
		
		System.out.println("Enter a Number2: ");
        int Num2 = sc.nextInt();	
          
        System.out.println("Num1 = Num2: " + Num1 = Num2);
        System.out.println("Num1 += Num2: " + Num1 += Num2);
        System.out.println("Num1 -= Num2: " + Num1 -= Num2);
        System.out.println("Num1 *= Num2: " + Num1 *= Num2);
        System.out.println("Num1/=Num2: " + Num1/=Num2);
        System.out.println("Num1 %= Num2: " + Num1 %= Num2);
	}
  }*/