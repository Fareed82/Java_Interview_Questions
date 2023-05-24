package wahiba;public class Division {

    public static int Division(int num1, int num2) {
        boolean negative = false;
        if (num1 < 0) {
            num1 = -num1;
            negative = true;
        }
            if (num2 < 0) {
                num2 = -num2;
                negative = true;
            }
            int result = 0;
            while (num1 >= num2) {
                num1 -= num2;
                result++;
            }
                if (negative) {
                    result = -result;

                }
                return result;
            }

    public static void main(String[] args) {
        System.out.println(Division(6,3));
    }
    }
