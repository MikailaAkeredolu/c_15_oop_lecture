package enumerationdemo;

public enum Days {


    SUNDAY(1, 'S'), MONDAY(2,'M'), TUESDAY(3, 'T'), WEDNESDAY(4, 'W'), THURSDAY(5, 't'), FRIDAY(6, 'F'), SATURDAY(7,'s');

    private final int numberOfDay;
    private final char letter;
//
    Days(int numberOfDay, char letter) {
        this.numberOfDay = numberOfDay;
        this.letter = letter;

    }



    public int getNumberOfDay() {
        return numberOfDay;
    }
}
