package soulutions.easy.longestCommonPrefix;

import java.util.*;

public class LongestCommonPrefix {
    public static String solution(String[] strs) {
        List<String[]> list = new ArrayList<>();
        String result ="";
        Set<String> letters = new HashSet<>();


        for (String s: strs
        ) {
            list.add( s.split(""));
        }

        list.sort(Comparator.comparing(array -> array.length));

        for (int i = 0; i < list.get(0).length; i++) {

            for (String[] strings : list) {
                letters.add(strings[i]);
            }

            if(letters.size() == 1){
                result += list.get(0)[i];
                letters.removeAll(letters);
            } else {
                return result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        System.out.println(solution(strs));
    }
}
