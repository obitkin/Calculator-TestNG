package hw1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractTest extends AbstractBinaryOpTest {

    @Override
    @Test(dataProvider = "long")
    public void longTest(long a, long b) {
        Assert.assertEquals(calculator.sub(a,b), a - b);
    }

    @Override
    @Test(dataProvider = "double")
    public void doubleTest(double a, double b) {
        Assert.assertEquals(calculator.sub(a,b), a - b);
    }
}
