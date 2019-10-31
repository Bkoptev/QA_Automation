package com.qa.automation;

import java.util.Arrays;

public class Lesson1Part2 {
    public static void main(String[] args) {
        int[] intArrayOdd = {1, 2, 3, 5};
        System.out.println(intArrayOdd[0] % 2 != 1 ? "True" : "False");
        System.out.println(intArrayOdd[1] % 2 != 1 ? "True" : "False");
        System.out.println(intArrayOdd[2] % 2 != 1 ? "True" : "False");
        System.out.println(intArrayOdd[3] % 2 != 1 ? "True" : "False");
    }
}
