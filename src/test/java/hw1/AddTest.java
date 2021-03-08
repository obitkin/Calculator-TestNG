package hw1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddTest extends AbstractBinaryOpTest {

    @Test(dataProvider = "long", groups = "SumSub")
    public void sumLongTest(long a, long b) {
        Assert.assertEquals(calculator.sum(a,b), a + b);
    }

    @Test(dataProvider = "double", groups = "SumSub")
    public void sumDoubleTest(double a, double b) {
        Assert.assertEquals(calculator.sum(a,b), a + b);
    }
}
