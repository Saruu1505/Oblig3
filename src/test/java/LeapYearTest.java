import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {

    @DisplayName("Testing if year is divisible by 4 and not by 100")
    @Test
    public void checkingIfYearIsDivisibleBy4AndNotDivisibleBy100(){
        assertEquals(true, LeapYear.isThisYearALeapYear(2000));
        assertEquals(true, LeapYear.isThisYearALeapYear(2024));
        assertEquals(true, LeapYear.isThisYearALeapYear(1648));
        assertEquals(true, LeapYear.isThisYearALeapYear(2016));
        assertTrue(LeapYear.isThisYearALeapYear(2020));

    }

    @DisplayName("Testing if year is divisible by 400")
    @Test
    public void checkingIfYearIsDivisibleBy400() {
        assertEquals(true, LeapYear.isThisYearALeapYear(2000));
        assertEquals(true, LeapYear.isThisYearALeapYear(2400));
        assertEquals(true, LeapYear.isThisYearALeapYear(1600));
        assertEquals(true, LeapYear.isThisYearALeapYear(2400));
    }
    @DisplayName("Testing if year is NOT divisible by 4")
    @Test
    public void checkingifYearIsNotDivisibleBy4(){
        assertEquals(false, LeapYear.isThisYearALeapYear(1930));
        assertEquals(false, LeapYear.isThisYearALeapYear(1990));
        assertEquals(false, LeapYear.isThisYearALeapYear(2010));

    }

    @DisplayName("Testing if year is divisible by 100 but NOT 400")
    @Test
    public void checkingIfThisYearIsDivisibleBy100ButNot400() {
        assertEquals(false, LeapYear.isThisYearALeapYear(1700));
        assertEquals(false, LeapYear.isThisYearALeapYear(2500));
        assertEquals(false, LeapYear.isThisYearALeapYear(2900));
        assertEquals(false, LeapYear.isThisYearALeapYear(3100));
    }


    @DisplayName("Testing if year is leapyear")
    @Test
    public void checkingIfYearIsLeapYear(){
        assertTrue(LeapYear.isThisYearALeapYear(2000));
        assertTrue(LeapYear.isThisYearALeapYear(2024));
        assertTrue(LeapYear.isThisYearALeapYear(2020));
        assertTrue(LeapYear.isThisYearALeapYear(2016));
    }

    @DisplayName("Testing if year is NOT leapyear")
    @Test
    public void checkingIfYearIsNotLeapYear(){
        assertFalse(LeapYear.isThisYearALeapYear(1700));
        assertFalse(LeapYear.isThisYearALeapYear(1800));
        assertFalse(LeapYear.isThisYearALeapYear(1900));
        assertFalse(LeapYear.isThisYearALeapYear(2100));
    }





}