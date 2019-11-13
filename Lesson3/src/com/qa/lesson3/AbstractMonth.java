package com.qa.lesson3;

public abstract class AbstractMonth {

    private int numOfMonth;

    /**
     * Constructor
     *
     * @param numOfMonth number of month
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
         * @param  name name of the month
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

    /**
     * return name of the month by it's number
     *
     * @param numOfMonth number of the month
     * @return           name of the month by it's number
     */
    public String getMonthNameByNum(int numOfMonth) {
        switch (numOfMonth) {
            case 1:
                return Month.JANUARY.getValue();
            case 2:
                return Month.FEBRUARY.getValue();
            case 3:
                return Month.MARCH.getValue();
            case 4:
                return Month.APRIL.getValue();
            case 5:
                return Month.MAY.getValue();
            case 6:
                return Month.JUNE.getValue();
            case 7:
                return Month.JULY.getValue();
            case 8:
                return Month.AUGUST.getValue();
            case 9:
                return Month.SEPTEMBER.getValue();
            case 10:
                return Month.OCTOBER.getValue();
            case 11:
                return Month.NOVEMBER.getValue();
            case 12:
                return Month.DECEMBER.getValue();
        }
        return "";

    }
}
