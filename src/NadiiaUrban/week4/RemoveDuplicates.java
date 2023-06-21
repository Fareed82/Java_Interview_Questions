package NadiiaUrban.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    /*
    Write a return method that can remove the duplicated values from
   String
        Ex: removeDup("AAABBBCCC") ==> ABC
   */

    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCC"));
       removeDuplicates2("AAABBBCCC");

    }

    public static String removeDuplicates (String str){
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        String result = "";
        for (String each : list) {
            if(!result.contains(each)){
                result+=each;
            }
        }
     return result;
    }


    public static void removeDuplicates2 (String str){
        Set<String> set = new LinkedHashSet<>(Arrays.asList(str.split("")));
        System.out.println(set);
    }

}

