package soulutions.easy.plusOne;

import java.math.BigInteger;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        String numbers = "";

        for (int digit : digits
        ) {
            numbers = numbers.concat(Integer.toString(digit));
        }
        BigInteger intNr = new BigInteger(numbers);
        intNr = intNr.add(BigInteger.ONE);

        String[] das = String.valueOf(intNr).split("");

        int[] result = new int[das.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(das[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        plusOne(new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6});
    }
}
