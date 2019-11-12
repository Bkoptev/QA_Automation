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
                name = Month.JANUARY.getValue();
                break;
            case 2:
                name = Month.FEBRUARY.getValue();
                break;
            case 3:
                name = Month.MARCH.getValue();
                break;
            case 4:
                name = Month.APRIL.getValue();
                break;
            case 5:
                name = Month.MAY.getValue();
                break;
            case 6:
                name = Month.JUNE.getValue();
                break;
            case 7:
                name = Month.JULY.getValue();
                break;
            case 8:
                name = Month.AUGUST.getValue();
                break;
            case 9:
                name = Month.SEPTEMBER.getValue();
                break;
            case 10:
                name = Month.OCTOBER.getValue();
                break;
            case 11:
                name = Month.NOVEMBER.getValue();
                break;
            case 12:
                name = Month.DECEMBER.getValue();
                break;
        }
        return name;

    }
}
