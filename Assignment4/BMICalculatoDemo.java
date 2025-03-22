import java.util.*;
class BMICalculator {
  double height;
  double weight;
   BMICalculator(double height, double weight){
    this.height = height;
	this.weight = weight;
  }
  public void setHeight() {
	  this.height=height;
  }
  public void setWeight() {
	  this.weight = weight;
  }
  public double getHeight() {
	  return height;
  }
  public double getWeight() {
		return weight;
 }
public double calculate() {
   	  return weight/(height*height);
 }
}
class BMICalculatoDemo{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Height: ");
	double height = sc.nextDouble();
	System.out.println("Enter weight: ");
	double weight = sc.nextDouble();
	
	BMICalculator obj = new BMICalculator(height, weight);
	double bmi = obj.calculate();
	System.out.println(bmi);
	
	}
	
}