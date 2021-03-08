package hw1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractTest extends AbstractBinaryOpTest {

    @Test(dataProvider = "long")
    public void subLongTest(long a, long b) {
        Assert.assertEquals(calculator.sub(a,b), a - b);
    }

    @Test(dataProvider = "double")
    public void subDoubleTest(double a, double b) {
        Assert.assertEquals(calculator.sub(a,b), a - b);
    }
}
