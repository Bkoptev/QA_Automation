package com.qa.lesson3;

public class InterfacePrintPhrase implements TestInterface {


    public void printPhrase() {
        System.out.println("Test phrase on my choice");
    }

    public String returnDayNameByNum(int numOfDay) {
        String dayName = "";
        switch (numOfDay) {
            case 1:
                dayName = DaysOfWeek.MONDAY.getValue();
                break;
            case 2:
                dayName = DaysOfWeek.TUESDAY.getValue();
                break;
            case 3:
                dayName = DaysOfWeek.WEDNESDAY.getValue();
                break;
            case 4:
                dayName = DaysOfWeek.THURSDAY.getValue();
                break;
            case 5:
                dayName = DaysOfWeek.FRIDAY.getValue();
                break;
            case 6:
                dayName = DaysOfWeek.SATURDAY.getValue();
                break;
            case 7:
                dayName = DaysOfWeek.SUNDAY.getValue();
                break;
        }
        return dayName;
    }
    public int returnDayNumByName(String dayName1) {
        int DayNum = 0;
        switch (dayName1) {
            case "Monday":
                DayNum = DaysOfWeek.MONDAY.getNumber();
                break;
            case "Tuesday":
                DayNum = DaysOfWeek.TUESDAY.getNumber();
                break;
            case "Wednesday":
                DayNum = DaysOfWeek.WEDNESDAY.getNumber();
                break;
            case "Thursday":
                DayNum = DaysOfWeek.THURSDAY.getNumber();
                break;
            case "Friday":
                DayNum = DaysOfWeek.FRIDAY.getNumber();
                break;
            case "Saturday":
                DayNum = DaysOfWeek.SATURDAY.getNumber();
                break;
            case "Sunday":
                DayNum = DaysOfWeek.SUNDAY.getNumber();
                break;
        }
        return DayNum;
    }
}
