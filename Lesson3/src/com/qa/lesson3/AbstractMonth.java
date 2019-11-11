package com.qa.lesson3;

public abstract class AbstractMonth {

    private int numOfMonth;

    /**
     * Constructor
     *
     * @param numOfMonth
     */
    AbstractMonth(int numOfMonth) {
        this.numOfMonth = numOfMonth;
    }

    abstract void printPhrase();

    public enum Month {
        JANUARY("JANUARY"),
        FEBRUARY("FEBRUARY"),
        MARCH("MARCH"),
        APRIL("APRIL"),
        MAY("MAY"),
        JUNE("JUNE"),
        JULY("JULY"),
        AUGUST("AUGUST"),
        SEPTEMBER("SEPTEMBER"),
        OCTOBER("OCTOBER"),
        NOVEMBER("NOVEMBER"),
        DECEMBER("DECEMBER");

        private String value;

        /**
         * Constructor
         *
         * @param name
         */
        Month(String name) {
            this.value = name;
        }

        /**
         * Getter of month
         *
         * @return string with month
         */
        public String getValue() {
            return value;
        }
    }

    public String getMonthNameByNum(int numOfMonth) {
        String name = "";
        switch (numOfMonth) {
            case 1:
                name = Month.JANUARY.toString();
                break;
            case 2:
                name = Month.FEBRUARY.toString();
                break;
            case 3:
                name = Month.MARCH.toString();
                break;
            case 4:
                name = Month.APRIL.toString();
                break;
            case 5:
                name = Month.MAY.toString();
                break;
            case 6:
                name = Month.JUNE.toString();
                break;
            case 7:
                name = Month.JULY.toString();
                break;
            case 8:
                name = Month.AUGUST.toString();
                break;
            case 9:
                name = Month.SEPTEMBER.toString();
                break;
            case 10:
                name = Month.OCTOBER.toString();
                break;
            case 11:
                name = Month.NOVEMBER.toString();
                break;
            case 12:
                name = Month.DECEMBER.toString();
                break;
        }
        return name;

    }
}
