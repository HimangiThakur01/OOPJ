 import java.util.Scanner;
   class XYZ {
	   public static void main(String[] args) {
		   Scanner in = new Scanner(System.in);
		   
		   System.out.println("Enter the first boolean: ");
		   boolean isRaining = in.nextBoolean();
		   
		   //boolean isRaining = false;
		   
		   if (isRaining) {
		      System.out.println("Take an umbrella! ");}
		   else {
			   System.out.println("NO need to take an umbrella! ");
			   }
	   }
   }