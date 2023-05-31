package VladimirKozhanov.Java.week2;

public class Consecutive {

    public static void main(String[] args) {
int number = 24;

Consecutive(number);



    }



    public static void Consecutive(int number){



        for (int i = 1; i <= number; i++) {
            String result = "";


            if (i % 5 == 0) {
                result += "Coders";
            }
            if (i % 3 == 0) {
                result += "Test";
            }
            if (i % 2 == 0) {
                result += "Codility";
            } else {
                result = "" + i;
            }
            System.out.println(result);
        }


    }

}
