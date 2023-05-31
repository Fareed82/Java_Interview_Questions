package YuliiaOst;

public class SwapNumbers {

    public static void swap(int a, int b) {

        System.out.println("Before swapping: a = " + a + ", b = " + b);


        a = a + b; // we add the values of a and b and assign the sum to the variable a. We store the combined value of both variables in a
        b = a - b; // we subtract the original value of b from the updated value of a. The result is assigned to b. We store the original value of a (which was stored in the updated a) in b
        a = a - b; // we subtract the updated value of b from the updated value of a. The result is assigned to a. This step swaps the original value of b (which is now stored in a) with the original value of a (which is now stored in b)

        /*
                   sum
        midA = oldA + oldB = a + b       midA = temporary A       midA oldB
               newB   newA

        newB = sum - oldB = midA - oldB = a - b                   midA newB        newB = a - b = (a + b) - b = a

        newA = sum - oldA = midA - newB = a - b                   newA newB        newA = a - b = (a + b) - a = b

         */

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {

        swap(5, 10);

    }

}

/*
Swap 2 variable' values without using a 3rd variable
 */
