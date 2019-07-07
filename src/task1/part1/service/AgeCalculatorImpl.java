package task1.part1.service;

import java.time.LocalDateTime;
import java.time.Period;

public class AgeCalculatorImpl implements AgeCalculator {
    private LocalDateTime birthDay;

    public AgeCalculatorImpl(LocalDateTime birthDay) {
        this.birthDay = birthDay;
    }

    public void calculateAge() {
        long yearsDiff;
        long monthsDiff;
        long daysDiff;
        long hoursDiff;
        long minsDiff;

        LocalDateTime currentTime = LocalDateTime.now();

        if (currentTime.isAfter(birthDay)) {

            Period period = Period.between(birthDay.toLocalDate(), currentTime.toLocalDate());
            yearsDiff = period.getYears();
            monthsDiff = period.getMonths();
            daysDiff = period.getDays();

            if (currentTime.getHour() >= birthDay.getHour()) {
                hoursDiff = currentTime.getHour() - birthDay.getHour();
            } else {
                hoursDiff = currentTime.getHour() - birthDay.getHour() + 24;
                daysDiff -= daysDiff;
            }

            if (currentTime.getMinute() >= birthDay.getMinute()) {
                minsDiff = currentTime.getMinute() - birthDay.getMinute();
            } else {
                minsDiff = currentTime.getMinute() - birthDay.getMinute() + 60;
                if (hoursDiff != 0) {
                    hoursDiff -= hoursDiff;
                } else {
                    hoursDiff = 23;
                    daysDiff -= daysDiff;
                }
            }

            System.out.println(" Current age:");
            System.out.println("Years: " + yearsDiff);
            System.out.println("Months: " + monthsDiff);
            System.out.println("Days: " + daysDiff);
            System.out.println("Hours: " + hoursDiff);
            System.out.println("Minutes: " + minsDiff);

        } else {
            System.out.println("exception: invalid birthday date");
        }


    }
}
