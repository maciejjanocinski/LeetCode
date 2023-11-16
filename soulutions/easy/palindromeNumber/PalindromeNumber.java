package soulutions.easy.palindromeNumber;

public class PalindromeNumber {
    public boolean solution(int x) {
        return Integer.toString(x).contentEquals(new StringBuilder(Integer.toString(x)).reverse());
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.solution(121));
        System.out.println(palindromeNumber.solution(-121));
    }
}
