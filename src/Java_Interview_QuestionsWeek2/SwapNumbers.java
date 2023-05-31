package Java_Interview_QuestionsWeek2;

public class SwapNumbers {
    public static void main(String[] args) {

        int a = 8,
                b = 2;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
