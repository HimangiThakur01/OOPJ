import java.util.*;
class Box {
  int height;
  int width;
  int breadth;
  Box(int height, int width, int breadth){
  this.height = height;
  this.width = width;
  this.breadth = breadth;
  }
  public double getVolume(){
      return height*width*breadth;
	  }
 public double getArea(){
      return height*width;
	  }
	  }
	 class BoxDemo{
	 public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("print height: ");
	 int height = sc.nextInt();
	 System.out.println("print width: ");
	 int width = sc.nextInt();
	 System.out.println("print breadth: ");
	 int breadth = sc.nextInt();
	 
	 Box b = new Box(height, width, breadth);
	 System.out.println("Area: " + b.getArea());
	 System.out.println("Volume: " + b.getVolume());
	 }
	 }
	 
	 
	  