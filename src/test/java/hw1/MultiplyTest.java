package hw1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplyTest extends AbstractBinaryOpTest {

    @Test(dataProvider = "long", groups = "MulDiv")
    public void mulLongTest(long a, long b) {
        Assert.assertEquals(calculator.mult(a,b), a * b);
    }

    @Test(dataProvider = "double", groups = "MulDiv")
    public void mulDoubleTest(double a, double b) {
        Assert.assertEquals(calculator.mult(a,b), a * b);
    }
}
