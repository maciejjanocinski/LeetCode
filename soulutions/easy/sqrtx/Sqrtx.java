package soulutions.easy.sqrtx;

public class Sqrtx {
    public int solution(int x) {
        return (int) Math.floor(Math.pow(x, 0.5));
    }

    public static void main(String[] args) {
        int x = 8;
        System.out.println(new Sqrtx().solution(x));
    }
}
