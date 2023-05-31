package Interview_Questions.Week_1;

public class FINRA {

    public static void main(String[] args) {

        System.out.println("The following method will be for numbers from 1 - 30");
        System.out.println();

        Finra();

    }

    public static void Finra() {
        String result = "";

        for (int i = 1; i <= 30; i++) {

            if (i % 15 == 0) {
                result += "FINRA ";
            } else if (i % 5 == 0) {
                result += "RA ";
            } else if (i % 3 == 0) {
                result += "FIN ";
            } else {
                result += i + " ";
            }
        }
        System.out.println(result);
    }


}
