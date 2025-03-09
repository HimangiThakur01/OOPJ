/*Array coding question :
1. Find the Largest and Smallest Element
○ Given an array, find the smallest and largest elements in it.
class MinMax {
   static void findMinMax(int[] arr) {
      if (arr == null || arr.length == 0) {
	  return;
	  }
	  
	  int Min = arr[0];
	  int Max = arr[0];
	  
	  for(int i = 1; i < arr.length; i++) {
	      if (arr[i] < Min) {
		      Min = arr[i];
		  } else if (arr[i] > Max) {
		      Max = arr[i];
		  }
	 }
	  
	  System.out.println("Smallest Element: " + Min);
	  System.out.println("Largest Element: " + Max);
	 }
	 
	 public static void main(String[] args) {
	   int[] numbers = {1,4,6,2,9,5,8};
	     findMinMax(numbers);
	   }
	 }
2. Reverse an Array
○ Reverse the given array in place.*/





3. Find the Second Largest Element
○ Find the second-largest element in the given array.
 class LargestArray {
	 public static void main(String[] args) {
		 int[] arr = {1, 235,98,456,6333};
		 for(int i=0; i<a.length; i++)
		 {
              for(int j=0; 	j<a.length; j++)
              {
                   if(a[i]>a[j])
                   {
                       int temp=a[i];
                       a[i]=a[j];
                       a[j]=temp;
				}
              }
         }
          System.out.println(a[1]);
	 }
 }	 
		 
		
      


/*4. Count Even and Odd Numbers
○ Count the number of even and odd numbers in an array.
5. Find Sum and Average
○ Compute the sum and average of all elements in the array.
6. Remove Duplicates from a Sorted Array
○ Remove duplicate elements from a sorted array without using extra space.
7. Rotate an Array
○ Rotate the array to the right by k positions.
8. Merge Two Sorted Arrays
○ Merge two sorted arrays into a single sorted array without using extra space.
9. Find Missing Number in an Array
○ Given an array of size n-1 containing numbers from 1 to n, find the missing number.
10. Find Intersection and Union of Two Arrays
○ Find the intersection and union of two unsorted arrays.
11. Find a Subarray with Given Sum
○ Given an array of integers, find the subarray that sums to a given value S.
12. Write a program to accept 20 integer numbers in a single Dimensional Array. Find and
Display the following:
○ Number of even numbers.
○ Number of odd numbers.
○ Number of multiples of 3
13. Write a program to accept the marks in Physics, Chemistry and Maths secured by 20 class
students in a single Dimensional Array. Find and display the following:
○ Number of students securing 75% and above in aggregate.
○ Number of students securing 40% and below in aggregate.
14. Write a program in Java to accept 20 numbers in a single dimensional array arr[20]. Transfer
and store all the even numbers in an array even[ ] and all the odd numbers in another array
odd[ ]. Finally, print the elements of the even & the odd array.
15. Write a Java program to print all sub-arrays with 0 sum present in a given array of integers.
Example:
Input :
nums1 = { 1, 3, -7, 3, 2, 3, 1, -3, -2, -2 }
nums2 = { 1, 2, -3, 4, 5, 6 }
nums3= { 1, 2, -2, 3, 4, 5, 6 }
Output:
Sub-arrays with 0 sum : [1, 3, -7, 3]
Sub-arrays with 0 sum : [3, -7, 3, 2, 3, 1, -3, -2]
Sub-arrays with 0 sum : [1, 2, -3]
Sub-arrays with 0 sum : [2, -2]*/



