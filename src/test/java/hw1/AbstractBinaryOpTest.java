package hw1;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public abstract class AbstractBinaryOpTest {

    @DataProvider(name = "long")
    public Object[][] createLongData() {
        return new Object[][] {
                {0L, 0L},
                {1L, -1L},
                {1L, 0L},
                {0L, 1L},
                {2L, 4L},
                {15L, 4L},
                {-2L, 4L},
        };
    }

    @DataProvider(name = "double")
    public Object[][] createDoubleData() {
        return new Object[][] {
                {0., 0.},
                {1., -1.},
                {1., 0.},
                {0., 1.},
                {2., 4.},
                {15., 4.},
                {-2., 4.},
        };
    }

    protected Calculator calculator = new Calculator();

    @Test
    public abstract void longTest(long a, long b);

    @Test
    public abstract void doubleTest(double a, double b);

}
