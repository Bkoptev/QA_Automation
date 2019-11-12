package com.qa.lesson3;

public enum DaysOfWeek {
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    private String value;
    private int number;

    /**
     * Constructor
     *
     * @param name name of the day
     * @param number number of the day
     */
    DaysOfWeek(String name, int number) {
        this.value = name;
        this.number = number;
    }

    /**
     * Getter of day
     *
     * @return string with day
     */
    public String getValue() {
        return value;
    }

    /**
     * Getter of number
     *
     * @return int with number
     */
    public int getNumber() {
        return number;
    }

}
