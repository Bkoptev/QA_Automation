package com.qa.lesson3;

public class Runner {
    public static void main(String[] args) {
        PrintDaysOfWeek printSmth = new PrintDaysOfWeek();
        InherAbstract  numOfM = new InherAbstract(1);

        System.out.println(printSmth.returnDayNameByNum(2));
        System.out.println(printSmth.returnDayNumByName("Friday"));
        System.out.println(numOfM.getMonthNameByNum(1));
        printSmth.printPhrase();
        numOfM.printPhrase();
    }
}
