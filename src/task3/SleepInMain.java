package task3;

//The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
//We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

public class SleepInMain {
    public static void main(String[] args) {
        SleepInMain test = new SleepInMain();
        System.out.println(test.sleepIn(false, false));
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
