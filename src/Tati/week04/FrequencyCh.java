package Tati.week04;

public class FrequencyCh {
    public static String frequency(String str){
        String result ="";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {

                if(str.charAt(i)==str.charAt(j)){
                   count++;
                }
            }
            if(result.contains(""+str.charAt(i))){
                continue;
            }

            result+=""+str.charAt(i)+count;


            //str = str.replaceAll(""+str.charAt(i),"");

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(frequency("AAABBCDD"));
    }
}
/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
