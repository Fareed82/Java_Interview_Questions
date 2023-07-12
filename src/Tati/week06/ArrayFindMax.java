package Tati.week06;

public class ArrayFindMax {
    /*
    2. Find Maximum:
  Write a method that can find the maximum number from an int Array.
     */
    public static int arrayFindMax(int[] arr) {
        int max = arr[0];
        for (int each : arr) {
            if(each>max)
            {
                max = each;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 4, -89, 6, 0};
        System.out.println(arrayFindMax(arr));
    }
}
