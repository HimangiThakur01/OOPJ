import java.util.*;

class Student {
	
	String name;
	int mar1;
	int mar2;
	int mar3;
	
	Student(String name, int mar1, int mar2, int mar3)
	{
	this.name = name;
	this.mar1 = mar1;
	this.mar2 = mar2;
	this.mar3 = mar3;
	}	
	void totalAndAve(){
		int total=mar1+mar2+mar3;
		double Average=total/3;
		System.out.println("Total marks: " + total);
		System.out.println("Average: " + Average);
	}
	void displayDetails() {
		System.out.println("Name: " + name);
	}
}
	class StudentDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("name: ");
		String name = sc.nextLine();
		System.out.println("mar1");
		int mar1 = sc.nextInt();
		System.out.println("mar1");
		int mar2 = sc.nextInt();
		System.out.println("mar1");
		int mar3 = sc.nextInt();
		
		Student s = new Student(name, mar1, mar2, mar3);
		 s.totalAndAve();
		 s.displayDetails();
		
		

	}
	
}
