
import org.assertj.core.api.Assertions;
import org.assertj.core.internal.IterableElementComparisonStrategy;
import org.junit.Assert;
import org.junit.Test;

public class LeapYearTest {
    @Test
    public void is_not_leapYear_if_not_Divisible_BY_4() {
        Assert.assertFalse(leapYear(1997));
    }

    @Test
    public void is_leapYear_if_Divisible_By_4() {
        Assert.assertTrue(leapYear(1996));
    }

    @Test
    public void is_leapYear_if_Divisible_By_400() {
        Assert.assertTrue(leapYear(1600));
    }

    @Test
    public void is_not_leap_year_if_divisible_by_4_and_100_but_not_by_400() {
        Assertions.assertThat(leapYear(1800)).isFalse();
    }
    private boolean leapYear(int year){
        return new LeapYear(year).isALeapYear();
    }
}
