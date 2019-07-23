package task3;

//Given an int n, return true if it is within 10 of 100 or 200.

public class NearHundredMain {
    public static void main(String[] args) {
        NearHundredMain test = new NearHundredMain();
        System.out.println(test.nearHundred(89));
    }

    public boolean nearHundred(int n) {
        return n > 89 & n < 111 | n > 189 & n < 211;
    }
}
