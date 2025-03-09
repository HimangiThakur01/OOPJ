import java.util.Arrays;
class ArrayDup {
  public static void main(String[] args) {
   int[] arr = {12,34,12,45,1,3,1,5,5};
   
   Arrays.sort(arr);
   
   System.out.println("Sorted Array: " + Arrays.toString(arr));
    
   int uniqueIndex = 0;
   for (int i =1; i < arr.length; i++)
	   if (arr[i] != arr[uniqueIndex])
		     arr[++uniqueIndex] = arr[i];
   System.out.println("Unique Array: " + Arrays.toString(Arrays.copyOf(arr, uniqueIndex + 1)));
  }
 }