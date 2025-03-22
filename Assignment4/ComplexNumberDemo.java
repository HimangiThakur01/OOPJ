class ComplexNumber {
  double real;
  double imaginary;
  
  ComplexNumber() {
     real = 0;
	 imaginary = 0;
	 }
	 ComplexNumber(double real) {
	 this.real = real;
	 this.imaginary = 0;
	 }
	 ComplexNumber(double real, double imaginary){
	 this.real = real;
	 this.imaginary = imaginary;
	 
	}
	public ComplexNumber add(ComplexNumber c) {
    return new ComplexNumber(this.real+c.real, this.imaginary+c.imaginary);
	}
	public ComplexNumber multiply(ComplexNumber c) {
		return new ComplexNumber(this.real*c.real, this.imaginary*c.imaginary);
	}	
	public void display() {
			if(imaginary>=0) {
				System.out.println(real+imaginary);
			}
			else{
				System.out.println(real+Math.abs(imaginary));
			}
		}
}
	public class ComplexNumberDemo{
	public static void main(String[] args){
			ComplexNumber  c1 = new ComplexNumber(91, 18);
			ComplexNumber  c2 = new ComplexNumber(90, -12);
			
	              System.out.println("Complex Number 1: ");
			c1.display();
		       System.out.println("Complex Number 2: ");
			   c2.display();
			   
			ComplexNumber sum = c1.add(c2);
			System.out.print("Add: ");
			sum.display();
			
			ComplexNumber product = c1.multiply(c2);
			System.out.print("Product: ");
			product.display();
			
	}
}