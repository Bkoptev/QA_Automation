package com.qa.lesson3;

public class PrintDaysOfWeek implements TestInterface {

    /**
     * Printing dedicated phrase
     */
    public void printPhrase() {
        System.out.println("Test phrase on my choice");
    }

    /**
     *
     * @param  numOfDay number of the day
     * @return          the name of the day
     */
    public String returnDayNameByNum(int numOfDay) {
        switch (numOfDay) {
            case 1:
                return DaysOfWeek.MONDAY.getValue();
            case 2:
                return DaysOfWeek.TUESDAY.getValue();
            case 3:
                return DaysOfWeek.WEDNESDAY.getValue();
            case 4:
                return DaysOfWeek.THURSDAY.getValue();
            case 5:
                return DaysOfWeek.FRIDAY.getValue();
            case 6:
                return DaysOfWeek.SATURDAY.getValue();
            case 7:
                return DaysOfWeek.SUNDAY.getValue();
        }
        return "";
    }

    /**
     *
     * @param  dayName name of the day
     * @return         number of the day
     */

    public int returnDayNumByName(String dayName) {

        switch (dayName) {
            case "Monday":
                return DaysOfWeek.MONDAY.getNumber();
            case "Tuesday":
                return DaysOfWeek.TUESDAY.getNumber();
            case "Wednesday":
                return DaysOfWeek.WEDNESDAY.getNumber();
            case "Thursday":
                return DaysOfWeek.THURSDAY.getNumber();
            case "Friday":
                return DaysOfWeek.FRIDAY.getNumber();
            case "Saturday":
                return DaysOfWeek.SATURDAY.getNumber();
            case "Sunday":
                return DaysOfWeek.SUNDAY.getNumber();
        }
        return 0;
    }
}
