package Tati.secondWeek;

public class ConsecutiveNum {

    public static void consecutive(int num) {
        String result = "";
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println();
                result += "CodilityTestCoders";
            }
            else if (i % 2 == 0 && i % 3 == 0){
                System.out.println();
                result += "CodilityTest";
            }
            else if (i % 2 == 0){
                System.out.println();
                result += "Codility";
            }
            else if (i % 3 == 0){
                System.out.println();
                result += "Test";
            }
            else if (i % 5 == 0){
                System.out.println();
                result += "Coders";
            }
            else{
                System.out.println();
                result += i;
            }
        }
        System.out.println(result);
    }
}
/*
Numbers divisible by 2 -> Codility
Numbers divisible by 3 -> Test
Numbers divisible by 5 -> Coders
Numbers divisible by both 2 and 3 -> CodilityTest
Numbers divisible by both 2,3,5 -> CodilityTestCoders
 */