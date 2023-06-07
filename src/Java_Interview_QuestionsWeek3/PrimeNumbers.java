package Java_Interview_QuestionsWeek3;

public class PrimeNumbers {
    public static void main(String[] args) {

        System.out.println("1: " + isPrime(1));
        System.out.println("2: " + isPrime(2));
        System.out.println("3: " + isPrime(3));
        System.out.println("4: " + isPrime(4));
        System.out.println("5: " + isPrime(5));
        System.out.println("6: " + isPrime(6));
        System.out.println("7: " + isPrime(7));
        System.out.println("8: " + isPrime(8));

    }

    static boolean isPrime(int number){
        if (number <=1){
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
