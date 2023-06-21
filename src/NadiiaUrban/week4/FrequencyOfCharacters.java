package NadiiaUrban.week4;

import java.util.*;

public class FrequencyOfCharacters {

    /*
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */


    public static void main(String[] args) {


        String str = "AAABBCDD111333444";

        frequencyOfCharactersMaps(str);
        frequencyOfCharactersFori(str);


    }


    public static void frequencyOfCharactersMaps(String str) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String each : list) {
            map.put(each, Collections.frequency(list, each));
        }
        System.out.println(map);
    }


    public static void frequencyOfCharactersFori(String str) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < list.size() ; j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            if (!result.contains(list.get(i))) {
                result += list.get(i) + count+" ";
            }
        }
        System.out.println(result);
    }

}
