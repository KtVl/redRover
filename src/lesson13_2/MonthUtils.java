package lesson13_2;
/*Создать класс MonthUtils который бы хранил
подготовленные месяцы или их массивы для использования (объекты класса Month).
Статические поля с объектами месяцев должны быть финальными
Создать статические методы возвращающие кварталы (массивы по 3 месяца
соответственно), полугодия и год.
*/
public class MonthUtils {
    public static class Month {
        private final String namesOfMonths;
        private final int days;
        private final int workingDays;

        private Month(String namesOfMonths, int days, int workingDays) {
            this.namesOfMonths = namesOfMonths;
            this.days = days;
            this.workingDays = workingDays;
        }

        public String getNamesOfMonths() {
            return namesOfMonths;
        }

        public int getDays() {
            return days;
        }

        public int getWorkingDays() {
            return workingDays;
        }
    }



    public static final Month JANUARY = new Month("January", 31, 15);
    public static final Month FEBRUARY = new Month("February", 28, 20);
    public static final Month MARCH = new Month("March", 31, 15);
    public static final Month APRIL = new Month("April", 30, 20);
    public static final Month MAY = new Month("May", 31, 20);
    public static final Month JUNE = new Month("June", 30, 20);
    public static final Month JULY = new Month("July", 31, 20);
    public static final Month AUGUST = new Month("August", 31, 20);
    public static final Month SEPTEMBER = new Month("September", 30, 20);
    public static final Month OCTOBER = new Month("October", 31, 20);
    public static final Month NOVEMBER = new Month("November", 30, 20);
    public static final Month DECEMBER = new Month("December", 31, 20);

    public static final Month[] YEAR = new Month[] {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
            JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    };

    public static Month[] getYear() {
        return YEAR;
    }


    public static final Month[] QUARTER1 = new Month[] {JANUARY, FEBRUARY, MARCH};
    public static final Month[] QUARTER2 = new Month[] {APRIL, MAY, JUNE};
    public static final Month[] QUARTER3 = new Month[] {JULY, AUGUST, SEPTEMBER};
    public static final Month[] QUARTER4 = new Month[] {OCTOBER, NOVEMBER, DECEMBER};

    public static Month[] getQuarter1() {
        return QUARTER1;
    }
    public static Month[] getQuarter2() {
        return QUARTER2;
    }
    public static Month[] getQuarter3() {
        return QUARTER3;
    }
    public static Month[] getQuarter4() {
        return QUARTER4;
    }

    public static Month[] getYearQuarter(int numberQuarter) {
        if (numberQuarter == 1) {
            return QUARTER1;
        } else if (numberQuarter == 2) {
            return QUARTER2;
        } else if (numberQuarter == 3) {
            return QUARTER3;
        } else if (numberQuarter == 4) {
            return QUARTER4;
        } return new Month[0];
    }


    public static Month[] HALFYEARFIRST = new Month[] {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE};
    public static Month[] HALFYEARSECOND = new Month[] {JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};

    public static Month[] getHALFYEARFIRST() {
        return HALFYEARFIRST;
    }

    public static Month[] getHALFYEARSECOND() {
        return HALFYEARSECOND;
    }

    public static Month[] getHalfYear(int halfNumber) {
        if (halfNumber == 1) {
            return HALFYEARFIRST;
        } else if (halfNumber == 2) {
            return HALFYEARSECOND;
        } else {
            return null;
        }
    }
}
