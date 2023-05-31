package Java_Interview_QuestionsWeek2;

public class DivisibleBy_3_5_15 {
    public static void main(String[] args) {
        divisible_3_5_15();

    }

    public static void divisible_3_5_15() {
        String by3 = "";
        String by5 = "";
        String by15 = "";

        for (int i = 1; i <= 100; i++) {

            if (i % 15 == 0) {
                by15 += i + " ";

            } else if (i % 3 == 0) {
                by3 += i + " ";

            } else if (i % 5 == 0) {
                by5 += i + " ";
            }

        }
        System.out.println("Divisible By 3: " + by3);
        System.out.println("Divisible By 5: " + by5);
        System.out.println("Divisible By 15: " + by15);


    }

}
