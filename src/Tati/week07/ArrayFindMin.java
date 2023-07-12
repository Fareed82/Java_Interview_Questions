package Tati.week07;

public class ArrayFindMin {
    /*
    1. Array - Find Minimum
  Write a method that can find the minimum number from an int Array

     */
    public static int minNum(int[] arr) {

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                arr[i] = min;
            }

        }
/*
int min = arr[0];
        for(int each : arr){
            if(each < min){
                min = each;
            }
        }
 */
        return min;

    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 4, 89, 6, 0};
        System.out.println(minNum(arr));
    }
}
