 import java.util.Arrays;
 class RotateArr {
  public static void main(String[] args) {
    int[] arr = {2,3,5,7,8,4,9};
     int k = 5, n = arr.length;
	  k %= n;
	  
	  reverse(arr, 0, n-1);
	  reverse(arr, 0, k-1);
	  reverse(arr, k, n-1);
	  System.out.println("Rotated Array: " + Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
}