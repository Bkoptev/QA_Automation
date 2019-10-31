package com.qa.automation;

import java.util.Arrays;

public class Lesson1Part1 {
    public static void main(String[] args) {
        int varInt = 14231;
        double varDouble;
        String varString ;
        varString = Integer.toString(varInt);
        varDouble = Double.parseDouble(varString);
        varInt = (int) varDouble;
        System.out.println(varInt);
        System.out.println(varDouble);
        System.out.println(varString);
    }
}
