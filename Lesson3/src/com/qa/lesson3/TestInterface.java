package com.qa.lesson3;

public interface TestInterface {
    /**
     * abstract method
     */
    void printPhrase();

    /**
     * abstract method
     *
     * @param  numOfDay number of the day
     * @return          name of the day
     */
    String returnDayNameByNum(int numOfDay);

    /**
     * abstract method
     *
     * @param  name name of the day
     * @return      number of the day
     */
    int returnDayNumByName(String name);
}