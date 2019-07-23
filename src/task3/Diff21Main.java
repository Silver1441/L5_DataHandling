package task3;

//Given an int n, return the absolute difference between n and 21,
//except return double the absolute difference if n is over 21.

public class Diff21Main {
    public static void main(String[] args) {
        Diff21Main test = new Diff21Main();
        System.out.println(test.diff21(25));
    }

    public int diff21(int n) {
        if (n > 21) {
            return 2 * (n - 21);
        } else {
            return Math.abs(21 - n);
        }
    }
}
