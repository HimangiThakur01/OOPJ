class SumAveArr {
  public static void main(String[] args) {
   int [] arr ={1,4,89,87,45};
    int sum = 0;
    for(int num : arr) {
		
	    sum += num;
	 }
	double average = (double) sum / arr.length;
	
	System.out.println("Sum of array: " + sum);
	System.out.println("Average of array: " + average);
	
	}
}
	