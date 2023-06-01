package VladimirKozhanov.Java.week3;

public class PrimeNumber {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if(isPrime(i)){
                System.out.println(i);
            };
        }

    }


    public static boolean isPrime(int numb) {

        for (int i = 2; i < numb; i++) {
            if (numb % i == 0) {
                return false;
            }
        }
        return true;
    }









}

