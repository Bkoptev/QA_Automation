package com.qa.lesson3;

public class InherAbstract extends AbstractMonth{
    /**
     * Constructor
     *
     * @param numOfMonth number of month
     */
    InherAbstract(int numOfMonth) {
        super(numOfMonth);
    }

    @Override
    void printPhrase() {
        System.out.println("Test phrase on my choice #2");
    }
}