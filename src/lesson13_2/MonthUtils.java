package lesson13_2;
/*Создать класс MonthUtils который бы хранил
подготовленные месяцы или их массивы для использования (объекты класса Month).
Статические поля с объектами месяцев должны быть финальными
Создать статические методы возвращающие кварталы (массивы по 3 месяца
соответственно), полугодия и год.
*/
public class MonthUtils {
    public static final Month JANUARY = new Month("January", 31, 15, 1);
    public static final Month FEBRUARY = new Month("February", 28, 20,2);
    public static final Month MARCH = new Month("March", 31, 15,3);
    public static final Month APRIL = new Month("April", 30, 20,4);
    public static final Month MAY = new Month("May", 31, 20,5);
    public static final Month JUNE = new Month("June", 30, 20,6);
    public static final Month JULY = new Month("July", 31, 20,7);
    public static final Month AUGUST = new Month("August", 31, 20,8);
    public static final Month SEPTEMBER = new Month("September", 30, 20,9);
    public static final Month OCTOBER = new Month("October", 31, 20,10);
    public static final Month NOVEMBER = new Month("November", 30, 20,11);
    public static final Month DECEMBER = new Month("December", 31, 20,12);



    public static final Month[] QUARTER1 = new Month[] {JANUARY, FEBRUARY, MARCH};
    public static final Month[] QUARTER2 = new Month[] {APRIL, MAY, JUNE};
    public static final Month[] QUARTER3 = new Month[] {JULY, AUGUST, SEPTEMBER};
    public static final Month[] QUARTER4 = new Month[] {OCTOBER, NOVEMBER, DECEMBER};

    public static Month[] HALFYEARFIRST = new Month[] {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE};
    public static Month[] HALFYEARSECOND = new Month[] {JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};


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


    public static Month[] getHalfYear(int halfNumber) {
        if (halfNumber == 1) {
            return HALFYEARFIRST;
        } else if (halfNumber == 2) {
            return HALFYEARSECOND;
        } return new Month[0];
    }
}
