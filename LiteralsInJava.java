/*Notepad++ v8.7.7 regression-fix from v8.7.6:

 1. Add new API NPPM_ADDSCNMODIFIEDFLAGS to fix eventual regression regarding SCN_MODIFIED for some plugins.


Notepad++ v8.7.6 regression-fixes, bug-fixes & enhancements:

 1. Update to scintilla 5.5.3 & Lexilla 5.4.1.
 2. Enhance performance of syntax highlighting for large files.
 3. Make "Show close/pin button on each inactive tab" optional.
 4. Add ShortcutMapper Multilingual ability, allowing the use of specific keys for non-en-US keyboards.
 5. Fix vertical tab crashes when enabling/disabling the pin tab feature.
 6. Fix crash when passing an invalid buffer with NPPM_SETUNTITLEDNAME.
 7. Fix floating panels position resetting regression in multi-monitor configurations.
 8. Fix incorrect "Replace all" behavior during the second replace in selection.
 9. Fix backup file renaming bug for untitled tabs.
10. Enhance UX in "Find in file" action when the Directory field is empty.
11. Make the current line/position copyable in the Go to Line dialog.
12. GUI enhancement: hide right menu shortcuts on the fly.
13. Minor enhancements for JavaScript, CSS & HTML.



Get more info on
https://notepad-plus-plus.org/downloads/v8.7.7/


Included plugins:

1.  NppExport v0.4
2.  Converter v4.6
3.  Mime Tool v3.1


Updater (Installer only):

* WinGUp (for Notepad++) v5.3.1


1. Create a program that declares and initializes all primitive data types in Java and prints their default and assigned values.*/

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


5. Write a program to demonstrate binary, octal, hexadecimal, and floating-point literals in Java.*/
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
			

/*6. Write a program to display character and string literals along with their ASCII values.
7. Write a program that uses boolean literals to control program flow in an if-else statement.
8. Write a program to perform addition, subtraction, multiplication, division, and modulus operations on two integer numbers and display the results.
9. Write a program to perform addition, subtraction, multiplication, division, and modulus operations on two integer numbers and display the results.
10. Write a program to compare two integers using all relational operators (==, !=, >, <, >=, <=) and display the results.
11. Write a program to check if a number is positive and even using logical operators (&&, ||, !).
12. Write a program to demonstrate the use of assignment operators (=, +=, -=, *=, /=, %=) on two integers.*/

