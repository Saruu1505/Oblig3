public class LeapYear {

    public static boolean isThisYearALeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        if (year % 4 != 0 ||year % 100 == 0 &&  year % 400 != 0 ) {
        }
        return false;
        //fdfdsfsdf
    }

}
