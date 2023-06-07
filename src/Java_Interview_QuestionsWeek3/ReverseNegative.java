package Java_Interview_QuestionsWeek3;

public class ReverseNegative {
    public static void main(String[] args) {
        System.out.println(reverseNegative(-69));
    }

    public static int reverseNegative(int num) {

        num = Math.abs(num);
        String str = "" + num;
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        int revnum = Integer.parseInt(reverse);
        return revnum;
    }

}
