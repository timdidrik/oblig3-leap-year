import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LeapYearTests{

    // LEAP YEAR - When it is divisible by 4, but not 100
    @ParameterizedTest
    @ValueSource(ints = {1988, 2832, 2000})
    void is_divisible_by_4_but_not_100_is_a_leap_year(int year){
        assertTrue(LeapYear.isLeapYear(year));
    }

    // LEAP YEAR - When it is divisible by 400
    @ParameterizedTest
    @ValueSource(ints ={400, 1600, 4000})
    void is_divisible_by_400_is_a_leap_year(int year){
        assertTrue(LeapYear.isLeapYear(year));
    }

    // NOT - When it is NOT divisible by 4
    @ParameterizedTest
    @ValueSource(ints ={1994, 2150})
    void is_not_divisible_by_4_is_not_a_leap_year(int year){
        assertFalse(LeapYear.isLeapYear(year));
    }

    // NOT - When it is divisible by 100, but NOT 400
    @ParameterizedTest
    @ValueSource(ints ={1500, 1900})
    void is_divisible_by_100_but_not_400_is_not_a_leap_year(int year){
        assertFalse(LeapYear.isLeapYear(year));
    }
}