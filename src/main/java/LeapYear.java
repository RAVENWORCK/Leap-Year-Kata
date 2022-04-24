public class LeapYear {
    private final int year;

    public LeapYear(int year) {
        this.year=year;
    }

    public boolean isALeapYear() {
        return  year%4==0 && !(year%100==0 && year%400!=0);
    }
}
