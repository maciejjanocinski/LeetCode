package soulutions.easy.validAnagram;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        char[] ar1 = s.toCharArray();
        char[] ar2 = t.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        return Arrays.equals(ar1, ar2);
    }


    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "car"));
        System.out.println(isAnagram("anagram", "nagaram"));
    }


}
