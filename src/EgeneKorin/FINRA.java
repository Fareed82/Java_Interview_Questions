package EgeneKorin;

public class FINRA {
    public static void main(String[] args) {
        String result = "";
        for (int i = 1; i < 31; i++) {                 // for loop .start from # 1 and stop at 30 with one step increment
            if(i% 5 == 0 && i %3 ==0 ) {               // first if check if number multiple of 3 and 5 at same time
                result += "FINRA ";                    // print FINRA if condition is true and skipping to next if false
            } else if (i % 5 == 0) {                   // next condition checking just  multiple of 5
                result += "RA ";                       // printing RA if true And skipping to next if false
            } else if (i % 3 == 0) {
                result += "FIN ";
            } else {
                result += i+" ";                      // all conditions false print number, go to next iteration of loop
            }

            System.out.println(result);
        }
    }
}
/*
FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number.
 */